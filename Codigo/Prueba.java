public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Multiplication Table");
        System.out.println("====================");
        int result=0;
        for(int i=1;i<=10;i++){
            System.out.println("\nMultiplication Table for number "+ i);
            for( int j=1;j<=10;j++){
                result = i*j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}
