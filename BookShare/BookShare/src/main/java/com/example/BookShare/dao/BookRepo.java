package com.example.BookShare.dao;

import org.springframework.web.servlet.ModelAndView;

import com.example.BookShare.model.Account;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.BookShare.model.Book;

public interface BookRepo extends CrudRepository<Book, Integer>
{

}
