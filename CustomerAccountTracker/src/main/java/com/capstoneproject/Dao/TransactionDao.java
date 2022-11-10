package com.capstoneproject.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.capstoneproject.account.TransactionBean;

@Repository
public interface TransactionDao extends CrudRepository<TransactionBean, Integer> {
	
	

}