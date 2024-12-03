package fdp_20204_3;
import java.util.Scanner;
public class Ejercicio6{   
    public static void main(String[] args){       
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        double numero=input.nextDouble();
        if(numero>0) {
            System.out.println("El numero es positivo.");
        } 
        else if(numero<0){
            System.out.println("El numero es negativo.");
        } 
        else {
            System.out.println("El numero es cero.");
        }
        input.close();
    }   
}