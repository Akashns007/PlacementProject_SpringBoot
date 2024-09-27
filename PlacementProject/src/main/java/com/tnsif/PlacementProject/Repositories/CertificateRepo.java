package com.tnsif.PlacementProject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tnsif.PlacementProject.Entities.Certificate;


public interface CertificateRepo extends JpaRepository<Certificate, Long> {
}
