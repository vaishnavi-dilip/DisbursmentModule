package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.disbursment.model.CaseNumber;
//import com.cjc.disbursment.model.Casenumber;

public interface CaseNumberRepository extends JpaRepository<CaseNumber, Integer>{

}
