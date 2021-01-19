/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.recognitionofplates.model;

/**
 *
 * @author Group2 Sigma Programmers
 */
public class Plates {
    private int idPlates;
    private String description;
    
    public Plates(int idPlates, String description) {
        this.idPlates = idPlates;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Plates{" + "idPlates=" + idPlates + ", description=" + description + '}';
    }
    
    public void insert(){
        
    }
    
    public void delete(){
        
    }
    
    public void update(){
        
    }

    /**
     * @return the idPlates
     */
    public int getIdPlates() {
        return idPlates;
    }

    /**
     * @param idPlates the idPlates to set
     */
    public void setIdPlates(int idPlates) {
        this.idPlates = idPlates;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}
