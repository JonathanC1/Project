/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.model;

import java.util.Scanner;

/**
 *
 * @author Sigmma Programmers
 */
public class Person {
    private String name;
    private String lastname;
    private String Email;
    private String ID;

    public Person(String name, String lastname, String Email, String ID) {
        this.name = name;
        this.lastname = lastname;
        this.Email = Email;
        this.ID = ID;
    }
    
    @Override
    public String toString() {
        return  "name=" + name + ",lastName=" + lastname + ",Email=" + Email + ", ID =" + ID ;
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
}
