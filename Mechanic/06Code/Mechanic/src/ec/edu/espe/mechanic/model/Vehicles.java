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
public class Vehicles {
    private int year;
    private String Registration;
    private String Plate;
    private String trademakak;
    private String model;
    private float mileage;

    public Vehicles(int year, String Registration, String Plate, String trademakak, String model, float mileage) {
        this.year = year;
        this.Registration = Registration;
        this.Plate = Plate;
        this.trademakak = trademakak;
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicles{" + "year=" + year + ", Registration=" + Registration + ", Plate=" + Plate + ", trademakak=" + trademakak + ", model=" + model + ", mileage=" + mileage + '}';
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the Registration
     */
    public String getRegistration() {
        return Registration;
    }

    /**
     * @param Registration the Registration to set
     */
    public void setRegistration(String Registration) {
        this.Registration = Registration;
    }

    /**
     * @return the Plate
     */
    public String getPlate() {
        return Plate;
    }

    /**
     * @param Plate the Plate to set
     */
    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    /**
     * @return the trademakak
     */
    public String getTrademakak() {
        return trademakak;
    }

    /**
     * @param trademakak the trademakak to set
     */
    public void setTrademakak(String trademakak) {
        this.trademakak = trademakak;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the mileage
     */
    public float getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
    
    
}
