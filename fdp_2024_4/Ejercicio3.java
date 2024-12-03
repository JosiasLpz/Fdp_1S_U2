package fdp_2024_4;

public class Ejercicio3 {
    public static void main(String[] args) {      
        int[] primos = new int[100];
        int contador = 0; 
        int numero = 2;      
        while (contador < 100) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }      
        System.out.println("Los primeros 100 numeros primos son ");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
    }    
    public static boolean esPrimo(int n) {
        if (n < 2) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }    
}