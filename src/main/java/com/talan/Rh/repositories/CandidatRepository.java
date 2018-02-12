package com.talan.Rh.repositories;

import com.talan.Rh.entities.Candidat;
import com.talan.Rh.entities.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {

    Candidat findById(long id);
    List<Candidat> findByNom(String nom);
    List<Candidat> findByPrenom(String prenom);
    List<Candidat> findByNomContainingOrPrenomContaining(String Ncontains,String Pcontains);
    List<Candidat> findByAge(int age);
    List<Candidat> findByCollaborateur(Collaborateur c);
}
