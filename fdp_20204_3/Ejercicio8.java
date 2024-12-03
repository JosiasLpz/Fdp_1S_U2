package fdp_20204_3;
import java.util.*;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el dividendo:");
        double dividendo=input.nextDouble();
        System.out.println("Ingrese el divisor:");
        double divisor=input.nextDouble();
        if(divisor!=0) {
            double resultado=dividendo/divisor;
            System.out.println("El resultado de la divison es "+resultado);
        } 
        else{
            System.out.println("Error: El divisor no puede ser 0.");
        }
        input.close();
    }
}