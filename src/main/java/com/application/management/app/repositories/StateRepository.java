package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
