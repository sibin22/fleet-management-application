package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.VehicleStatus;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
