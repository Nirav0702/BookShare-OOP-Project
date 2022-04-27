package com.example.BookShare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.dao.BookRepo;
import com.example.BookShare.dao.RequestRepo;
import com.example.BookShare.model.Book;
import com.example.BookShare.model.Request;

@Controller
public class RequestController 
{
	@Autowired
	BookRepo bookrepo;
	RequestRepo requestrepo;
	
	@RequestMapping("/borrowThisBook")
	@ResponseBody
	public ModelAndView borrowThisBook(@RequestParam("bookId")int bookId) 
	{
		Book selectedbook = bookrepo.findByBookId(bookId);
		ModelAndView modelAndView = new ModelAndView("validaterequest.jsp");
		modelAndView.addObject("selectedbook", selectedbook);
	    return modelAndView;
	}
	
	@RequestMapping("/confirmBorrow")
	@ResponseBody
	public ModelAndView confirmBorrow(Request request, @RequestParam("duration") int duration, @RequestParam("ownerName") String ownerName, @RequestParam("borrowerName") String borrowerName, @RequestParam("bookId") int bookId)
	{
		request.setBookId(bookId);
		request.setOwnerName(ownerName);
		request.setBorrowerName(borrowerName);
		request.setDuration(duration);
		request.setBorrowTime("N/A");
		request.setRequestTime("N/A");
		request.setStatus("Not Available");
		requestrepo.save(request);
		ModelAndView modelAndView = new ModelAndView("zeroentries.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/cancelBorrow")
	@ResponseBody
	public ModelAndView cancelBorrow(@RequestParam("ownerName")String ownerName)
	{
		ModelAndView modelAndView = new ModelAndView("dashboard.jsp");
		modelAndView.addObject("userName", ownerName);
		return modelAndView;
	}
}
