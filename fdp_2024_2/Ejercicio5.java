package fdp_2024_2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("¿Que deseas hacer? (1 - Calcular diferencia entre fechas,2 - Sumar a una fecha)");
        int choice=input.nextInt();
        input.nextLine();  // Limpiar el buffer
        if(choice==1) 
        {
            calculateDifference(input,formatter);
        }
        else if(choice==2) 
        {
            addTimeToDate(input,formatter);
        }
        else 
        {
            System.out.println("Opcion no valida.");
        }
    }
    private static void calculateDifference(Scanner input, DateTimeFormatter formatter) 
    {
        try 
        {
            System.out.println("Ingrese la primera fecha (yyyy-MM-dd) ");
            LocalDate date1=LocalDate.parse(input.nextLine(), formatter);
            System.out.println("Ingrese la segunda fecha (yyyy-MM-dd) ");
            LocalDate date2=LocalDate.parse(input.nextLine(), formatter);
            System.out.println("Seleccione la unidad de tiempo para la diferencia (dias,semanas,meses)");
            String unit=input.nextLine().toLowerCase();
            long difference=0;
            switch(unit) 
            {
                case "días":
                    difference=ChronoUnit.DAYS.between(date1, date2);
                    break;
                case "semanas":
                    difference=ChronoUnit.WEEKS.between(date1, date2);
                    break;
                case "meses":
                    difference=ChronoUnit.MONTHS.between(date1, date2);
                    break;
                default:
                    System.out.println("Unidad no valida. Elija 'dias', 'semanas' o 'meses'.");
                    return;
            }
            System.out.printf("La diferencia entre las fechas es de %d %s.%n", difference, unit);
        } 
        catch (Exception e) 
        {
            System.out.println("Formato de fecha incorrecto. Por favor, use el formato yyyy-MM-dd.");
        }
    }
    private static void addTimeToDate(Scanner input, DateTimeFormatter formatter) 
    {
        try 
        {
            System.out.println("Ingrese la fecha (yyyy-MM-dd):");
            LocalDate date=LocalDate.parse(input.nextLine(), formatter);
            System.out.println("¿Deseas agregar dias o meses? (escriba 'dias' o 'meses')");
            String unit=input.nextLine().toLowerCase();
            System.out.println("¿Cuantos "+unit+" deseas agregar?");
            int amount=input.nextInt();
            LocalDate resultDate=date;
            switch(unit) 
            {
                case "dias":
                    resultDate=date.plusDays(amount);
                    break;
                case "meses":
                    resultDate=date.plusMonths(amount);
                    break;
                default:
                    System.out.println("Unidad no valida. Elija 'dias' o 'meses'.");
                    return;
            }
            System.out.println("La nueva fecha es: "+resultDate.format(formatter));
        }
        catch(Exception e) 
        {
            System.out.println("Formato de fecha incorrecto. Por favor, use el formato yyyy-MM-dd.");
        }
    }
}