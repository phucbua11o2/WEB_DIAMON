package DiamonShop.Dao.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Categories;
import DiamonShop.Entity.MapperCategories;
@Repository
public class CategoriesDao extends BaseDao{
	
	public List<Categories> GetDataCategory() {
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM `categories`";
		list = _jdbcTemplate.query(sql,new MapperCategories());
		return list;
	}
}
