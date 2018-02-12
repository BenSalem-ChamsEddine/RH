package com.talan.Rh.controllers;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Candidat")
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

    @GetMapping("/findById/{id}")
    @ResponseBody
    public Candidat findById(@PathVariable("id")long id) {
        return candidatService.findById(id);
    }

    @GetMapping("/findByNom/{nom}")
    @ResponseBody
    public List<Candidat> findByNom(@PathVariable("nom")String nom) {
        return candidatService.findByNom(nom);
    }

    @GetMapping("/findByPrenom/{prenom}")
    @ResponseBody
    public List<Candidat> findByPrenom(@PathVariable("prenom")String prenom) {
        return candidatService.findByPrenom(prenom);
    }

    @GetMapping("/findByNomOrPrenom/{contains}")
    @ResponseBody
    public List<Candidat> findByNomContainingOrPrenomContaining(@PathVariable("contains")String contains) {
        return candidatService.findByNomContainingOrPrenomContaining(contains);
    }

    @GetMapping("/findByAge/{age}")
    @ResponseBody
    public List<Candidat> findByAge(@PathVariable("age") int age) {
        return candidatService.findByAge(age);
    }

    @GetMapping("/findByCollaborateur")
    @ResponseBody
    public List<Candidat> findByCollaborateur(@RequestBody Collaborateur collaborateur) {
        return candidatService.findByCollaborateur(collaborateur);
    }
}
