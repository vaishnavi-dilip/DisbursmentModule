package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.LedgerMonthlydetails;
@Repository
public interface LedgerMonthRepo extends JpaRepository<LedgerMonthlydetails, Integer>{

}
