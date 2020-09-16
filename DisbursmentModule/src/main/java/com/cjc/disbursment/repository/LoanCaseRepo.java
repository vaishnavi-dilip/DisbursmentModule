package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.LoanCase;
@Repository
public interface LoanCaseRepo extends JpaRepository<LoanCase, Integer>{

}
