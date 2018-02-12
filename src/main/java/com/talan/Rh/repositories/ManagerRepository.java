package com.talan.Rh.repositories;

import com.talan.Rh.entities.Collaborateur;
import com.talan.Rh.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    Manager findById(long id);
    List<Manager> findByNom(String nom);
    List<Manager> findByPrenom(String prenom);
    List<Manager> findByNomContainingOrPrenomContaining(String Ncontains,String Pcontains);
    Manager findByCollaborateursContains(Collaborateur collaborateur);
    List<Manager> findBySalaire(double salaire);
}
