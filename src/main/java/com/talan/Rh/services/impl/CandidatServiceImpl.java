package com.talan.Rh.services.impl;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.repositories.CandidatRepository;
import com.talan.Rh.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatServiceImpl implements CandidatService {

    @Autowired
    CandidatRepository candidatRepository;

    @Override
    public Candidat addCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public Candidat updateCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public void deleteCandidat(Candidat candidat) {
        candidatRepository.delete(candidat);
    }

    @Override
    public Candidat findById(long id) {
        return candidatRepository.findById(id);
    }

    @Override
    public List<Candidat> findByNom(String nom) {
        return candidatRepository.findByNom(nom);
    }

    @Override
    public List<Candidat> findByPrenom(String prenom) {
        return candidatRepository.findByPrenom(prenom);
    }

    @Override
    public List<Candidat> findByNomContainingOrPrenomContaining(String contains) {
        return candidatRepository.findByNomContainingOrPrenomContaining(contains,contains);
    }

    @Override
    public List<Candidat> findByAge(int age) {
        return candidatRepository.findByAge(age);
    }

    @Override
    public List<Candidat> findByCollaborateur(Collaborateur c) {
        return candidatRepository.findByCollaborateur(c);
    }

    @Override
    public List<Candidat> findAll() {
        return candidatRepository.findAll();
    }
}
