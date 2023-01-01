package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperColors implements RowMapper<Colors>{

	public Colors mapRow(ResultSet rs, int rowNum) throws SQLException {
		Colors colors = new Colors();
		colors.setId(rs.getLong("id"));
		colors.setId_product(rs.getLong("id_product"));
		colors.setName(rs.getString("name"));
		colors.setCode(rs.getString("code"));
		colors.setImg(rs.getString("img"));
		return colors;
	}
	
}
