package com.application.management.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.management.app.models.Country;
import com.application.management.app.repositories.CountryRepository;

@Service
public class CountryService {
	
@Autowired
private CountryRepository countryRepository;

	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(Integer id) {
		return countryRepository.findById(id);
	}	
}
