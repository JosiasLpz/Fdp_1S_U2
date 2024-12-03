package fdp_20204_3;
import java.util.*;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorInicial, valorFinal;      
        do {
            System.out.print("Ingrese el valor inicial: ");
            valorInicial = input.nextInt();
            System.out.print("Ingrese el valor final: ");
            valorFinal = input.nextInt();
            if (valorInicial - valorFinal < 5) {
                System.out.println("El valor inicial debe ser al menos 5 unidades mayor que el valor final. Inténtelo de nuevo.");
            }
        } while (valorInicial - valorFinal < 5);       
        System.out.println("Secuencia decreciente:");
        while (valorInicial >= valorFinal) {
            System.out.print(valorInicial + " ");
            valorInicial -= 5;
        }
        System.out.println();        
        input.close();
    }    
}