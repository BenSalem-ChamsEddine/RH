package com.talan.Rh.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    @OneToMany(mappedBy="manager")
    private List<Collaborateur> collaborateurs;
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

    public List<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateurs(List<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom=" + prenom +
                ", age=" + age +
                ", collaborateurs=" + collaborateurs +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return age == manager.age &&
                Double.compare(manager.salaire, salaire) == 0 &&
                Objects.equals(id, manager.id) &&
                Objects.equals(nom, manager.nom) &&
                Objects.equals(prenom, manager.prenom) &&
                Objects.equals(collaborateurs, manager.collaborateurs);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nom, prenom, age, collaborateurs, salaire);
    }
}
