/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Group 2
 */
public class FileManager implements Persistence {

    @Override
    public boolean save(String data, String fileName) {
      boolean saved = false;
        createFile(fileName); 
      try{
          FileWriter myWriter = new FileWriter(fileName+".txt",true);
          myWriter.write(System.getProperty("line.separator")+ data);
          myWriter.close();
          System.out.println("a new record of"+ fileName + " was saved");
          saved = true;
      }catch (IOException ex ){
          ex.printStackTrace();
          saved = false;
      }
          
          
          return saved;
    }

    public boolean createFile(String fileName) {
        boolean created = false;
        
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()){
                System.out.println("file was create");
                created = true;
                
            }else{
                System.out.println("file exist");
                created=true;
            }
        }catch(IOException ex){
            ex.printStackTrace();
            created = false;
            
        }
        return created;
    }

    @Override
    public String find(String dataToFind, String field, String table) {

    return null;
    }

    @Override
    public boolean update(String dataToFind, String newData, String table) {
    return false;
    }

    @Override
    public boolean delete(String dataToFind, String table) {
        return false;
    }

    @Override
    public String read(String table) {
       
        return null;
    }
    }
    
    

