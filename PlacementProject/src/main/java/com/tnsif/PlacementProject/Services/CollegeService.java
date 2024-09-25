package com.tnsif.PlacementProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementProject.Entities.College;
import com.tnsif.PlacementProject.Repositories.CollegeRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {

    @Autowired
    private CollegeRepo collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    public void deleteCollegeById(Long id) {
        collegeRepository.deleteById(id);
    }
}
