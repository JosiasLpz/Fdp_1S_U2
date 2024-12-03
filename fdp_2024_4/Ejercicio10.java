package fdp_2024_4;
import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);       
        System.out.print("Ingrese el número de filas (N): ");
        int n = input.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int m = input.nextInt();        
        int[][] matriz = new int[n][m];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }        
        int[][] traspuesta = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }        
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);       
        System.out.println("\nMatriz traspuesta:");
        imprimirMatriz(traspuesta);
    }
   
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}