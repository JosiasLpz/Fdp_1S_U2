import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Ejercicio4 
{
    public static void main(String[] args) 
    {        
        List<String> subjects=new ArrayList<>();
        List<String> verbs=new ArrayList<>();
        List<String> complements=new ArrayList<>();      
        subjects.add("El gato");
        subjects.add("La abuela");
        subjects.add("Un programador");
        subjects.add("El vecino");
        verbs.add("come");
        verbs.add("observa");
        verbs.add("escribe");
        verbs.add("construye");
        complements.add("una pizza.");
        complements.add("el atardecer.");
        complements.add("una linea de codigo.");
        complements.add("un castillo de arena.");        
        Random aleatorio=new Random();
        String randomSubject=subjects.get(aleatorio.nextInt(subjects.size()));
        String randomVerb=verbs.get(aleatorio.nextInt(verbs.size()));
        String randomComplement=complements.get(aleatorio.nextInt(complements.size()));  
        String phrase=randomSubject+" "+randomVerb+" "+randomComplement;
        System.out.println("Frase generada "+phrase);
    }
}