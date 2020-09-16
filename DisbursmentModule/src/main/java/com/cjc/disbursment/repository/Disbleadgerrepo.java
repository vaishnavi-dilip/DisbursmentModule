package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.DisbursmentLeadgerDetails;
@Repository
public interface Disbleadgerrepo extends JpaRepository<DisbursmentLeadgerDetails, Integer>{

}
