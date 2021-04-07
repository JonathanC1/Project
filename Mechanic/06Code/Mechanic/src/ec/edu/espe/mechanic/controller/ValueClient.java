package ec.edu.espe.mechanic.controller;

import ec.edu.espe.mechanic.model.Customer;
import ec.edu.espe.mechanic.utils.FileManager;
import ec.edu.espe.mechanic.utils.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Sigma Programmers
 */
public class ValueClient {

    public boolean create(Customer customer) {
        boolean created = false;
        String personData;

        Persistence persistence;

        persistence = new FileManager();

        if (persistence.create(customer.toString(), "Data.txt")) {
            JOptionPane.showMessageDialog(null, customer + "was saved");
        }
        return created;
    }
}
