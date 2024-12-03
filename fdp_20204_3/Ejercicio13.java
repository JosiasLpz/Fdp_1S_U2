package fdp_20204_3;
import java.util.*;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.println("Compatibilidad Zodiacal");
        System.out.println("Introduce tu signo zodiacal (ejemplo: Aries, Tauro, Geminis):");      
        String signo = input.nextLine().toLowerCase(); 
        switch (signo) {
            case "aries":
            case "leo":
            case "sagitario":
                System.out.println("Eres un signo de FUEGO.");
                System.out.println("Compatibles con: Signos de FUEGO (Aries, Leo, Sagitario) y AIRE (Geminis, Libra, Acuario).");
                break;
            case "geminis":
            case "libra":
            case "acuario":
                System.out.println("Eres un signo de AIRE.");
                System.out.println("Compatibles con: Signos de AIRE (Geminis, Libra, Acuario) y FUEGO (Aries, Leo, Sagitario).");
                break;
            case "cancer":
            case "escorpion":
            case "piscis":
                System.out.println("Eres un signo de AGUA.");
                System.out.println("Compatibles con: Signos de AGUA (Cáncer, Escorpión, Piscis) y TIERRA (Tauro, Virgo, Capricornio).");
                break;
            case "tauro":
            case "virgo":
            case "capricornio":
                System.out.println("Eres un signo de TIERRA.");
                System.out.println("Compatibles con: Signos de TIERRA (Tauro, Virgo, Capricornio) y AGUA (Cáncer, Escorpión, Piscis).");
                break;
            default:
                System.out.println("Signo no reconocido. Por favor, introduce un signo zodiacal valido.");
        }        
        input.close();             
    }    
}