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
	
	@RequestMapping("/")
	public String firstPage() 
	{
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
		accrepo.save(account);
		return "firstpage.jsp";
	}
}
