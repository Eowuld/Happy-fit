/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

/**
 *
 * @author TLeMet
 */
public class Objectif {
    private int id;
    private double poids;
    private double objectifPoids;
    private double objectifDistance;
    private double objectifDuree;

    public Objectif() {
    }

    public Objectif(int id, double poids, double objectifPoids, double objectifDistance, double objectifDuree) {
        this.id = id;
        this.poids = poids;
        this.objectifPoids = objectifPoids;
        this.objectifDistance = objectifDistance;
        this.objectifDuree = objectifDuree;
    }

    public int getId() {
        return id;
    }

    public double getPoids() {
        return poids;
    }

    public double getObjectifPoids() {
        return objectifPoids;
    }

    public double getObjectifDistance() {
        return objectifDistance;
    }

    public double getObjectifDuree() {
        return objectifDuree;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setObjectifPoids(double objectifPoids) {
        this.objectifPoids = objectifPoids;
    }

    public void setObjectifDistance(double objectifDistance) {
        this.objectifDistance = objectifDistance;
    }

    public void setObjectifDuree(double objectifDuree) {
        this.objectifDuree = objectifDuree;
    }
        
}

