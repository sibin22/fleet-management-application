package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.VehicleMovement;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
