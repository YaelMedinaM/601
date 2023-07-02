package pkg9.mynullpointerexception;

public class MyNullPointerException {

    public static void main(String[] args) {
        String text=null;
        try {
            int pepe=text.length();
            } 
            catch (NullPointerException e) {
                System.out.println("Hay una NullPointerException ");
                e.printStackTrace();
        }
    }
}