/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.util.logging.Logger;

/**
 *
 * @author Joel B
 */
public class User {
    
    private int id;
    private String pseudo;
    private String mail;
    private String sexe;
    private int age;
    private int taille;
    private double poids;

    public User() {
    }

    public User(String pseudo, String mail, String sexe, int age, int taille, double poids) {
        this.pseudo = pseudo;
        this.mail = mail;
        this.sexe = sexe;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
    }

    public int getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMail() {
        return mail;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
   
    

    
}
