package ec.edu.espe.mechanic.model;

/**
 *
 * @author Sigma Programmers
 */
public class Product {

    private String name;
    private int quanty;
    private int price;

    public Product(String name, int quanty, int price) {
        this.name = name;
        this.quanty = quanty;
        this.price = price;
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

    /*=======
    String name ;
    int quanty;
>>>>>>> e4b3f82c2e54cd426697e6d1e44a137df95afedb
     */
}
