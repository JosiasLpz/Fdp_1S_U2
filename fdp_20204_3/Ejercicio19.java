package fdp_20204_3;
import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args) {        
         Scanner sc = new Scanner(System.in);                
        double sumaPesoMujeres = 0, sumaAlturaMujeres = 0,sumaPesoHombres = 0, sumaAlturaHombres = 0;
        int countMujeres = 0, countHombres = 0;     
        System.out.print("Ingrese el número de personas a ingresar: ");
        int n = sc.nextInt();        
        for (int i = 0; i < n; i++) {
            System.out.println("Persona " + (i + 1));                     
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();            
            if (edad >= 18) {
                System.out.print("Ingrese peso (kg): ");
                double peso = sc.nextDouble();                
                System.out.print("Ingrese altura (m): ");
                double altura = sc.nextDouble();                
                System.out.print("Ingrese sexo (M para hombre, F para mujer): ");
                char sexo = sc.next().charAt(0);           
                if (sexo == 'F' || sexo == 'f') {
                    sumaPesoMujeres += peso;
                    sumaAlturaMujeres += altura;
                    countMujeres++;
                } else if (sexo == 'M' || sexo == 'm') {
                    sumaPesoHombres += peso;
                    sumaAlturaHombres += altura;
                    countHombres++;
                } else {
                    System.out.println("Sexo no válido, se omiten los datos.");
                }
            } else {
                System.out.println("La persona debe tener al menos 18 años para ser considerada.");
            }
        }            
        if (countMujeres > 0) {
            System.out.println("\nPromedio de peso de las mujeres mayores de 18 años: " + (sumaPesoMujeres / countMujeres) + " kg");
            System.out.println("Promedio de altura de las mujeres mayores de 18 años: " + (sumaAlturaMujeres / countMujeres) + " m");
        } else {
            System.out.println("\nNo hay mujeres mayores de 18 años registradas.");
        }
        if (countHombres > 0) {
            System.out.println("\nPromedio de peso de los hombres mayores de 18 años: " + (sumaPesoHombres / countHombres) + " kg");
            System.out.println("Promedio de altura de los hombres mayores de 18 años: " + (sumaAlturaHombres / countHombres) + " m");
        } else {
            System.out.println("\nNo hay hombres mayores de 18 años registrados.");
        }
        
        sc.close();
    }    
}