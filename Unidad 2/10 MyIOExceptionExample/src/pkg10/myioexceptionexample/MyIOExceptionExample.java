package pkg10.myioexceptionexample;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyIOExceptionExample {

    
    public static void main(String[] args) {
      BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("archivos.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Se produjo una IOException: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}