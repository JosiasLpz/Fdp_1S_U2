package fdp_2024_2;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio2 
{
    public static String generarContrasena(int longitud,boolean incluirLetras,boolean incluirNumeros,boolean incluirEspeciales) 
    {
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros="0123456789";
        String especiales="!@#$%^&*()-_=+[]{}|;:,.<>?";
        String caracteres=""; 
        if(incluirLetras) 
        {
            caracteres+=letras;
        }
        if(incluirNumeros) 
        {
            caracteres+=numeros;
        }
        if(incluirEspeciales) 
        {
            caracteres+=especiales;
        }       
        if(caracteres.isEmpty()) 
        {
            throw new IllegalArgumentException("Debe seleccionar al menos un tipo de carácter.");
        }
        Random random=new Random();
        StringBuilder contrasena=new StringBuilder();        
        for(int i=0;i<longitud;i++) 
        {
            int index=random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(index));
        }
        return contrasena.toString();
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);        
        System.out.print("Ingrese la longitud de la contrasena ");
        int longitud=input.nextInt();
        // Pedir preferencias del usuario
        System.out.print("Incluir letras? (s/n) ");
        boolean incluirLetras=input.next().equalsIgnoreCase("s");
        System.out.print("Incluir numeros? (s/n) ");
        boolean incluirNumeros=input.next().equalsIgnoreCase("s");
        System.out.print("Incluir caracteres especiales? (s/n) ");
        boolean incluirEspeciales=input.next().equalsIgnoreCase("s");
        // Generar y mostrar la contraseña
        String contrasena=generarContrasena(longitud, incluirLetras, incluirNumeros, incluirEspeciales);
        System.out.println("Contrasena generada: " + contrasena);
        input.close();
    }
}