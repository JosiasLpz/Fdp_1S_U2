package fdp_2024_2;
import java.util.Scanner;
public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // Tasas de cambio predefinidas (por ejemplo, USD a EUR, EUR a JPY)
        double usdToEur=0.85;
        double eurToJpy=130.5;
        double usdToJpy=110.0;
        // Solicitar al usuario los datos de entrada
        System.out.println("Ingrese la cantidad a convertir:");
        double amount=input.nextDouble();
        System.out.println("Seleccione la moneda de origen (USD, EUR, JPY):");
        String fromCurrency=input.next().toUpperCase();
        System.out.println("Seleccione la moneda de destino (USD, EUR, JPY):");
        String toCurrency=input.next().toUpperCase();
        double result=0;
        // Conversión entre divisas
        if(fromCurrency.equals("USD")&&toCurrency.equals("EUR")) 
        {
            result=amount*usdToEur;
        }
        else if(fromCurrency.equals("EUR")&&toCurrency.equals("JPY")) 
        {
            result=amount*eurToJpy;
        } 
        else if(fromCurrency.equals("USD")&&toCurrency.equals("JPY")) 
        {
            result=amount*usdToJpy;
        }
        else if(fromCurrency.equals(toCurrency))
        {
            result =amount;
            System.out.println("La moneda de origen y destino son iguales. No hay conversión necesaria.");
        }
        else 
        {
            System.out.println("Conversión no disponible para las divisas seleccionadas.");
            return;
        }
        // Mostrar el resultado
        System.out.printf("%.2f %s son %.2f %s%n", amount, fromCurrency, result, toCurrency);
    }
}