package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.LedgerMonthlydetails;

//import com.example.demo.model.LedgerMonthlydetails;
@Repository
public interface LeadgerMonthlyUpdateRepository extends JpaRepository<LedgerMonthlydetails,Integer> {

}
