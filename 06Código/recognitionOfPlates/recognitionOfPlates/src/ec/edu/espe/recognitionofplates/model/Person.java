package ec.edu.espe.recognitionofplates.model;

/**
 *
 * @author Sigma Programmers
 */
public class Person {
    
    private int id;
    private String name;
    private String lastName;
    private String plate;

    public Person(String name, String lastName, String plate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", "
                + "lastName=" + lastName + ", plate=" + plate + '}';
    }

    public Person(int id, String name, String lastName, String plate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.plate = plate;
    }
    
       
    public void insert(){
        
    }
    
    public void delete(){
        
    }
    
    public void update(){
        
    }
    
    public void find(){
        
    }
    
    public void save(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
