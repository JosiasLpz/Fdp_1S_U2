package fdp_20204_3;
import java.util.Scanner;
public class Examen_3{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int numero1,numero2,minimo,maximo,i;
        System.out.println("digite el primer numero ");
        numero1=input.nextInt();
        System.out.println("digite el segundo numero ");
        numero2=input.nextInt();
        if(numero1<numero2){
            minimo=numero1;
            maximo=numero2;
        }
        else{
            minimo=numero2;
            maximo=numero1;
        }
        i=minimo;
        while(i<maximo){            
            if(i%2==0)
                System.out.println(i+"");
            i++;
        }     
    }   
}