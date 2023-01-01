package DiamonShop.Dao.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DiamonShop.Dto.CartDto;
import DiamonShop.Dto.ProductsDto;
@Repository
public class CartDao extends BaseDao{
	@Autowired
	ProductsDao productDao = new ProductsDao();
	public HashMap<Long, CartDto> AddCart(long id,HashMap<Long, CartDto> cart)
	{
		CartDto itemCart = new CartDto();
		ProductsDto product = productDao.findProductByID(id);
		if(product!=null && cart.containsKey(id))
		{
			itemCart = cart.get(id);			
			itemCart.setQuantity(itemCart.getQuantity()+1);
			itemCart.setTotalPrice(itemCart.getQuantity()* itemCart.getProduct().getPrice());
		}
		else
		{
			itemCart.setProduct(product);
			itemCart.setQuantity(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	public HashMap<Long, CartDto> EditCart(long id,int quantity,HashMap<Long, CartDto> cart)
	{
		if(cart==null)
		{
			return cart;
		}
		CartDto itemCart = new CartDto();
		if(cart.containsKey(id))
		{
			itemCart= cart.get(id);
			itemCart.setQuantity(quantity);
			itemCart.setTotalPrice(quantity* itemCart.getProduct().getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	public HashMap<Long, CartDto> DeleteCart(long id,HashMap<Long, CartDto> cart)
	{
		if(cart==null)
		{
			return cart;
		}
		if(cart.containsKey(id))
		{
			cart.remove(id);
		}
		return cart;
	}
	public int totalQuantity(HashMap<Long, CartDto> cart)
	{
		int total = 0; 
		for(Map.Entry<Long, CartDto> itemCart : cart.entrySet())
		{
			total+=itemCart.getValue().getQuantity();
		}
		return total;
	}
	public double totalPrice(HashMap<Long, CartDto> cart)
	{
		double total = 0; 
		for(Map.Entry<Long, CartDto> itemCart : cart.entrySet())
		{
			total+=itemCart.getValue().getTotalPrice();
		}
		return total;
	}
}
