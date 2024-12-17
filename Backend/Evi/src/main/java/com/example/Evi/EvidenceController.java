package com.example.Evi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/evidences")
@CrossOrigin(origins = "http://localhost:3000") 
public class EvidenceController {
    @Autowired
    private EvidenceService evidenceService;

    @GetMapping
    public List<Evidence> getAllEvidences() {
        return evidenceService.getAllEvidences();
    }

    @GetMapping("/{id}")
    public Evidence getEvidenceById(@PathVariable Long id) {
        return evidenceService.getEvidenceById(id).orElseThrow(() -> new RuntimeException("Evidence not found"));
    }

    @PostMapping
    public Evidence addEvidence(@RequestBody Evidence evidence) {
        return evidenceService.addEvidence(evidence);
    }

//    @PutMapping("/{id}")
//    public Evidence updateEvidence(@PathVariable Long id, @RequestBody Evidence evidenceDetails) {
//        return evidenceService.updateEvidence(id, evidenceDetails);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteEvidence(@PathVariable Long id) {
//        evidenceService.deleteEvidence(id);
//    }
}