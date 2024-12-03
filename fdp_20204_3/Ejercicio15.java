package fdp_20204_3;
import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Ingrese el numero de materias que lleva este semestre: ");
        int numMaterias = input.nextInt();
        
        if (numMaterias <= 0) {
            System.out.println("El numero de materias debe ser mayor que 0.");
        }
        else {
            double sumaCalificaciones = 0;           
            for (int i = 1; i <= numMaterias; i++) {
                System.out.print("Ingrese la calificacion obtenida en la materia " + i + ": ");
                double calificacion = input.nextDouble();                
                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("La calificacion debe estar entre 0 y 10. Intente nuevamente.");
                    i--; 
                } 
                else {
                    sumaCalificaciones += calificacion;
                }
            }            
            double promedio = sumaCalificaciones / numMaterias;
            System.out.printf("El promedio de sus calificaciones es: %.2f%n", promedio);
        }       
        input.close();
    }    
}