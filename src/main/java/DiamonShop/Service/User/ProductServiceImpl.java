package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.User.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	public ProductsDto GetProductDetailByID(long id) {
		List<ProductsDto> listProducts = productDao.GetProductDetailByID(id);
		return listProducts.get(0);
	}

	public List<ProductsDto> GetProductByIDCategory(int id) {
		return productDao.GetAllProductByID(id);
	}

	public List<ProductsDto> GetAllDataProducts() {
		List<ProductsDto> listProducts = productDao.GetAllDataProducts();
		return listProducts;
	}
	


}
