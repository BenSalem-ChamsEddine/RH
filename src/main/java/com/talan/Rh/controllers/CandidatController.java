package com.talan.Rh.controllers;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidat")
public class CandidatController {

    @Autowired
    CandidatService candidatService;

    @PostMapping("/add")
    @ResponseBody
    public Candidat addCandidat(@RequestBody Candidat candidat) {
        return candidatService.addCandidat(candidat);
    }
    @PutMapping("/update")
    @ResponseBody
    public Candidat updateCandidat(@RequestBody Candidat candidat) {
        return candidatService.updateCandidat(candidat);
    }

    @DeleteMapping("/delete")
    public void deleteCandidat(@RequestBody Candidat candidat) {
        candidatService.deleteCandidat(candidat);
    }

    @GetMapping("")
    @ResponseBody
    public List<Candidat> findAll() {
        return candidatService.findAll();
    }

    @GetMapping("/findbyid/{id}")
    @ResponseBody
    public Candidat findById(@PathVariable("id")long id) {
        return candidatService.findById(id);
    }

    @GetMapping("/findbynom/{nom}")
    @ResponseBody
    public List<Candidat> findByNom(@PathVariable("nom")String nom) {
        return candidatService.findByNom(nom);
    }

    @GetMapping("/findbyprenom/{prenom}")
    @ResponseBody
    public List<Candidat> findByPrenom(@PathVariable("prenom")String prenom) {
        return candidatService.findByPrenom(prenom);
    }

    @GetMapping("/findbynomorprenom/{contains}")
    @ResponseBody
    public List<Candidat> findByNomContainingOrPrenomContaining(@PathVariable("contains")String contains) {
        return candidatService.findByNomContainingOrPrenomContaining(contains);
    }

    @GetMapping("/findbyage/{age}")
    @ResponseBody
    public List<Candidat> findByAge(@PathVariable("age") int age) {
        return candidatService.findByAge(age);
    }

    @GetMapping("/findbycollaborateur")
    @ResponseBody
    public List<Candidat> findByCollaborateur(@RequestBody Collaborateur collaborateur) {
        return candidatService.findByCollaborateur(collaborateur);
    }
}
