package DiamonShop.Dao.Admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dao.User.BaseDao;
import DiamonShop.Entity.Colors;
import DiamonShop.Entity.MapperColors;

@Repository
public class AdminColorsDao extends BaseDao{
	private StringBuilder SqlString() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM `colors` ");
		return sql;
	}
	public List<Colors> GetAdminDataColors() {
		String sql = SqlString().toString();
		List<Colors> list = _jdbcTemplate.query(sql,new MapperColors());
		return list;
	}
	public int AddColors(Colors colors) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO `colors` ");
		sql.append("( ");
		sql.append("`id_product`, `name`, `code`, `img` ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append(""+colors.getId_product()+", ");
		sql.append("'"+colors.getName()+"', ");
		sql.append("'"+colors.getCode()+"', ");
		sql.append("'"+colors.getImg()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	public int DeleteColors(long id) {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM `colors` WHERE id_product="+id);
		int delete = _jdbcTemplate.update(sql.toString());
		return delete;
	}
	public int EditColor(long id,Colors colors) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE `colors` ");
		sql.append("SET ");
		sql.append("`id_product`='"+colors.getId_product()+"', ");
		sql.append("`name`='"+colors.getName()+"', ");
		sql.append("`code`='"+colors.getCode()+"', ");
		sql.append("`img`='"+colors.getImg()+"' ");
		sql.append("WHERE id= "+id+" ");
		int update = _jdbcTemplate.update(sql.toString());
		return update;
	}
	public String findColorByID(long id)
	{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM `colors` WHERE id="+id);
		return sql.toString();
	}
	public List<Colors> GetColorDetailByID(long id) {
		String sql = findColorByID(id);
		List<Colors> listProduct = _jdbcTemplate.query(sql, new MapperColors());
		return listProduct;
	}
}
