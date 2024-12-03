package fdp_20204_3;
import java.util.*;
public class EJercicio12{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al menu de pizzas. Seleccione una opcion:");
        System.out.println("1. Italiana");
        System.out.println("2. Carnes Frías");
        System.out.println("3. Vegetariana");
        System.out.println("4. Pepperoni");
        System.out.println("5. Hawaiana");
        System.out.println("6. Mexicana");
        System.out.println("7. Camarón");       
        System.out.print("Ingrese el numero de la opcion deseada: ");
        int opcion = input.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La pizza Italiana contiene: Tomate, mozzarella, albahaca y aceite de oliva.");
                break;
            case 2:
                System.out.println("La pizza de Carnes Frías contiene: Tomate, mozzarella, pepperoni, jamon y salami.");
                break;
            case 3:
                System.out.println("La pizza Vegetariana contiene: Tomate, mozzarella, pimientos, champiñones, cebolla y aceitunas.");
                break;
            case 4:
                System.out.println("La pizza Pepperoni contiene: Tomate, mozzarella y pepperoni.");
                break;
            case 5:
                System.out.println("La pizza Hawaiana contiene: Tomate, mozzarella, jamon y piña.");
                break;
            case 6:
                System.out.println("La pizza Mexicana contiene: Tomate, mozzarella, chorizo, jalapeños y frijoles.");
                break;
            case 7:
                System.out.println("La pizza de Camarón contiene: Tomate, mozzarella, camarones y ajo.");
                break;
            default:
                System.out.println("Opcion no valida. Por favor, elija un numero entre 1 y 7.");
        }    
        input.close();
    }    
}