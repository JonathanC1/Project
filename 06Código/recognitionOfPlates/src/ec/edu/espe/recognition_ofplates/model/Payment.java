package ec.edu.espe.recognition_ofplates.model;

import java.util.Date; 


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
