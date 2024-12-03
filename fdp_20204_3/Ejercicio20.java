package fdp_20204_3;
import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:");
        int numero = input .nextInt();
        if (numero <= 1) {
            System.out.println("No hay números primos menores que " + numero);
        } else {
            System.out.println("Números primos menores que " + numero + ":");
            for (int i = 2; i < numero; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        input .close();
    }    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}