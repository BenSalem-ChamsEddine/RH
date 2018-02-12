package com.talan.Rh.services;

import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.entities.Manager;

import java.util.List;

public interface ManagerService {

    Manager addManager(Manager manager);
    Manager updateManager(Manager manager);
    void deleteManager(Manager manager);
    List<Manager> findAll();
    Manager findById(long id);
    List<Manager> findByNom(String nom);
    List<Manager> findByPrenom(String prenom);
    List<Manager> findByNomContainingOrPrenomContaining(String contains);
    Manager findByCollaborateursContains(Collaborateur collaborateur);
    List<Manager> findBySalaire(double salaire);
}
