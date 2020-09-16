package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.Bank;
@Repository
public interface BankRepo extends JpaRepository<Bank, Integer> {

}
