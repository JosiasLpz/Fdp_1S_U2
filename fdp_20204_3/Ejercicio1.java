package fdp_20204_3;
import java.util.*;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int edad;
        System.out.println("digite su edad ");
        edad=input.nextInt();
        if (edad>=18){
            System.out.println("ya eres mayor de edad, ya puedes ir al MMITAS_PUEBLA ");            
        }
        else
        {
            System.out.println("mira tu mama te habla,anda ve ");
        }
    }   
}