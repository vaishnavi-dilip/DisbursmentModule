package com.cjc.disbursment.controller;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Customer;
import com.cjc.disbursment.service.ServiceI;
import com.itextpdf.text.DocumentException;

@RestController
@RequestMapping("/api/pdf")
@CrossOrigin("*")
public class CustomerPDFRestAPIs {
	@Autowired
	private ServiceI service;
	
    @GetMapping(value = "/customers/{customerid}",
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> customerReport(@PathVariable ("customerid") int id) throws FileNotFoundException,DocumentException  {
        Customer customers = service.getCustomerByPDFId(id);

        ByteArrayInputStream bis = PDFGenerator.customerPDFReport(customers);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=customers.pdf");
        System.out.println("getted succesfully");
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
}