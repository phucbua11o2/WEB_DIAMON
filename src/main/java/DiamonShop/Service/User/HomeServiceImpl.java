package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.User.CategoriesDao;
import DiamonShop.Dao.User.MenusDao;
import DiamonShop.Dao.User.ProductsDao;
import DiamonShop.Dao.User.SlidesDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categories;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}
	@Autowired
	private CategoriesDao categoriesDao;
	public List<Categories> GetDataCategory() {
		return categoriesDao.GetDataCategory();
	}
	@Autowired
	private MenusDao menusDao;
	public List<Menus> GetDataMenu() {
		return menusDao.GetDataMenu();
	}
	@Autowired
	private ProductsDao productsDao;
	public List<ProductsDto> GetDataProduct() {
		List<ProductsDto> listProducts = productsDao.GetDataProduct();
		return listProducts;
	}
	@Autowired
	private ProductsDao newProductsDao;
	public List<ProductsDto> GetDataNewProduct() {
		List<ProductsDto> listNewProducts = newProductsDao.GetDataNewProduct();
		return listNewProducts;
	}
}
