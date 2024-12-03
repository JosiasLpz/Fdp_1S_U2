package fdp_20204_3;
import java.util.*;
public class Ejercicio5 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dias de la seman\ndigite un numero del 1 al 7 ");
        int dia=input.nextInt();
        if (dia==1) {
            System.out.println("lunes");
        } else {
            if (dia==2) {
                System.out.println("martes");
            } else {
                if (dia==3) {
                    System.out.println("miercoles");
                } else {
                    if (dia==4) {
                        System.out.println("jueves");
                    } else {
                        if (dia==5) {
                            System.out.println("viernes");
                        } else {
                            if (dia==6) {
                                System.out.println("sabado");
                            } else {
                                if (dia==7) {
                                    System.out.println("domingo");
                                } else {
                                    System.out.println("ese dia de la semana no existe");
                                }
                            }
                        }
                    }
                }
            }
        }
        input.close();
    }  
}