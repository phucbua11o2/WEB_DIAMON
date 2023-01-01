package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductsDto;

@Service
public interface IProductService {
	public ProductsDto GetProductDetailByID(long id);
	public List<ProductsDto> GetProductByIDCategory(int id);
	public List<ProductsDto> GetAllDataProducts();
	
}
