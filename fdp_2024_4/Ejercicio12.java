package fdp_2024_4;
import java.util.*;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.print("Ingrese el tamaño de la matriz cuadrada (N): ");
        int n = input.nextInt();    
        int[][] matriz = new int[n][n];       
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; 
            matriz[i][n - i - 1] = 1; 
        }      
        System.out.println("\nMatriz con diagonales principales:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }   
}