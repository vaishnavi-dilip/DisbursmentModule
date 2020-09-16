package com.cjc.disbursment.repository;

import java.security.Guard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.GurrenterDetails;
@Repository
public interface GuarantorRepo extends JpaRepository<GurrenterDetails, Integer> {

}
