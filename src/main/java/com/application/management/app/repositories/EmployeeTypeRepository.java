package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.EmployeeType;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
