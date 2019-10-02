/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.util.Date;

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
    private Date date;

    public Objectif() {
    }

    public Objectif(double poids, double objectifPoids, double objectifDistance, double objectifDuree) {
       
        this.poids = poids;
        this.objectifPoids = objectifPoids;
        this.objectifDistance = objectifDistance;
        this.objectifDuree = objectifDuree;
        
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

