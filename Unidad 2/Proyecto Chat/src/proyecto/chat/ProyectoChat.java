package proyecto.chat;
import java.sql.Connection;
import java.sql.DriverManager;

      public class ProyectoChat {
    Connection cn;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/chat","root","");
            System.out.println("Conectado");}
        catch (Exception e){
            System.err.println(e.getMessage());} 
        return cn;}}