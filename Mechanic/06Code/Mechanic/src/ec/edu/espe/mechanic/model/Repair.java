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
public class Repair {
    private String name;
    private String diagnostic;
    private String fault;
    private boolean repair;

    @Override
    public String toString() {
        return "Repair{" + "name=" + name + ", diagnostic=" + diagnostic + ", fault=" + fault + ", repair=" + repair + '}';
    }

    public Repair(String name, String diagnostic, String fault, boolean repair) {
        this.name = name;
        this.diagnostic = diagnostic;
        this.fault = fault;
        this.repair = false;
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
     * @return the diagnostic
     */
    public String getDiagnostic() {
        return diagnostic;
    }

    /**
     * @param diagnostic the diagnostic to set
     */
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    /**
     * @return the fault
     */
    public String getFault() {
        return fault;
    }

    /**
     * @param fault the fault to set
     */
    public void setFault(String fault) {
        this.fault = fault;
    }

    /**
     * @return the repair
     */
    public boolean isRepair() {
        return repair;
    }

    /**
     * @param repair the repair to set
     */
    public void setRepair(boolean repair) {
        this.repair = repair;
    }
}
