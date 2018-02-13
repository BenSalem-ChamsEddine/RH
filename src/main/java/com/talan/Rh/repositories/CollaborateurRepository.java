package com.talan.Rh.repositories;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {

    Collaborateur findById(long id);
    List<Collaborateur> findByNomContaining(String nom);
    List<Collaborateur> findByPrenomContaining(String prenom);
    List<Collaborateur> findByNomContainingOrPrenomContaining(String Ncontains,String Pcontains);
    Collaborateur findByCandidatsContains(Candidat candidat);
    List<Collaborateur> findBySalaire(double salaire);
}
