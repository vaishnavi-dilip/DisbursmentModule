package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.DisbursmentCreation;
@Repository
public interface DisbCreationRepo extends JpaRepository<DisbursmentCreation, Integer> {

}
