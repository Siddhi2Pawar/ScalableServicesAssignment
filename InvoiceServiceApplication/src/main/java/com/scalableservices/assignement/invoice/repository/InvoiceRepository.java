package com.scalableservices.assignement.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalableservices.assignement.invoice.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
