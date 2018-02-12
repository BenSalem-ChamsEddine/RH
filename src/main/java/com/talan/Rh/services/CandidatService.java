package com.talan.Rh.services;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;

import java.util.List;

public interface CandidatService {

    Candidat addCandidat(Candidat candidat);
    Candidat updateCandidat(Candidat candidat);
    void deleteCandidat(Candidat candidat);
    Candidat findById(long id);
    List<Candidat> findByNom(String nom);
    List<Candidat> findByPrenom(String prenom);
    List<Candidat> findByNomContainingOrPrenomContaining(String contains);
    List<Candidat> findByAge(int age);
    List<Candidat> findByCollaborateur(Collaborateur c);
}
