package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.demo.model.Disbursment;

@Repository
public interface DisbursmentRepository extends JpaRepository<com.cjc.disbursment.model.Disbursment, Integer>
{
}
