package com.talan.Rh.controllers;

import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.entities.Manager;
import com.talan.Rh.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController{

    @Autowired
    ManagerService managerService;

    @PostMapping("/add")
    @ResponseBody
    public Manager addManager(@RequestBody Manager manager) {
        return managerService.addManager(manager);
    }

    @PutMapping("/update")
    @ResponseBody
    public Manager updateManager(@RequestBody Manager manager) {
        return managerService.updateManager(manager);
    }

    @DeleteMapping("/delete")
    public void deleteManager(@RequestBody Manager manager) {
        managerService.deleteManager(manager);
    }

    @GetMapping("/")
    @ResponseBody
    public List<Manager> findAll() {
        return managerService.findAll();
    }

    @GetMapping("/findbyid/{id}")
    @ResponseBody
    public Manager findById(@PathVariable("id") long id) {
        return managerService.findById(id);
    }

    @GetMapping("/findbynom/{nom}")
    @ResponseBody
    public List<Manager> findByNom(@PathVariable("nom") String nom) {
        return managerService.findByNom(nom);
    }

    @GetMapping("/findbyprenom/{prenom}")
    @ResponseBody
    public List<Manager> findByPrenom(@PathVariable("prenom") String prenom) {
        return managerService.findByPrenom(prenom);
    }

    @GetMapping("/findbynomorprenom/{contains}")
    @ResponseBody
    public List<Manager> findByNomContainingOrPrenomContaining(@PathVariable("contains") String contains) {
        return managerService.findByNomContainingOrPrenomContaining(contains);
    }

    @GetMapping("/findbycollaborateur")
    @ResponseBody
    public Manager findByCollaborateursContains(@RequestBody Collaborateur collaborateur) {
        return managerService.findByCollaborateursContains(collaborateur);
    }

    @GetMapping("/findbysalaire/{salaire}")
    @ResponseBody
    public List<Manager> findBySalaire(@PathVariable("salaire") double salaire) {
        return managerService.findBySalaire(salaire);
    }
}
