package fdp_20204_3;
import java.util.*;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);        
        System.out.println("Ingrese el semestre que cursa el alumno ");
        double semestre=input.nextInt();
        System.out.println("Ingrese el promedio del alumno:");
        double promedio=input.nextDouble();      
        if(semestre>=4&&semestre<=9&&promedio>=80){
            System.out.println("El alumno puede obtener la beca de manutencion.");
        } 
        else if(semestre>=1&&semestre<=3&&promedio>=75){
            System.out.println("El alumno puede obtener la beca de transporte.");
        } 
        else{
            System.out.println("El alumno no reune las condiciones para obtener una beca.");
        }
        input.close();
    }   
}