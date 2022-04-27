package com.example.BookShare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.dao.BookRepo;
import com.example.BookShare.model.Book;
//import com.example.BookShare.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookRepo bookrepo;

	@RequestMapping("/addBook")
	public ModelAndView addBook(Book book, @RequestParam("userName")String userName) 
	{
		book.setAvailability(true);
		book.setOwnerName(userName);
		book.setBorrowerName("N/A");
		book.setTimeBorrowed("N/A");
		book.setTimereturned("N/A");
		book.setBoookIdCopy(book.getBookId());
		bookrepo.save(book);
		ModelAndView modelAndView = new ModelAndView("dashboard.jsp");
	    modelAndView.addObject("userName", userName);
	    return modelAndView;
	}
	
	@RequestMapping("/searchBook")
	public ModelAndView searchBook(@RequestParam("bookTitle")String bookTitle) 
	{
		List<Book> searchedbooks = bookrepo.findAllByBookTitle(bookTitle);
	    ModelAndView modelAndView = new ModelAndView("searchbook.jsp");
	    modelAndView.addObject("searchedbooks", searchedbooks);
	    return modelAndView;
	}
	
	@RequestMapping("/ownedBooks")
	public ModelAndView ownedBooks(@RequestParam("userName")String userName) 
	{
		List<Book> ownedbooks = bookrepo.findAllByOwnerName(userName);
	    ModelAndView modelAndView = new ModelAndView("ownedbooks.jsp");
	    modelAndView.addObject("ownedbooks", ownedbooks);
	    return modelAndView;
	}
	
	@RequestMapping("/borrowedBooks")
	public ModelAndView borrowedBooks(@RequestParam("userName")String userName) 
	{
	    List<Book> borrowedbooks = bookrepo.findAllByBorrowerName(userName);
	    ModelAndView modelAndView = new ModelAndView("borrowedbooks.jsp");
	    modelAndView.addObject("borrowedbooks", borrowedbooks);
	    return modelAndView;
	}
	
	
	
}
