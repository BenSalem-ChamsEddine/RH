package com.talan.Rh.controllers;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.services.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Collaborateur")
public class CollaborateurController {

    @Autowired
    CollaborateurService collaborateurService;

     @PostMapping("/add")
     @ResponseBody
    public Collaborateur addCollaborateur(@RequestBody Collaborateur collaborateur) {
        return collaborateurService.addCollaborateur(collaborateur);
    }
    @PutMapping("/update")
    @ResponseBody
    public Collaborateur updateCollaborateur(@RequestBody Collaborateur collaborateur) {
        return collaborateurService.updateCollaborateur(collaborateur);
    }
    @DeleteMapping("/delete")
    public void deleteCollaborateur(@RequestBody Collaborateur collaborateur) {
        collaborateurService.deleteCollaborateur(collaborateur);
    }
    @GetMapping("/findById/{id}")
    @ResponseBody
    public Collaborateur findById(@PathVariable("id") long id) {
        return collaborateurService.findById(id);
    }

    @GetMapping("/findByNom/{nom}")
    @ResponseBody
    public List<Collaborateur> findByNom(@PathVariable("nom") String nom) {
        return collaborateurService.findByNom(nom);
    }

    @GetMapping("/findByPrenom/{prenom}")
    @ResponseBody
    public List<Collaborateur> findByPrenom(@PathVariable("prenom") String prenom) {
        return collaborateurService.findByPrenom(prenom);
    }

    @GetMapping("/findByNomOrPrenom/{contains}")
    @ResponseBody
    public List<Collaborateur> findByNomContainingOrPrenomContaining(@PathVariable("contains") String contains) {
        return collaborateurService.findByNomContainingOrPrenomContaining(contains);
    }

    @GetMapping("/findByCandidat")
    @ResponseBody
    public Collaborateur findByCandidatsContains(@RequestBody Candidat candidat) {
        return collaborateurService.findByCandidatsContains(candidat);
    }

    @GetMapping("/findBySalaire/{salaire}")
    @ResponseBody
    public List<Collaborateur> findBySalaire(@PathVariable("salaire") double salaire) {
        return collaborateurService.findBySalaire(salaire);
    }
}
