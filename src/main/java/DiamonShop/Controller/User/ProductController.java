package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.HomeServiceImpl;
import DiamonShop.Service.User.ProductServiceImpl;

@Controller
public class ProductController extends BaseController{
	@Autowired
	ProductServiceImpl _productService;
	
	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable long id)
	{
		_mvShare.setViewName("user/products/detail");
		_mvShare.addObject("categories",_homeService.GetDataCategory());
		_mvShare.addObject("product",_productService.GetProductDetailByID(id));
		_mvShare.addObject("productByIDCategory",_productService.GetProductByIDCategory(_productService.GetProductDetailByID(id).getId_category()));
		return _mvShare;
	}
	
	@RequestMapping(value = {"all-product"})
	public ModelAndView AllProduct()
	{
		_mvShare.setViewName("user/products/all-product");
		_mvShare.addObject("product",_productService.GetAllDataProducts());
		return _mvShare;
	}
}
