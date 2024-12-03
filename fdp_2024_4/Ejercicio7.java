package fdp_2024_4;
import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);  
        System.out.print("Ingrese el número de alumnos (N): ");
        int n = input.nextInt();     
        int[] calificaciones = new int[n];
        System.out.println("Ingrese las calificaciones de los alumnos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = input.nextInt();
        }       
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        double media = suma / n;      
        double sumaDesviaciones = 0;
        for (int calificacion : calificaciones) {
            sumaDesviaciones += Math.pow(calificacion - media, 2);
        }
        double varianza = sumaDesviaciones / n;      
        double desviacionEstandar = Math.sqrt(varianza);        
        int moda = calcularModa(calificaciones);        
        System.out.println("\nResultados:");
        System.out.printf("Media aritmética: %.2f\n", media);
        System.out.printf("Varianza: %.2f\n", varianza);
        System.out.printf("Desviación estándar: %.2f\n", desviacionEstandar);
        System.out.println("Moda: " + (moda == -1 ? "No hay una moda única" : moda));
    }  
    public static int calcularModa(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int numero : arreglo) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }
        int maxFrecuencia = 0;
        int moda = -1;
        boolean unica = true;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                moda = entry.getKey();
                unica = true;
            } else if (entry.getValue() == maxFrecuencia) {
                unica = false;
            }
        }
        return unica ? moda : -1; 
    }   
}