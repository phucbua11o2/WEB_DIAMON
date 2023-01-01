package DiamonShop.Dao.Admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dao.User.BaseDao;
import DiamonShop.Dto.MapperProductsDto;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.MapperProducts;
import DiamonShop.Entity.Products;

@Repository
public class AdminProductsDao extends BaseDao{
	public int AddProducts(Products products) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO `products` ");
		sql.append("( ");
		sql.append("`id_category`, `sizes`, `name`, `price`, `sale`, `title`, `highlight`, `new_product`, `details`, `created_at`, `updated_at` ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("'"+products.getId_category()+"', ");
		sql.append("'"+products.getSizes()+"', ");
		sql.append("'"+products.getName()+"', ");
		sql.append("'"+products.getPrice()+"', ");
		sql.append("'"+products.getSale()+"', ");
		sql.append("'"+products.getTitle()+"', ");
		sql.append(""+products.isHighlight()+", ");
		sql.append(""+products.isNew_product()+", ");
		sql.append("'"+products.getDetails()+"', ");
		sql.append("'"+products.getCreated_at()+"', ");
		sql.append("'"+products.getUpdated_at()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	private StringBuilder SqlString() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM `products` ");
		return sql;
	}
	public List<Products> GetAdminDataProducts() {
		String sql = SqlString().toString();
		List<Products> list = _jdbcTemplate.query(sql,new MapperProducts());
		return list;
	}
	public int DeleteProduct(long id) {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM `products` WHERE id="+id);
		int delete = _jdbcTemplate.update(sql.toString());
		return delete;
	}
	public int EditProduct(long id,Products products) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE `products` ");
		sql.append("SET ");
		sql.append("`id_category`="+products.getId_category()+", ");
		sql.append("`sizes`='"+products.getSizes()+"', ");
		sql.append("`name`='"+products.getName()+"', ");
		sql.append("`price`='"+products.getPrice()+"', ");
		sql.append("`sale`='"+products.getSale()+"', ");
		sql.append("`title`='"+products.getTitle()+"', ");
		sql.append("`highlight`="+products.isHighlight()+", ");
		sql.append("`new_product`="+products.isNew_product()+", ");
		sql.append("`details`='"+products.getDetails()+"', ");
		sql.append("`created_at`='"+products.getCreated_at()+"', ");
		sql.append("`updated_at`='"+products.getUpdated_at()+"' ");
		sql.append("WHERE id= "+id+" ");
		int update = _jdbcTemplate.update(sql.toString());
		return update;
	}
	public String findProductByID(long id)
	{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM `products` WHERE id="+id);
		return sql.toString();
	}
	public List<Products> GetProductDetailByID(long id) {
		String sql = findProductByID(id);
		List<Products> listProduct = _jdbcTemplate.query(sql, new MapperProducts());
		return listProduct;
	}
}
