package pkg2.v1.trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Yael
 */
public class V1TRIFIV {
    public static void main(String[] args) throws IOException {
        
    BufferedReader bufEntrada= new BufferedReader (new InputStreamReader(System.in));
    int numero;
    float mul3, mul5;
        System.out.println("Dame el numero");
        numero=Integer.parseInt(bufEntrada.readLine());
        mul3= numero%3;
        mul5=numero%5;
        
        if(mul3==0){
        System.out.println("TRI");}
        if(mul5==0){
            System.out.println("FIV");}
        if(mul3==0 && mul5==0){
            System.out.println("TRIFIV");}}}