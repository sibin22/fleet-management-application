package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
