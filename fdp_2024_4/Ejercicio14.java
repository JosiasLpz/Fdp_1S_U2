package fdp_2024_4;
import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.print("Ingrese el número de alumnos (1 a 50): ");
        int N = input.nextInt();        
        int numExamenes = 4;
        double[][] calificaciones = new double[N][numExamenes];        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
            for (int j = 0; j < numExamenes; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = input.nextDouble();
            }
        }        
        System.out.println("\nPromedio de calificaciones de cada alumno:");
        for (int i = 0; i < N; i++) {
            double suma = 0;
            for (int j = 0; j < numExamenes; j++) {
                suma += calificaciones[i][j];
            }
            double promedioAlumno = suma / numExamenes;
            System.out.println("Alumno " + (i + 1) + ": " + promedioAlumno);
        }              
        System.out.println("\nPromedio del grupo en cada examen:");
        for (int j = 0; j < numExamenes; j++) {
            double suma = 0;
            for (int i = 0; i < N; i++) {
                suma += calificaciones[i][j];
            }
            double promedioExamen = suma / N;
            System.out.println("Examen " + (j + 1) + ": " + promedioExamen);
        }        
        double mayorPromedio = -1;
        int examenConMayorPromedio = -1;
        for (int j = 0; j < numExamenes; j++) {
            double suma = 0;
            for (int i = 0; i < N; i++) {
                suma += calificaciones[i][j];
            }
            double promedioExamen = suma / N;
            if (promedioExamen > mayorPromedio) {
                mayorPromedio = promedioExamen;
                examenConMayorPromedio = j;
            }
        }
        System.out.println("\nEl examen con el mayor promedio de calificación es el Examen " + (examenConMayorPromedio + 1));    
        System.out.println("\nNúmero de alumnos aprobatorios en cada examen:");
        for (int j = 0; j < numExamenes; j++) {
            int aprobados = 0;
            for (int i = 0; i < N; i++) {
                if (calificaciones[i][j] >= 70 && calificaciones[i][j] <= 100) {
                    aprobados++;
                }
            }
            System.out.println("Examen " + (j + 1) + ": " + aprobados + " alumnos aprobados");
        }
    }    
}