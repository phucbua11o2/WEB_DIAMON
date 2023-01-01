package DiamonShop.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Entity.Colors;

@Service
public interface IAdminColorService {
	public List<Colors> GetAdminDataColors();
	public int AddColors(Colors colors);
	public int DeleteColors(long id);
	public int EditColor(long id,Colors colors);
	public List<Colors> GetColorDetailByID(long id);
}
