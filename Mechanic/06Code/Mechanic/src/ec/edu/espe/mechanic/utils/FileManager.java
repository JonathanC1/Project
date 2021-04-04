package ec.edu.espe.mechanic.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sigma Programmers
 */
public class FileManager implements Persistence {

    @Override
    public boolean create(String data, String fileName) {
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

   public String read(String table) {
        String readLine = "";

        try {
            File file = new File(table);
            if (file.exists()) {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedreader = new BufferedReader(reader);
                readLine = bufferedreader.readLine();
                bufferedreader.close();
            }
        } catch (Exception e) {
            System.out.println("File don't found");
        }
        return readLine;
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


}

   

