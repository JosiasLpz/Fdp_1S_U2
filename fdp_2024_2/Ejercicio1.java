package fdp_2024_2;
import java.util.Scanner;
public class Ejercicio1
{
    public static double metersToKilometers(double metros) 
    {
        return metros/1000;
    }    
    public static double poundsToKilograms(double libras) 
    {
        return libras*0.453592;
    }    
    public static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius*9/5)+32;
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int option;
        do 
        {
            System.out.println("Seleccione la conversion que desea realizar:");
            System.out.println("1. Metros a Kilometros");
            System.out.println("2. Libras a Kilogramos");
            System.out.println("3. Celsius a Fahrenheit");
            System.out.println("4. Salir");
            System.out.print("Ingrese su eleccion: ");
            option=input.nextInt();
            switch(option) 
            {
                case 1:
                    System.out.print("Ingrese la cantidad en metros ");
                    double meters=input.nextDouble();
                    System.out.println(meters+" metros son "+metersToKilometers(meters)+" kilómetros");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad en libras ");
                    double pounds=input.nextDouble();
                    System.out.println(pounds+" libras son "+poundsToKilograms(pounds)+" kilogramos");
                    break;
                case 3:
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    double celsius=input.nextDouble();
                    System.out.println(celsius+" grados Celsius son "+celsiusToFahrenheit(celsius)+" grados Fahrenheit");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } 
        while(option!=4);
        input.close();
    }
}