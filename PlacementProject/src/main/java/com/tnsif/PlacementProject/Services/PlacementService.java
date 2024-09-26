package com.tnsif.PlacementProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementProject.Entities.Placement;
import com.tnsif.PlacementProject.Repositories.PlacementRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
    private PlacementRepo placementRepository;

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public void deletePlacementById(Long id) {
        placementRepository.deleteById(id);
    }
	

	    
}
