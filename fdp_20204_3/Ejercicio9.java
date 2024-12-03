package fdp_20204_3;
import java.util.*;
public class Ejercicio9{
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);       
        final int PAGO_POR_HORA=100;
        final int HORAS_JORNADA_NORMAL=40;
        final double PAGO_HORA_EXTRA=PAGO_POR_HORA*2;        
        System.out.println("Ingrese las horas trabajadas en la semana:");
        int horasTrabajadas=input.nextInt();
        double totalPagar;       
        if(horasTrabajadas>0){
            if(horasTrabajadas<=HORAS_JORNADA_NORMAL){
                totalPagar=horasTrabajadas*PAGO_POR_HORA;
            }
            else{
                int horasExtras=horasTrabajadas-HORAS_JORNADA_NORMAL;
                totalPagar=(HORAS_JORNADA_NORMAL*PAGO_POR_HORA)+(horasExtras*PAGO_HORA_EXTRA);
            }            
            System.out.println("El total a pagar es  $"+totalPagar);
        } 
        else{
            System.out.println("Error: Las horas trabajadas deben ser mayores a 0.");
        }
        input.close();
    }   
}