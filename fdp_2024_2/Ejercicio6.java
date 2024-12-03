package fdp_2024_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio6 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        // Lista de preguntas y respuestas
        List<Question> questions=new ArrayList<>();
        questions.add(new Question("Cual es la capital de Francia?",new String[]{"1. Berlin","2. Madrid","3. Paris", "4. Roma"}, 3));
        questions.add(new Question("Cual es el planeta mas grande del sistema solar?",new String[]{"1. Tierra", "2. Marte", "3. Jupiter", "4. Venus"}, 3));
        questions.add(new Question("Quien escribio 'Hamlet'?",new String[]{"1. Charles Dickens","2. William Shakespeare","3. Mark Twain","4. Jane Austen"}, 2));
        int score=0;
        // Hacer las preguntas al usuario
        for(Question question : questions) 
        {
            System.out.println(question.getText());
            for(String option : question.getOptions()) 
            {
                System.out.println(option);
            }
            System.out.print("Tu respuesta ");
            int answer=input.nextInt();
            // Verificar respuesta
            if(answer==question.getCorrectOption()) 
            {
                System.out.println("Correcto!");
                score++;
            } 
            else 
            {
                System.out.println("Incorrecto. La respuesta correcta es "+question.getCorrectOption());
            }
            System.out.println();
        }
        int a=0;
        // Mostrar puntuación final
        System.out.println("Tu puntuacion final es "+score+"/"+questions.size());
    }
}
class Question 
{
    private String text;
    private String[] options;
    private int correctOption;
    public Question(String text,String[] options,int correctOption) 
    {
        this.text=text;
        this.options=options;
        this.correctOption=correctOption;
    }
    public String getText() 
    {
        return text;
    }
    public String[] getOptions() 
    {
        return options;
    }
    public int getCorrectOption() 
    {
        return correctOption;
    }
}