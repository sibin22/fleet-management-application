package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.management.app.models.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
