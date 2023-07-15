package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
