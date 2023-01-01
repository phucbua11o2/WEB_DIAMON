package DiamonShop.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Entity.Products;

@Service
public interface IAdminProductService {
	public List<Products> GetAdminDataProducts();
	public int AddProducts(Products products);
	public int DeleteProduct(long id);
	public int EditProduct(long id,Products products);
	public List<Products> GetProductDetailByID(long id);
}
