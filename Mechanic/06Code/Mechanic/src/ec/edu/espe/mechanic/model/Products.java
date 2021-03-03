/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.model;

/**
 *
 * @author Sigmma Programmers
 */
public class Products {
    private String name ;
    private int quanty;
    private int price;

    public Products(String name, int quanty, int price) {
        this.name = name;
        this.quanty = quanty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", quanty=" + quanty + ", price=" + price + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quanty
     */
    public int getQuanty() {
        return quanty;
    }

    /**
     * @param quanty the quanty to set
     */
    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    
        
    
}
