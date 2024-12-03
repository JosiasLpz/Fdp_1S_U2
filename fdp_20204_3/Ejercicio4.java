package fdp_20204_3;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("programa que determina si ud es mayor de edad ");
        System.out.println("digite su edad ");
        edad=input.nextInt();
        System.out.println("solucion de israel");
        if (edad>=18) {
            System.out.println("eres mayor de edad.te voy a un VIP ");
        } else {
            System.out.println("eres menor de edad ");
        }
        System.out.println("solucion de yamir y cristopher  ");
        if (edad<18) {
            System.out.println("eres menor de edad ");
        } else {
            System.out.println("eres mayor de edad ");
        }
        System.out.println("solucion de diego ");
        if (edad>17) {
            System.out.println("eres mayor de edad ");
        } else {
            System.out.println("ve anda mira , te habla tu mami.no quiero ir a la carcel");
        }
    }    
}