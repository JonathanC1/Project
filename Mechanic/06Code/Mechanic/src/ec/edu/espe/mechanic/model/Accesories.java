/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.model;

/**
 *
 * @author ELEN
 */
public class Accesories {

    private String name;
    private float price;
    private int quantity;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Accesories(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    
}
