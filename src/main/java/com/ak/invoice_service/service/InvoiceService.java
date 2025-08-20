package com.ak.invoice_service.service;

import com.ak.invoice_service.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}
