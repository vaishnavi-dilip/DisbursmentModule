package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.LoanDetails;
@Repository
public interface LoanDetailsRepo extends JpaRepository<LoanDetails, Integer>{

}
