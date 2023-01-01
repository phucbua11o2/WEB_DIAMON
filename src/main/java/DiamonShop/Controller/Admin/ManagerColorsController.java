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

import DiamonShop.Entity.Colors;
import DiamonShop.Service.Admin.AdminColorServiceImpl;
@Controller
public class ManagerColorsController extends BaseAdminController{
	@Autowired
	private AdminColorServiceImpl adminColorService;
	@RequestMapping(value = "quanlyhinhanh")
	public ModelAndView AdminAllColors()
	{
		_mvShare.setViewName("admin/colors/colors");
		_mvShare.addObject("colors",adminColorService.GetAdminDataColors());
		return _mvShare;
	}
	
	@RequestMapping(value = "them-hinh-anh", method = RequestMethod.GET)
	public ModelAndView AdminAddColor(HttpServletRequest request,HttpSession session)
	{
		_mvShare.setViewName("admin/colors/add-color");
		_mvShare.addObject("colors", new Colors());
		return _mvShare;
	}
	
	@RequestMapping(value = "them-hinh-anh", method = RequestMethod.POST)
	public String AdminAddColor(HttpServletRequest request,HttpSession session,@ModelAttribute("colors") Colors colors)
	{
		adminColorService.AddColors(colors);
		return "redirect:quanlyhinhanh";
	}
	@RequestMapping(value = "sua-hinh-anh/{id}", method = RequestMethod.GET)
	public ModelAndView AdminEditColor(@PathVariable long id)
	{
		_mvShare.setViewName("admin/colors/edit-color");
		_mvShare.addObject("colors", adminColorService.GetColorDetailByID(id).get(0));
		return _mvShare;
	}
	
	@RequestMapping(value = "sua-hinh-anh/{id}",method = RequestMethod.POST)
	public String AdminEditColor(HttpServletRequest request,HttpSession session,@ModelAttribute("colors") Colors colors,@PathVariable long id)
	{
		adminColorService.EditColor(id, colors);
		return "redirect:/quanlyhinhanh";
	}
}
