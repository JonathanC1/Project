package ec.edu.espe.mechanic.model;

/**
 *
 * @author Sigma Programmers
 */
public class SpareParts {

    private String name;
    private String model;
    private String type;
    private float price;
    private int quantity;

    @Override
    public String toString() {
        return "SpareParts{" + "name=" + name + ", model=" + model + ", type=" + type + ", price=" + price + ", quantity=" + quantity + '}';
    }

    public SpareParts(String name, String model, String type, float price, int quantity) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
