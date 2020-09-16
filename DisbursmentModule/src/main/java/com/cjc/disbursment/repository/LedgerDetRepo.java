package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.LedgerDetail;
@Repository
public interface LedgerDetRepo extends JpaRepository<LedgerDetail, Integer> {

}
