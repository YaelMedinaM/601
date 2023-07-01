package pkg2.exepciones;
import javax.swing.JOptionPane;

public class Exepciones {

    public static void main(String[] args) {
    int x,y;
        
        try {
        x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1", "Solicita datos", 3));
        y= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 2", "Solicita datos", 3));
        JOptionPane.showMessageDialog(null, "La Division de "+x+"/"+y+" es "+(x/y), "Mostrando el resultado", 1);
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage()+" No es un numero entero ");
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage()+" No se puede dividir entre 0 ");
        }
   
    
    }
    
}
