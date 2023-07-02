package pkg7.myclasscastexception;

public class MyClassCastException extends RuntimeException {

    public static void main(String[] args) {
        Animal a= new Perro();
        try {
    Gato g=(Gato)a;
} catch (ClassCastException e) {
    System.out.println(e.getMessage()+" No es de la clase correcta");
}
    } 
}
     class Animal {
       public void ama(){System.out.println("ANIMAL");}
}
class Perro extends Animal {
    public void per(){System.out.println("PERRO");}
}
class Gato extends Animal {
    public void gat(){System.out.println("GATO");}
}  