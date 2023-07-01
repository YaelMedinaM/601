package pkg1excepciones;
import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String[] args) {
        int x,y;
        
        try {
            x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Numero 1: ", "Solicito datos", 3));
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage()+" No es numero ENTERO");
        }
    }
}