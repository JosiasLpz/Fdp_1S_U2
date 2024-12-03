package fdp_20204_3;
import java.util.*;
public class Ejercicio21 {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);        
        System.out.print("Ingrese un número x (en radianes): ");
        double x = input.nextDouble();       
        double resultado = calcularSenoTaylor(x);       
        System.out.printf("El seno de %.4f es aproximadamente %.4f%n", x, resultado);
        input.close();
    }
    private static double calcularSenoTaylor(double x) {
        double termino = x; 
        double resultado = 0; 
        int n = 1; 
        while (Math.abs(termino) > 0.001) {
            resultado += termino; 
            n++;          
            termino *= -x * x / ((2 * n - 2) * (2 * n - 1));
        }
        return resultado;      
    }    
}