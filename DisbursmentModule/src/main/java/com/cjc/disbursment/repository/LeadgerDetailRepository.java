package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.LedgerDetail;

//import com.example.demo.model.LedgerDetail;
@Repository
public interface LeadgerDetailRepository extends JpaRepository<LedgerDetail,Integer> {

}
