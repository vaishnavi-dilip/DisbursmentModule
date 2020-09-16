package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.Tenure;
@Repository
public interface TenureRepo extends JpaRepository<Tenure, Integer> {

}
