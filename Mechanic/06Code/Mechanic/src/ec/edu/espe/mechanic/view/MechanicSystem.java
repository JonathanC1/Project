package ec.edu.espe.mechanic.view;

import java.util.Scanner;

/**
 *
 * @author Sigma Programmers
 */
public class MechanicSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String user, password;
        System.out.println("\tMECHANIC SYSTEM");
        System.out.println("\nInput the user:");
        user = input.nextLine();
        
        System.out.println("Input the password: ");
        password = input.nextLine();
        
        if(user == "Administrative" && password == "Admin123"){
            menuAdministrative();
        }else if (user == "Machanic" && password == "Mech123"){
            menuMechanic();
        }else if (user == "Machanic" && password == "Mech123"){
            menuLaundrier();
        }else{
            System.out.println("ERROR!!!!   User or Password Incorrect");
        }
        
    }

    public static void menuAdministrative() {
        int option;
        
        System.out.println("\n");

      
    }
    
    public static void menuMechanic() {
        int option;
        
        System.out.println("\n");

       

    }
    
    public static void menuLaundrier() {
        int option;
        
        System.out.println("\n");

      
    }
}
