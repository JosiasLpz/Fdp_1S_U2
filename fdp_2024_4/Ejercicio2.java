package fdp_2024_4;
import java.util.*;
public class Ejercicio2 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();       
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }        
        Set<Integer> conjuntoSinRepetidos = new LinkedHashSet<>();
        for (int elemento : arreglo) {
            conjuntoSinRepetidos.add(elemento);
        }    
        List<Integer> listaSinRepetidos = new ArrayList<>(conjuntoSinRepetidos);
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo sin elementos repetidos: " + listaSinRepetidos);
    }    
}