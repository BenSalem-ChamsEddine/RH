package com.talan.Rh.services;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;

import java.util.List;

public interface CollaborateurService {

    Collaborateur addCollaborateur(Collaborateur collaborateur);
    Collaborateur updateCollaborateur(Collaborateur collaborateur);
    void deleteCollaborateur(Collaborateur collaborateur);
    List<Collaborateur> findAll();
    Collaborateur findById(long id);
    List<Collaborateur> findByNom(String nom);
    List<Collaborateur> findByPrenom(String prenom);
    List<Collaborateur> findByNomContainingOrPrenomContaining(String contains);
    Collaborateur findByCandidatsContains(Candidat candidat);
    List<Collaborateur> findBySalaire(double salaire);
}
