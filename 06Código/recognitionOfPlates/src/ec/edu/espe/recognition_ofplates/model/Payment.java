/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.recognition_ofplates.model;

import java.util.Date; 

/**
 *
 * @author 
 */
public class Payment {
    private int id;
    private Plates idPlates;
    private float cost;
    private Date dateInitial;
    private Date dateFinished;
    
    public void insert(){
        
    }
    
    public void deleted(){
        
    }
    
    public void update(){
        
    }
    
    public boolean calculated(){
        
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plates getIdPlates() {
        return idPlates;
    }

    public void setIdPlates(Plates idPlates) {
        this.idPlates = idPlates;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Date getDateInitial() {
        return dateInitial;
    }

    public void setDateInitial(Date dateInitial) {
        this.dateInitial = dateInitial;
    }

    public Date getDateFinished() {
        return dateFinished;
    }

    public void setDateFinished(Date dateFinished) {
        this.dateFinished = dateFinished;
    }    
}
