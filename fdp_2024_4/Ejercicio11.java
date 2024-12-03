package fdp_2024_4;
import java.util.*;
public class Ejercicio11 {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.print("Ingrese el tamaño de la matriz cuadrada (N): ");
        int n = input.nextInt();        
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }      
        if (esSimetrica(matriz, n)) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz no es simétrica.");
        }
    }
    public static boolean esSimetrica(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (matriz[i][j] != matriz[j][i]) {
                    return false; 
                }
            }
        }
        return true; 
    }    
}