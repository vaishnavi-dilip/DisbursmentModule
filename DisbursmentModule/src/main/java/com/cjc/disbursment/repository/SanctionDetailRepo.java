package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.SanctionLetter;
@Repository
public interface SanctionDetailRepo extends JpaRepository<SanctionLetter, Integer>{

}
