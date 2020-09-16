package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.EMIDetails;
@Repository
public interface EmiRepo extends JpaRepository<EMIDetails, Integer> {

}
