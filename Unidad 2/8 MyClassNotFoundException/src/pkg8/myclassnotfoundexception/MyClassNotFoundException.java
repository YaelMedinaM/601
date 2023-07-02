package pkg8.myclassnotfoundexception;

public class MyClassNotFoundException extends ReflectiveOperationException {
    
    public static void main(String[] args) {
      try {
            Class.forName("pepes");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro la clase "+e.getMessage());
        }
    }
}