package com.example.BookShare.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.dao.AccountRepo;
import com.example.BookShare.dao.BookRepo;
import com.example.BookShare.dao.RequestRepo;
import com.example.BookShare.dao.WalletRepo;
import com.example.BookShare.model.Account;
import com.example.BookShare.model.Book;
import com.example.BookShare.model.Request;
import com.example.BookShare.model.Wallet;

@Controller
public class WebpageController 
{
	@Autowired
	AccountRepo accrepo;
	BookRepo bookrepo;
	WalletRepo walletrepo;
	RequestRepo requestrepo;
	
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
//		Wallet wallet = new Wallet();
//		wallet.setUserName(account.getUserName());
//		wallet.setBalance(0);
//		wallet.setMoneyOwed(0);
//		wallet.setTotalDues(0);
//		wallet.setBookId(0);
//		walletrepo.save(wallet);
//		System.out.println("Wallet Created");
		return "firstpage.jsp";
	}
	
	@RequestMapping("/userHome")
	public ModelAndView userHome(@RequestParam("uname")String userName, @RequestParam("psw")String password) 
	{

		
		Account ac = accrepo.findByUserName(userName);
		
		if(ac == null) {
			return new ModelAndView("login-invalid.jsp");
		} else {
			if(ac.getPassword().equals(password)) {
				ModelAndView modelAndView = new ModelAndView("dashboard.jsp");
			    modelAndView.addObject("userName", userName);
			    return modelAndView;
			} else {
				return new ModelAndView("login-invalid.jsp");
			}
			
		}
	}
	@RequestMapping("/xyz")
	public ModelAndView xyz(@RequestParam("userName")String userName) 
	{
		ModelAndView modelAndView = new ModelAndView("addbook.jsp");
	    modelAndView.addObject("userName", userName);
	    return modelAndView;
	}
	
	@RequestMapping("/userprofile")
	public ModelAndView userProfilePage(@RequestParam("userName")String userName) 
	{
		Account ac = accrepo.findByUserName(userName);
		ModelAndView modelAndView = new ModelAndView("userprofile.jsp");
	    modelAndView.addObject("userName", ac.getUserName());
	    modelAndView.addObject("userEmail", ac.getEmail());
	    modelAndView.addObject("userAddress",ac.getAddress() );
	    modelAndView.addObject("userPhoneNumber", ac.getPhoneNumber());
	    return modelAndView;
	}
	
//	@RequestMapping("/userwallet")
//	public ModelAndView userWalletPage(@RequestParam("userName")String userName) 
//	{
//		Wallet wa = walletrepo.findByUserName(userName);
//		ModelAndView modelAndView = new ModelAndView("userprofile.jsp");
//	    modelAndView.addObject("userName", wa.getUserName());
//	    modelAndView.addObject("balance", wa.getBalance());
//	    modelAndView.addObject("moneyOwed",wa.getMoneyOwed());
//	    modelAndView.addObject("totalDues", wa.getTotalDues());
//	    return modelAndView;
//	}
	
	
	
	
	@RequestMapping("/toChangePass")
	public ModelAndView toChangePass(@RequestParam("userName")String userName) 
	{
		ModelAndView modelAndView = new ModelAndView("changepass.jsp");
	    modelAndView.addObject("userName", userName);
	    return modelAndView;
	}
	
	@RequestMapping("/changePass")
	public ModelAndView userProfilePage(@RequestParam("userName")String userName, @RequestParam("userPass")String userPass, @RequestParam("userPassConfirm")String userPassConfirm) 
	{
		Account ac = accrepo.findByUserName(userName);
		if(userPass == userPassConfirm) {
			ac.setPassword(userPassConfirm);
		}
//		accrepo.saveOrUpdate(ac);
		ModelAndView modelAndView = new ModelAndView("userprofile.jsp");
	    modelAndView.addObject("userName", ac.getUserName());
	    modelAndView.addObject("userEmail", ac.getEmail());
	    modelAndView.addObject("userAddress",ac.getAddress() );
	    modelAndView.addObject("userPhoneNumber", ac.getPhoneNumber());
	    return modelAndView;
	}
	
	@RequestMapping("/requests")
	public ModelAndView ownedRequests(@RequestParam("userName")String ownerName) 
	{
		List<Request> requests = requestrepo.findByOwnerName(ownerName);
		ModelAndView modelAndView = new ModelAndView("requests.jsp");
		modelAndView.addObject("requests", requests);
	    return modelAndView;
	}
	
}
