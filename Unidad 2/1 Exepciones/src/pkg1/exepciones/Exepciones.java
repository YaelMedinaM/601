package pkg1.exepciones;
import javax.swing.JOptionPane;
public class Exepciones {

    public static void main(String[] args) {
       int x,y;
       try{
       x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero 1", "Solicite datos", 3));
       }
       catch (NumberFormatException n){
           System.out.println(n.getMessage()+ " no es un numero Entero");
       }
    }   
}