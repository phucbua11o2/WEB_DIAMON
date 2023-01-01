package DiamonShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.Admin.AdminColorsDao;
import DiamonShop.Entity.Colors;

@Service
public class AdminColorServiceImpl implements IAdminColorService{
	@Autowired
	private AdminColorsDao adminColorsDao;
	public List<Colors> GetAdminDataColors() {
		List<Colors> listColors = adminColorsDao.GetAdminDataColors();
		return listColors;
	}

	public int AddColors(Colors colors) {
		return adminColorsDao.AddColors(colors);
	}

	public int DeleteColors(long id) {
		return adminColorsDao.DeleteColors(id);
	}

	public int EditColor(long id, Colors colors) {
		return adminColorsDao.EditColor(id, colors);
	}

	public List<Colors> GetColorDetailByID(long id) {
		return adminColorsDao.GetColorDetailByID(id);
	}
	
}
