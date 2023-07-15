package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
