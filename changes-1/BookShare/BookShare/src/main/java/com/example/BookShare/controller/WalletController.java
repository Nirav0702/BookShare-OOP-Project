package com.bookshare.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bookshare.app.dao.WalletRepo;
import com.bookshare.app.model.Book;
import com.bookshare.app.model.Wallet;

@Controller
public class WalletController {
	@Autowired
	WalletRepo walletrepo;
	
	@RequestMapping("/signUp")
	public String addWallet(Wallet wallet, @RequestParam("userName")String userName) 
	{
		wallet.setBalance(0);
		wallet.setMoneyOwed(0);
		wallet.setTotalDues(0);
		wallet.setUserName(userName);
		//System.out.println(userName);
		walletrepo.save(wallet);
		return "wallet.jsp";
	}
	
	@RequestMapping("/viewWallet")
	public ModelAndView searchBook(@RequestParam("userName")String userName) 
	{
		List<Wallet> wallet = walletrepo.findByuserName(userName);
	    ModelAndView modelAndView = new ModelAndView("wallet.jsp");
	    modelAndView.addObject("wallet", wallet);
	    return modelAndView;
	}
}
