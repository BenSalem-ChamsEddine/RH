package com.talan.Rh.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    @ManyToOne
    private Collaborateur collaborateur;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom=" + prenom +
                ", age=" + age +
                ", collaborateur=" + collaborateur +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidat candidat = (Candidat) o;
        return age == candidat.age &&
                Objects.equals(id, candidat.id) &&
                Objects.equals(nom, candidat.nom) &&
                Objects.equals(prenom, candidat.prenom) &&
                Objects.equals(collaborateur, candidat.collaborateur);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nom, prenom, age, collaborateur);
    }
}
