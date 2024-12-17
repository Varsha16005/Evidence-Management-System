package com.example.Evi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvidenceService {
    @Autowired
    private EvidenceRepository evidenceRepository;

    public List<Evidence> getAllEvidences() {
        return evidenceRepository.findAll();
    }

    public Optional<Evidence> getEvidenceById(Long id) {
        return evidenceRepository.findById(id);
    }

    public Evidence addEvidence(Evidence evidence) {
        return evidenceRepository.save(evidence);
    }

//    public Evidence updateEvidence(Long id, Evidence evidenceDetails) {
//        Evidence evidence = evidenceRepository.findById(id).orElseThrow(() -> new RuntimeException("Evidence not found"));
//        evidence.setName(evidenceDetails.getName());
//        evidence.setAge(evidenceDetails.getAge());
//        evidence.setEvidence(evidenceDetails.getEvidence());
//  
//        return evidenceRepository.save(evidence);
//    }
//
//    public void deleteEvidence(Long id) {
//        evidenceRepository.deleteById(id);
//    }
}