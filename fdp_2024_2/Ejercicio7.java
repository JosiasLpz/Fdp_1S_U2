package fdp_2024_2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio7 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        // Plantillas de historias
        Map<String, String> templates=new HashMap<>();
        templates.put("1", """
                           Un dia, {nombre} estaba caminando por el {lugar} y encontro un {sustantivo}.
                           De repente, decidio {verbo} muy {adjetivo}. 
                           Fue un dia {adjetivo2} que nunca olvidara.""");
        
        templates.put("2", """
                           {nombre} y su {sustantivo} favorito viajaron al {lugar}.
                           En el camino, decidieron {verbo} para disfrutar del paisaje {adjetivo}.
                           Fue una aventura realmente {adjetivo2}.""");
        // Mostrar opciones de plantillas y elegir una
        System.out.println("Elige una plantilla de historia (1 o 2) ");
        String choice=input.nextLine();
        if(!templates.containsKey(choice)) 
        {
            System.out.println("Opción no válida.");
            return;
        }
        String storyTemplate=templates.get(choice);
        // Definición de tipos de palabras según la plantilla elegida
        Map<String,String> words=new HashMap<>();
        words.put("nombre", "nombre de una persona");
        words.put("sustantivo", "un sustantivo");
        words.put("lugar", "un lugar");
        words.put("verbo", "un verbo");
        words.put("adjetivo", "un adjetivo");
        words.put("adjetivo2", "otro adjetivo");
        // Pedir palabras al usuario y almacenarlas
        Map<String,String> userWords=new HashMap<>();
        for(String key:words.keySet()) 
        {
            System.out.println("Por favor, ingresa "+words.get(key)+" ");
            userWords.put(key, input.nextLine());
        }
        // Reemplazar marcadores en la plantilla con las palabras del usuario
        String story=storyTemplate;
        for(Map.Entry<String,String>entry:userWords.entrySet()) 
        {
            story=story.replace("{"+entry.getKey()+"}", entry.getValue());
        }
        // Mostrar la historia generada
        System.out.println("\n--- Aqui esta tu historia ---");
        System.out.println(story);
    }
}