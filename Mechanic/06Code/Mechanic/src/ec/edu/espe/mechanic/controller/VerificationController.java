package ec.edu.espe.mechanic.controller;
import com.google.gson.Gson;
import ec.edu.espe.mechanic.utils.FileManager;
import ec.edu.espe.mechanic.utils.Persistence;
import ec.edu.espe.mechanic.view.FrmEmployers;
import javax.swing.JOptionPane;

/**
 *
 * @author Sigma Programmers
 */
public class VerificationController {

    public boolean login(Verification verification, String user, String password) {

        boolean logged = false;
        String readLine;
        Persistence persistence;
        persistence = new FileManager();
        readLine = persistence.read("","Users.json");

        Gson gson = new Gson();

        verification = gson.fromJson(readLine, Verification.class);

        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
        } else if (user.equals(verification.getUser()) == false && password.equals(verification.getPassword()) == false) {
            JOptionPane.showMessageDialog(null, "User and Password are incorrect");
        } else if (user.equals(verification.getUser()) == false) {
            JOptionPane.showMessageDialog(null, "User incorrect");
        } else if (password.equals(verification.getPassword()) == false) {
            JOptionPane.showMessageDialog(null, "Password incorrect");
        } else {
            JOptionPane.showMessageDialog(null, "Welcome " + user);
            FrmEmployers employers = new FrmEmployers();
            employers.setVisible(true);
            logged = true;
        }

        return logged;

    }
}