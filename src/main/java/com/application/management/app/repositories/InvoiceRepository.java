package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
