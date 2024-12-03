package fdp_2024_4;
public class Ejercicio4 {
    public static void main(String[] args) {       
        long[] fibonacci = new long[100];        
        fibonacci[0] = 0;
        fibonacci[1] = 1;        
        for (int i = 2; i < 100; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }        
        System.out.println("Los primeros 100 números de Fibonacci son:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }            
}  