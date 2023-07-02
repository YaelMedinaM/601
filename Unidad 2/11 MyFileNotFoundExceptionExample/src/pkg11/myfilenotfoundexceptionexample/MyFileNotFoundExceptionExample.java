package pkg11.myfilenotfoundexceptionexample;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileNotFoundExceptionExample {

   public static void main(String[] args) {
        
  BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            } 
        catch (FileNotFoundException e) {
            System.out.println("El archivo no pudo ser encontrado: " + e.getMessage());
        }
    }
}