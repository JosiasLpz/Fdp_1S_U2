package fdp_2024_4;
import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);      
        System.out.print("Ingrese el número de filas (N): ");
        int n = nput.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int m = nput.nextInt();       
        int[][] matriz = new int[n][m];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = nput.nextInt();
            }
        }       
        System.out.println("\nResultados:");
        for (int i = 0; i < n; i++) {
            int mayor = matriz[i][0];
            int menor = matriz[i][0];
            for (int j = 1; j < m; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println("Fila " + (i + 1) + " -> Mayor: " + mayor + ", Menor: " + menor);
        }
    }    
}