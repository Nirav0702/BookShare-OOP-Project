package com.example.BookShare.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.dao.AccountRepo;
import com.example.BookShare.model.Account;

@Controller
public class WebpageController 
{
	@Autowired
	AccountRepo accrepo;
	BookRepo bookrepo;
	
	@RequestMapping("/")
	public String firstPage() 
	{
		Account ac1 = new Account(1,  "Nirav1","parmar","9999999999","nirav@g.com","Gujarat","Admin");
		accrepo.save(ac1);
		
		Account ac2 = new Account(2, "Nairr", "nair", "8888888888", "demon@g.com","Kerela","User");
		accrepo.save(ac2);
		
		return "firstpage.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() 
	{
		return "login.jsp";
	}
	
	@RequestMapping("/signUp")
	public String signUpPage() 
	{
		return "signup.jsp";
	}
	
	@RequestMapping("/addUser")
	public String addUser(Account account) 
	{
		account.setUserType("User");
		accrepo.save(account);
		return "firstpage.jsp";
	}
	
	@RequestMapping("/userHome")
	public String userHome(@RequestParam("uname")String userName, @RequestParam("psw")String password) 
	{

		
		Account ac = accrepo.findByUserName(userName);
		
		if(ac == null) {
			return "login-invalid.jsp";
		} else {
			if(ac.getPassword().equals(password)) {
				return "dashboard.jsp";
			} else {
				return "login-invalid.jsp";
			}
			
		}
	}
	@RequestMapping("/xyz")
	public String xyz() 
	{
		return "addbook.jsp";
	}
}
