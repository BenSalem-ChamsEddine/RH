package com.talan.Rh.services.impl;

import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.entities.Manager;
import com.talan.Rh.repositories.ManagerRepository;
import com.talan.Rh.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    @Override
    public Manager addManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager updateManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteManager(Manager manager) {
        managerRepository.delete(manager);
    }

    @Override
    public Manager findById(long id) {
        return managerRepository.findById(id);
    }

    @Override
    public List<Manager> findByNom(String nom) {
        return managerRepository.findByNom(nom);
    }

    @Override
    public List<Manager> findByPrenom(String prenom) {
        return managerRepository.findByPrenom(prenom);
    }

    @Override
    public List<Manager> findByNomContainingOrPrenomContaining(String contains) {
        return managerRepository.findByNomContainingOrPrenomContaining(contains,contains);
    }

    @Override
    public Manager findByCollaborateursContains(Collaborateur collaborateur) {
        return managerRepository.findByCollaborateursContains(collaborateur);
    }

    @Override
    public List<Manager> findBySalaire(double salaire) {
        return managerRepository.findBySalaire(salaire);
    }
}
