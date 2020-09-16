package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.Dealer;
@Repository
public interface DealerRepo extends JpaRepository<Dealer, Integer> {

}
