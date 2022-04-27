package com.example.BookShare.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BookShare.model.Account;
import com.example.BookShare.model.Request;

@Repository
public interface RequestRepo extends CrudRepository<Request, Integer>
{

	List<Request> findByOwnerName(String ownerName);
	
}