package fdp_2024_4;
public class Ejercicio8 {
    public static void main(String[] args) {       
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };      
        int[] sumaColumnas = new int[6];      
        for (int columna = 0; columna < 6; columna++) {
            for (int fila = 0; fila < 6; fila++) {
                sumaColumnas[columna] += matriz[fila][columna];
            }
        }    
        System.out.println("Suma de cada columna:");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("Columna " + (i + 1) + ": " + sumaColumnas[i]);
        }
    }    
}