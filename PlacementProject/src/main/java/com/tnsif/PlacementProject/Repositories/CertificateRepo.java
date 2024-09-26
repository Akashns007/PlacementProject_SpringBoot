package com.tnsif.PlacementProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.PlacementProject.Entities.Certificate;


public interface CertificateRepo extends JpaRepository<Certificate, Long> {
}
