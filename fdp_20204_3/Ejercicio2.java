package fdp_20204_3;
import java.util.*;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("digita tu edad");
        edad=input.nextInt();
        if (edad>=18&&edad<30){
            System.out.println("ya puedes votar ");
        } else if(edad>=30&&edad<65){
            System.out.println("ya ten hijos ");
        }
        else if(edad>=65){
            System.out.println("ya consigue tu apoyo del bienestar ");
        }
    }   
}