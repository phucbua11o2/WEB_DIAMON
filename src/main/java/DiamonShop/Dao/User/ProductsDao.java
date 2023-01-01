package DiamonShop.Dao.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dto.MapperProductsDto;
import DiamonShop.Dto.ProductsDto;

@Repository
public class ProductsDao extends BaseDao {
	private final boolean YES = true;
	private final boolean NO = false;

	private StringBuilder SqlString() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_category ");
		sql.append(", p.sizes ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.title ");
		sql.append(", p.highlight ");
		sql.append(", p.new_product ");
		sql.append(", p.details ");
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.img ");
		sql.append(", p.created_at ");
		sql.append(", p.updated_at ");
		sql.append("FROM ");
		sql.append("products AS p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id = c.id_product ");
		return sql;
	}
	
	public List<ProductsDto> GetAllDataProducts() {
		String sql = SqlString().toString();
		List<ProductsDto> list = _jdbcTemplate.query(sql,new MapperProductsDto());
		return list;
	}

	private String SqlProducts(boolean newProducts, boolean highlight) {
		StringBuilder sql = SqlString();
		// sql.append("WHERE 1 = 1 ");
		if (highlight) {
			sql.append("WHERE p.highlight = true ");
		}
		if (newProducts) {
			sql.append("WHERE p.new_product = true ");
		}
		sql.append("GROUP BY p.id, c.id_product ");
		sql.append("ORDER BY RAND() ");
		if (highlight) {
			sql.append("LIMIT 6 ");
		}
		if (newProducts) {
			sql.append("LIMIT 12 ");
		}
		return sql.toString();
	}

	private StringBuilder SqlProductsByID(int id) {
		StringBuilder sql = SqlString();
		sql.append("WHERE id_category = " + id + " ");
		return sql;
	}

	private String SqlProductsPaginate(int id,int start, int totalPage) {
		StringBuilder sql = SqlProductsByID(id);
		sql.append("LIMIT " + start + ", " + totalPage + " ");
		return sql.toString();
	}

	public List<ProductsDto> GetDataProduct() {
		String sql = SqlProducts(NO, YES);
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new MapperProductsDto());
		return listProducts;
	}

	public List<ProductsDto> GetDataNewProduct() {
		String sql = SqlProducts(YES, NO);
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new MapperProductsDto());
		return listProducts;
	}

	public List<ProductsDto> GetAllProductByID(int id) {
		String sql = SqlProductsByID(id).toString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new MapperProductsDto());
		return listProducts;
	}

	public List<ProductsDto> GetDataProductPaginate(int id,int start, int totalPage) {
		StringBuilder sqlGetDataByID = SqlProductsByID(id);
		List<ProductsDto> listProductsByID = _jdbcTemplate.query(sqlGetDataByID.toString(), new MapperProductsDto());
		List<ProductsDto> listProducts = new ArrayList<ProductsDto>();
		if(listProductsByID.size()>0)
		{
			String sql = SqlProductsPaginate(id,start, totalPage);
			
			listProducts = _jdbcTemplate.query(sql, new MapperProductsDto());
		}
		return listProducts;
	}
	
	private String SqlProductDetailByID(long id) {
		StringBuilder sql = SqlString();
		sql.append("WHERE p.id = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}
	
	public List<ProductsDto> GetProductDetailByID(long id) {
		String sql = SqlProductDetailByID(id);
		List<ProductsDto> listProduct = _jdbcTemplate.query(sql, new MapperProductsDto());
		return listProduct;
	}
	
	public ProductsDto findProductByID(long id) {
		String sql = SqlProductDetailByID(id);
		ProductsDto Product = _jdbcTemplate.queryForObject(sql, new MapperProductsDto());
		return Product;
	}
}
