package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.VehicleModel;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
