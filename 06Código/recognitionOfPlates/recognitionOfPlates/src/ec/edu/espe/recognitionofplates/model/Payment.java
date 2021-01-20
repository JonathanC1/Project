/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.recognitionofplates.model;

import java.util.Date; 

/**
 *
 * @author Group2 Sigma Programmers
 */
public class Payment {
    private int id;
    private Plates idPlates;
    private float cost;
    private Date dateInitial;
    private Date dateFinished;
    
    public Payment(int id, Plates idPlates, float cost, Date dateInitial, Date dateFinished) {
        this.id = id;
        this.idPlates = idPlates;
        this.cost = cost;
        this.dateInitial = dateInitial;
        this.dateFinished = dateFinished;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", idPlates=" + idPlates + ", cost=" + cost + ", dateInitial=" + dateInitial + ", dateFinished=" + dateFinished + '}';
    }
    
    public void insert(){
        
    }
    
    public void deletd(){
        
    }
    
    public void update(){
        
    }
    
    public boolean calculated(){
        
        return true;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idPlates
     */
    public Plates getIdPlates() {
        return idPlates;
    }

    /**
     * @param idPlates the idPlates to set
     */
    public void setIdPlates(Plates idPlates) {
        this.idPlates = idPlates;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the dateInitial
     */
    public Date getDateInitial() {
        return dateInitial;
    }

    /**
     * @param dateInitial the dateInitial to set
     */
    public void setDateInitial(Date dateInitial) {
        this.dateInitial = dateInitial;
    }

    /**
     * @return the dateFinished
     */
    public Date getDateFinished() {
        return dateFinished;
    }

    /**
     * @param dateFinished the dateFinished to set
     */
    public void setDateFinished(Date dateFinished) {
        this.dateFinished = dateFinished;
    }
    
}
