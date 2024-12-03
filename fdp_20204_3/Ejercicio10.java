package fdp_20204_3;
import java.util.*;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese la edad de la chica ");
        int edadChica=input.nextInt();
        System.out.println("Ingrese la edad del chico ");
        int edadChico=input.nextInt();
        System.out.println("Ingrese la estatura del chico en metros ");
        double estaturaChico=input.nextDouble();
        input.nextLine(); // Limpiar el buffer   
        System.out.println("Ingrese el artista favorito del chico ");
        String artistaFavoritoChico=input.nextLine();
        if(edadChico>edadChica&&estaturaChico>=1.80&&artistaFavoritoChico.equalsIgnoreCase("BTS")){
            System.out.println("El chico cumple con las caracteristicas que busca la chica.");
        }
        else 
        {
            System.out.println("El chico no cumple con las caracteristicas que busca la chica.");
        }
        input.close();     
    }   
}