/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.model;

import java.util.Date;

/**
 *
 * @author Sigmma Programmers
 */
public class Bills {
    private Clients client;
    private int numberOfBill = 1;
    private float priceOfWorkforce;
    private float discount;
    private Date date;
    
    public void totalPartsUsed(){
        
        
    }
    
    public void totalAccessories(){
        
        
    }

    public Bills(Clients client, float priceOfWorkforce, float discount, Date date) {
        this.client = client;
        this.priceOfWorkforce = priceOfWorkforce;
        this.discount = discount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bills{" + "client=" + client + ", numberOfBill=" + numberOfBill + ", priceOfWorkforce=" + priceOfWorkforce + ", discount=" + discount + ", date=" + date + '}';
    }
    

    
    /**
     * @return the client
     */
    public Clients getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Clients client) {
        this.client = client;
    }

    /**
     * @return the numberOfBill
     */
    public int getNumberOfBill() {
        return numberOfBill;
    }

    /**
     * @param numberOfBill the numberOfBill to set
     */
    public void setNumberOfBill(int numberOfBill) {
        this.numberOfBill = numberOfBill;
    }

    /**
     * @return the priceOfWorkforce
     */
    public float getPriceOfWorkforce() {
        return priceOfWorkforce;
    }

    /**
     * @param priceOfWorkforce the priceOfWorkforce to set
     */
    public void setPriceOfWorkforce(float priceOfWorkforce) {
        this.priceOfWorkforce = priceOfWorkforce;
    }

    /**
     * @return the discount
     */
    public float getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
