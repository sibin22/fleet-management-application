package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
