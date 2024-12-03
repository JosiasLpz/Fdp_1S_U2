package fdp_2024_4;
import java.util.*;
public class Ejercicio5 {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.print("Ingrese el tamaño del primer arreglo: ");
        int n = input.nextInt();
        System.out.print("Ingrese el tamaño del segundo arreglo: ");
        int m = input.nextInt();     
        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[m];        
        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo1[i] = input.nextInt();
        }        
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < m; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo2[i] = input.nextInt();
        }
        
        int[] arregloCombinado = new int[n + m];
        System.arraycopy(arreglo1, 0, arregloCombinado, 0, n);
        System.arraycopy(arreglo2, 0, arregloCombinado, n, m);       
        Arrays.sort(arregloCombinado); 
        for (int i = 0; i < arregloCombinado.length / 2; i++) {
            int temp = arregloCombinado[i];
            arregloCombinado[i] = arregloCombinado[arregloCombinado.length - 1 - i];
            arregloCombinado[arregloCombinado.length - 1 - i] = temp;
        }      
        System.out.println("El arreglo combinado y ordenado de forma descendente es:");
        System.out.println(Arrays.toString(arregloCombinado));
    }    
}