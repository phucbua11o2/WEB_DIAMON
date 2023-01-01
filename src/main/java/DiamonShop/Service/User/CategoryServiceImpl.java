package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.User.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	private ProductsDao productsDao;
	
	public List<ProductsDto> GetDataAllProductByID(int id) {
		List<ProductsDto> products = productsDao.GetAllProductByID(id);
		return products;
	}
	
	public List<ProductsDto> GetDataProductPaginate(int id,int start, int totalPage) {
		List<ProductsDto> products = productsDao.GetDataProductPaginate(id,start, totalPage);
		return products;
	}
	
}
