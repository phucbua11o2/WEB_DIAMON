package DiamonShop.Dao.User;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import DiamonShop.Entity.MapperUsers;
import DiamonShop.Entity.Users;

@Repository
public class UsersDao  extends BaseDao{
	public int AddAccount(Users users) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO users ");
		sql.append("( ");
		sql.append("	user, ");
		sql.append("	password, ");
		sql.append("	display_name, ");
		sql.append("	address, ");
		sql.append("	phone ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'"+users.getUser()+"', ");
		sql.append("	'"+users.getPassword()+"', ");
		sql.append("	'"+users.getDisplay_name()+"', ");
		sql.append("	'"+users.getAddress()+"', ");
		sql.append("	'"+users.getPhone()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString()); 
		return insert;
	}
	public Users GetUserByACC(Users users) {
		String sql = "SELECT * FROM users WHERE user = '"+users.getUser()+"'";
		Users result = (Users) _jdbcTemplate.queryForObject(sql,new MapperUsers());
		return result;
	}
}
