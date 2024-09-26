package com.tnsif.PlacementProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementProject.Entities.Certificate;
import com.tnsif.PlacementProject.Repositories.CertificateRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService {
	
	@Autowired
    private CertificateRepo certificateRepository;

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    public Certificate getCertificateById(Long id) {
        return certificateRepository.findById(id).orElse(null);
    }

    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public void deleteCertificateById(Long id) {
        certificateRepository.deleteById(id);
    }
}
