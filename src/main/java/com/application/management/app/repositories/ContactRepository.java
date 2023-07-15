package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.Contact;


public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
