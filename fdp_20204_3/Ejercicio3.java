package fdp_20204_3;
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite el primer numero ");
        int num1=input.nextInt();
        System.out.println("digite el segundo numero ");
        int num2=input.nextInt();
        System.out.println("resultado de las comparaciones ");
        if (num1>num2){
            System.out.println(num1+" es mayor que "+num2);
        }
        if (num1<num2){
            System.out.println(num1+" es menor que "+num2);
        }
        if (num1==num2) {
            System.out.println(num1+" es igual a "+num2);
        }
        if (num1>=num2) {
            System.out.println(num1+" es mayor o igual que "+num2);
        }
        if (num1<=num2) {
            System.out.println(num1+" es menor o igual que "+num2);
        }
        if (num1!=num2) {
            System.out.println(num1+" es diferente de "+num2);
        }
    }   
}