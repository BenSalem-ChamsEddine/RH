package com.talan.Rh.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Collaborateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private long prenom;
    private int age;
    @OneToMany(mappedBy="collaborateur")
    private List<Candidat> candidats;
    @ManyToOne
    private Manager manager;
    private double salaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getPrenom() {
        return prenom;
    }

    public void setPrenom(long prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<Candidat> candidats) {
        this.candidats = candidats;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Collaborateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom=" + prenom +
                ", age=" + age +
                ", candidats=" + candidats +
                ", manager=" + manager +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collaborateur that = (Collaborateur) o;
        return prenom == that.prenom &&
                age == that.age &&
                Double.compare(that.salaire, salaire) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(candidats, that.candidats) &&
                Objects.equals(manager, that.manager);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nom, prenom, age, candidats, manager, salaire);
    }
}
