package com.tnsif.PlacementProject.Controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.PlacementProject.Entities.Certificate;
import com.tnsif.PlacementProject.Services.CertificateService;

@RestController
public class CertificateController {
	
	 @Autowired
	    private CertificateService certificateService;

	    // Get all certificates
	    @GetMapping("/certificates")
	    public List<Certificate> getAllCertificates() {
	        return certificateService.getAllCertificates();
	    }

	    // Get a certificate by ID
	    @GetMapping("/certificates/{id}")
	    public ResponseEntity<Certificate> getCertificateById(@PathVariable Long id) {
	        try {
	            Certificate certificate = certificateService.getCertificateById(id);
	            return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
	        }
	    }

	    // Create a new certificate
	    @PostMapping("/certificates")
	    public ResponseEntity<Certificate> createCertificate(@RequestBody Certificate certificate) {
	        Certificate savedCertificate = certificateService.saveCertificate(certificate);
	        return ResponseEntity.created(null).body(savedCertificate);
	    }

	    // Update a certificate
	    @PutMapping("/certificates/{id}")
	    public ResponseEntity<Certificate> updateCertificate(@PathVariable Long id, @RequestBody Certificate certificate) {
	        try {
	            Certificate existingCertificate = certificateService.getCertificateById(id);
	            certificate.setCertificateId(id); // Set the ID explicitly for update
	            certificateService.saveCertificate(certificate);
	            return ResponseEntity.ok(certificate);
	        } catch (NoSuchElementException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    // Delete a certificate by ID
	    @DeleteMapping("/certificates/{id}")
	    public ResponseEntity<Void> deleteCertificate(@PathVariable Long id) {
	        try {
	            certificateService.deleteCertificateById(id);
	            return ResponseEntity.noContent().build();
	        } catch (NoSuchElementException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @ExceptionHandler(NoSuchElementException.class)
	    public ResponseEntity<String> handleCertificateNotFoundException(NoSuchElementException ex) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	    }
}
