package com.ak.invoice_service.exception;

public class InvoiceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public InvoiceNotFoundException() {
        super();
    }
    public InvoiceNotFoundException(String message) {

        super(message);
    }

}
