package recognitionof_plates;

import ec.edu.espe.FileManager.utils.Data; 
import ec.edu.espe.recognition_ofplates.model.Person;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecognitionOfPlates {    
    
    public static void menu(){
        System.out.println("-----UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-----");
        System.out.println("-------------------------------------------------");
        System.out.println("----------------SIGMA PROGRAMMERS----------------");
        System.out.println("1. Input Date");
        System.out.println("2. Search Data");
        System.out.println("3. Exit");
        System.out.println("Select the option: ");
    }
    
    public static void inData() throws IOException{
       Scanner read = new Scanner(System.in);
       
       System.out.println("Input your name: ");
       String name = read.nextLine();
       System.out.println(name + " Input your lastname:");
       String lastName = read.nextLine();
       System.out.println(name + " Input your plate");
       String plate = read.nextLine();
       
       Person person = new Person(name,lastName,plate);
             
       String saveData = person.toString();
       
       
       Data.save("Information.csv",saveData + "\r");
    
       outData(name,lastName,plate);
   }
   
    public static void outData(String name, String lastName, String plate){
       System.out.println("NAME: " + name);
       System.out.println("LASTNAME: " + lastName);
       System.out.println("PLATE: " + plate);   
   }
    
    public static void student(){
        Scanner read = new Scanner(System.in);
        int option = 0;
        
        do{
            option = read.nextInt();
            switch(option){
                case 1:{
                    System.out.println("What word going to search? ");
                    String word = read.next();
                    Data.find(new File("find.csv"),word);
                    break;
                }
                
                case 2:{
                    System.out.println("Thank for use the program :)");
                    break;
                }
                default:{
                    System.out.println("option no recognized");
                    break;
                }
            }
        }while(option!=2);
    }  
    
    public static void teacher(){
        Scanner read = new Scanner(System.in);
        int option = 0;
        
        do{
            option = read.nextInt();
            switch(option){
                case 1:{
                    try {
                        inData();
                    } catch (IOException ex) {
                        Logger.getLogger(RecognitionOfPlates.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }

                case 2:{
                    System.out.println("What word going to search? ");
                    String word = read.next();
                    Data.find(new File("find.csv"),word);
                    break;
                }

                case 3:{
                    System.out.println("Thank for use the program :)");
                    break;
                }
                default:{
                    System.out.println("option no recognized");
                    break;
                }
            }
        }while(option!=3);
    
    } 
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        menu();
        System.out.println("USER: ");
        String user = read.next();
        System.out.println("PASSWORD: ");
        String password = read.next();
        
        if(user.equalsIgnoreCase("Student") && password.equalsIgnoreCase("012345")){
            student();
        }else if(user.equalsIgnoreCase("Teacher") && password.equalsIgnoreCase("123450")){
            teacher();
        }else{
            System.out.println("USER OR PASSWORD INCORRECT!!");
        }
    }
}
