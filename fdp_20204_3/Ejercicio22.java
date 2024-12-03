package fdp_20204_3;
import java.util.*;
public class Ejercicio22 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = input.nextInt();        
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un numero positivo.");
        } else {            
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }            
            for (int i = numero - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
}