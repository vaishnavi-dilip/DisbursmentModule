package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.Cibil;

@Repository
public interface CibilRepo extends JpaRepository<Cibil, Integer> {

}
