package fdp_20204_3;
import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);        
        System.out.print("Ingrese la cantidad de números: ");
        int N = input.nextInt();   
        int positivos = 0, negativos = 0, ceros = 0;   
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = input.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }       
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
        input.close();
    }   
}