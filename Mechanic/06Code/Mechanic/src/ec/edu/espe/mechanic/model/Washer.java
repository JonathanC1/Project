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
public class Washer {
    private String specialits;
    private float waitTime;

    @Override
    public String toString() {
        return "Washer{" + "specialits=" + specialits + ", waitTime=" + waitTime + '}';
    }

    public Washer(String specialits, float waitTime) {
        this.specialits = specialits;
        this.waitTime = waitTime;
    }

    /**
     * @return the specialits
     */
    public String getSpecialits() {
        return specialits;
    }

    /**
     * @param specialits the specialits to set
     */
    public void setSpecialits(String specialits) {
        this.specialits = specialits;
    }

    /**
     * @return the waitTime
     */
    public float getWaitTime() {
        return waitTime;
    }

    /**
     * @param waitTime the waitTime to set
     */
    public void setWaitTime(float waitTime) {
        this.waitTime = waitTime;
    }
}
