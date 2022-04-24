package com.example.BookShare.dao;

import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.BookShare.model.Account;

public interface AccountRepo extends CrudRepository<Account, Integer>
{
  Account findByUserName(String userName);
}
