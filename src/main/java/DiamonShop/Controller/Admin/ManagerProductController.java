package DiamonShop.Controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Products;
import DiamonShop.Service.Admin.AdminColorServiceImpl;
import DiamonShop.Service.Admin.AdminProductServiceImpl;

@Controller
public class ManagerProductController extends BaseAdminController{
	@Autowired
	private AdminProductServiceImpl adminProductService;
	@Autowired
	private AdminColorServiceImpl adminColorService;
	
	@RequestMapping(value = "quanlysanpham")
	public ModelAndView AdminAllProduct()
	{
		_mvShare.setViewName("admin/products/manager");
		_mvShare.addObject("products",adminProductService.GetAdminDataProducts());
		return _mvShare;
	}
	
	@RequestMapping(value = "them-san-pham", method = RequestMethod.GET)
	public ModelAndView AdminAddProduct(HttpServletRequest request,HttpSession session)
	{
		_mvShare.setViewName("admin/products/add-product");
		_mvShare.addObject("products", new Products());
		return _mvShare;
	}
	
	@RequestMapping(value = "them-san-pham", method = RequestMethod.POST)
	public String AdminAddProduct(HttpServletRequest request,HttpSession session,@ModelAttribute("products") Products products)
	{
		adminProductService.AddProducts(products);
		return "redirect:quanlysanpham";
	}
	@RequestMapping(value = "xoa-san-pham/{id}")
	public String AdminDeleteProduct(HttpServletRequest request,HttpSession session,@ModelAttribute("products") Products products,@PathVariable long id)
	{
		adminProductService.DeleteProduct(id);
		adminColorService.DeleteColors(id);
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "sua-san-pham/{id}", method = RequestMethod.GET)
	public ModelAndView AdminEditProduct(@PathVariable long id)
	{
		_mvShare.setViewName("admin/products/edit-product");
		_mvShare.addObject("products", adminProductService.GetProductDetailByID(id).get(0));
		return _mvShare;
	}
	
	@RequestMapping(value = "sua-san-pham/{id}",method = RequestMethod.POST)
	public String AdminEditProduct(HttpServletRequest request,HttpSession session,@ModelAttribute("products") Products products,@PathVariable long id)
	{
		products.setId(id);
		adminProductService.EditProduct(id,products);
		return "redirect:/quanlysanpham";
	}
}
