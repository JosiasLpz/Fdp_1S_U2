package fdp_20204_3;
import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.print("Ingrese un número positivo para generar su tabla de multiplicar: ");
        int numero = input.nextInt();        
        while (numero <= 0) {
            System.out.println("El número debe ser positivo. Inténtelo de nuevo.");
            System.out.print("Ingrese un número positivo: ");
            numero = input.nextInt();
        }       
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }       
        input.close();
    }   
}