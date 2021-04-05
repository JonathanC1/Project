package ec.edu.espe.mechanic.utils;

/**
 *
 * @author sigma programers
 */
public interface DBManager extends Persistence {
   
    boolean openConnection(String URL);
    boolean closeConnection(String connection);
    
}
