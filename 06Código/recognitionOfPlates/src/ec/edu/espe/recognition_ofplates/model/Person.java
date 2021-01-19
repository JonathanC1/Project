/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.recognition_ofplates.model;

/**
 *
 * @author 
 */
public class Person {

    private String name;
    private String lastName;
    private String plate;
    
    
    public Person(String name, String lastName, String plate) {
        this.name = name;
        this.lastName = lastName;
        this.plate = plate;
    }

    @Override
    public String toString() {
        return  "name=" + name + ",lastName=" + lastName + ",plate=" + plate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }  
}
