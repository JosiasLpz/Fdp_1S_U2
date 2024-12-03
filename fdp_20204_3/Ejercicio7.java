package fdp_20204_3;
import java.util.*;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese la calificacion del alumno ");
        double calificacion=input.nextDouble();
        if(calificacion >= 70){
            System.out.println("El alumno está aprobado.");
        } 
        else{
            System.out.println("El alumno está reprobado.");
        }
        input.close();
    }   
}