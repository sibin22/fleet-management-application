package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.VehicleMake;

public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
