package pkg6.myarrayindexoutofboundsexception;
import javax.swing.JOptionPane;

public class MyArrayIndexOutOfBoundsException extends IndexOutOfBoundsException{
    public static void main(String[] args) {
            int[] array= {1,2,3};
            int x;
        try {
           x=array[1];
        } 
        catch (ArrayIndexOutOfBoundsException n) {
            System.out.println(n.getMessage()+" No es registro dentro del Array");
          }    
       }
    }