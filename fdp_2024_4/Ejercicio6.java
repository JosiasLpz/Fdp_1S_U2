package fdp_2024_4;
import java.util.*;
public class Ejercicio6 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = input.nextInt();        
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = input.nextInt();
        }       
        Arrays.sort(arreglo);
       System.out.println("El arreglo ordenado es: " + Arrays.toString(arreglo));        
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = input.nextInt();        
        int resultado = busquedaBinaria(arreglo, valorBuscado);        
        if (resultado != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición (índice) " + resultado + ".");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo.");
        }
    }
    public static int busquedaBinaria(int[] arreglo, int valor) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;          
            if (arreglo[medio] == valor) {
                return medio; 
            } else if (arreglo[medio] < valor) {
                inicio = medio + 1; 
            } else {
                fin = medio - 1; 
            }
        }
        return -1;
    }    
}