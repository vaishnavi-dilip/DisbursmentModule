package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.VehicleDetails;
@Repository
public interface VehicleRepo extends JpaRepository<VehicleDetails, Integer>{

}
