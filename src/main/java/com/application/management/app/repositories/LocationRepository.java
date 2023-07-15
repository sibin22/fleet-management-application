package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
