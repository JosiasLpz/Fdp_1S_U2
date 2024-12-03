package fdp_2024_4;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] nums =new Double[8];
        double suma=0;
        for (int i = 0; i <nums.length; i++) {
            System.out.println("digite el valor "+(i+1)+" ");
            nums[i]=input.nextDouble();
            suma=suma+Math.pow(nums[i], 2);
        }
        System.out.println("la suma de los cuadrados de los valores contenidos en el array son "+suma);
    }   
}