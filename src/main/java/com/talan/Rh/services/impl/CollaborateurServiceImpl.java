package com.talan.Rh.services.impl;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.repositories.CollaborateurRepository;
import com.talan.Rh.services.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaborateurServiceImpl implements CollaborateurService {

    @Autowired
    CollaborateurRepository collaborateurRepository;
    @Override
    public Collaborateur addCollaborateur(Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }

    @Override
    public Collaborateur updateCollaborateur(Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }

    @Override
    public void deleteCollaborateur(Collaborateur collaborateur) {
        collaborateurRepository.delete(collaborateur);
    }

    @Override
    public Collaborateur findById(long id) {
        return collaborateurRepository.findById(id);
    }

    @Override
    public List<Collaborateur> findByNom(String nom) {
        return collaborateurRepository.findByNomContaining(nom);
    }

    @Override
    public List<Collaborateur> findByPrenom(String prenom) {
        return collaborateurRepository.findByPrenomContaining(prenom);
    }

    @Override
    public List<Collaborateur> findByNomContainingOrPrenomContaining(String contains) {
        return collaborateurRepository.findByNomContainingOrPrenomContaining(contains,contains);
    }

    @Override
    public Collaborateur findByCandidatsContains(Candidat candidat) {
        return collaborateurRepository.findByCandidatsContains(candidat);
    }

    @Override
    public List<Collaborateur> findBySalaire(double salaire) {
        return collaborateurRepository.findBySalaire(salaire);
    }

    @Override
    public List<Collaborateur> findAll() {
        return collaborateurRepository.findAll();
    }
}
