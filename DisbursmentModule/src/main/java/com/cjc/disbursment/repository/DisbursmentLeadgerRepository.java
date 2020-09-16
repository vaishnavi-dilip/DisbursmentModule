package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.demo.model.DisbursmentLeadger;
@Repository
public interface DisbursmentLeadgerRepository extends JpaRepository<com.cjc.disbursment.model.DisbursmentLeadger,Integer> {

}
