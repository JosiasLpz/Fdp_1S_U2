package fdp_20204_3;
public class Ejercicio14 {
    public static void main(String[] args) {         
        System.out.println("Ciclo for: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();        
        System.out.println("Ciclo while: ");
        int valor = 9; 
        int contador = 1;
        while (contador <= 6) { 
            System.out.print(valor + " ");
            if (contador == 1) {
                valor -= 1; 
            } else {
                valor += 4; 
            }
            contador++;
        }
        System.out.println();        
        System.out.println("Ciclo do-while: ");
        int j = 5;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println(); 
    }    
}