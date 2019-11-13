package cn.zjf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zjf.bean.Account;
import cn.zjf.service.AccountDaoService;

@Controller
public class SsmController {
	@Autowired
	private AccountDaoService ads;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("/toMain")
	public String toMain() {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(String acc_no,String acc_password,HttpServletRequest req) {
		Account acc = ads.login(acc_no, acc_password);
		if(acc != null) {
			req.getSession().setAttribute("account", acc);
			return "redirect:toMain";
		}
		req.setAttribute("msg", "登陆失败");
		return "login";
	}
}
