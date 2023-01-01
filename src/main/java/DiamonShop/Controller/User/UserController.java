package DiamonShop.Controller.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Users;
import DiamonShop.Service.User.AccountServiceImpl;

@Controller
public class UserController extends BaseController{
	@Autowired
	AccountServiceImpl accountService= new AccountServiceImpl();
	
	@RequestMapping(value = "/dang-ky",method = RequestMethod.GET)
	public ModelAndView dangKy()
	{
		_mvShare.addObject("categories",_homeService.GetDataCategory());
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("users", new Users());
		
		return _mvShare;
	}
	
	@RequestMapping(value = "/dang-ky",method = RequestMethod.POST)
	public ModelAndView taoTaiKhoan(@ModelAttribute("users") Users users)
	{
		int count = accountService.AddAccount(users);
		if(count>0)
		{
			_mvShare.addObject("status", "Đăng ký tài khoản thành công");
		}
		else
		{
			_mvShare.addObject("status", "Đăng ký tài khoản thất bại");
		}
	//	_mvShare.addObject("status", true);
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}
	@RequestMapping(value = "/dang-nhap",method = RequestMethod.POST)
	public ModelAndView dangNhap(HttpSession session,@ModelAttribute("users") Users users)
	{
		users = accountService.CheckAccount(users);
		if(users!=null)
		{
			_mvShare.setViewName("redirect:trang-chu");
			session.setAttribute("loginInfo", users);
		}
		else
		{
			_mvShare.addObject("statusLogin", "Đăng nhập tài khoản thất bại");
		}
		
		return _mvShare;
	}
	@RequestMapping(value = "/dang-xuat",method = RequestMethod.GET)
	public String dangNhap(HttpSession session,HttpServletRequest request)
	{
		session.removeAttribute("loginInfo");
		return "redirect:"+request.getHeader("Referer"); 
	}
}
