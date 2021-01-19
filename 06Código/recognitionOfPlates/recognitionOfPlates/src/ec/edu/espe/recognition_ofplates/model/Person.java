package ec.edu.espe.recognition_ofplates.model;



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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }


    
}
