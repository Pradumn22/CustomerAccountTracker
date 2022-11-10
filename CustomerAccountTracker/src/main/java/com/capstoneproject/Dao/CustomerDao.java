package com.capstoneproject.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstoneproject.account.CustomerBean;

@Repository
public interface CustomerDao extends CrudRepository<CustomerBean,Integer> {
	
	Optional<CustomerBean> findByaccountNumber(long accountNumber);
    Optional<CustomerBean> deleteByAccountNumber(long accountNumber);

}
