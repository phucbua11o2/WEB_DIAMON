package DiamonShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.Admin.AdminProductsDao;
import DiamonShop.Entity.Products;
@Service
public class AdminProductServiceImpl implements IAdminProductService{
	@Autowired
	private AdminProductsDao adminProductDao;
	
	public List<Products> GetAdminDataProducts()
	{
		List<Products> listProducts = adminProductDao.GetAdminDataProducts();
		return listProducts;
	}
	
	public int AddProducts(Products products) {
		return adminProductDao.AddProducts(products);
	}

	public int DeleteProduct(long id) {
		return adminProductDao.DeleteProduct(id);
	}

	public int EditProduct(long id,Products products) {
		return adminProductDao.EditProduct(id,products);
	}

	public List<Products> GetProductDetailByID(long id) {
		return adminProductDao.GetProductDetailByID(id);
	}
	
}
