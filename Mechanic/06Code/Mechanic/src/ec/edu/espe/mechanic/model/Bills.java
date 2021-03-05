/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.model;

/**
 *
 * @author Sigma Programmers
 */
public class Bills {
    private Customer client;
    private int numberOfBill = 1;
    private float priceOfWorkforce;
    private float discount;

    public void totalPartsUsed(){
        
        
    }
    
    public void totalAccessories(){
        
        
    }
    
    
    
    
    
    
    
    
    
    public Bills(Customer client, float priceOfWorkforce, float discount) {
        this.client = client;
        this.priceOfWorkforce = priceOfWorkforce;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Bills{" + "client=" + client + ", numberOfBill=" + numberOfBill + ", priceOfWorkforce=" + priceOfWorkforce + ", discount=" + discount + '}';
    }
    

    
    /**
     * @return the client
     */
    public Customer getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Customer client) {
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
}
