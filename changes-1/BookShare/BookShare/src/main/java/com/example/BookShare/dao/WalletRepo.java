package com.example.BookShare.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BookShare.model.Account;
import com.example.BookShare.model.Wallet;

@Repository
public interface WalletRepo extends CrudRepository<Wallet, Integer>
{
	Wallet findByUserName(String userName);
}