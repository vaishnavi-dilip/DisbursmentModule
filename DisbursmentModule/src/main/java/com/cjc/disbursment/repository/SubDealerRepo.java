package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.SubDealer;
@Repository
public interface SubDealerRepo extends JpaRepository<SubDealer, Integer>{

}
