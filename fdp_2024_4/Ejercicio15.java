package fdp_2024_4;
import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);        
        int numCentrosTuristicos = 10;
        int numMeses = 6;     
        int[][] visitantes = new int[numCentrosTuristicos][numMeses];        
        System.out.println("Ingrese el número de visitantes para cada centro turístico (de enero a junio):");
        for (int i = 0; i < numCentrosTuristicos; i++) {
            System.out.println("Centro turístico " + (i + 1) + ":");
            for (int j = 0; j < numMeses; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                visitantes[i][j] = input.nextInt();
            }
        }        
        System.out.println("\nTotal de visitantes a cada centro turístico en el primer semestre:");
        for (int i = 0; i < numCentrosTuristicos; i++) {
            int totalVisitasCentro = 0;
            for (int j = 0; j < numMeses; j++) {
                totalVisitasCentro += visitantes[i][j];
            }
            System.out.println("Centro turístico " + (i + 1) + ": " + totalVisitasCentro + " visitantes.");
        }       
        int maxVisitasCentro = -1;
        int minVisitasCentro = Integer.MAX_VALUE;
        int centroMasVisitado = -1;
        int centroMenosVisitado = -1;
        int mesMaxVisitasCentroMas = -1;
        int mesMaxVisitasCentroMenos = -1;
        int maxVisitasMes = -1;
        int minVisitasMes = Integer.MAX_VALUE;
        int mesMasVisitado = -1;
        int mesMenosVisitado = -1;        
        for (int i = 0; i < numCentrosTuristicos; i++) {
            int totalVisitasCentro = 0;
            for (int j = 0; j < numMeses; j++) {
                totalVisitasCentro += visitantes[i][j];                
                if (visitantes[i][j] > maxVisitasCentro) {
                    maxVisitasCentro = visitantes[i][j];
                    mesMaxVisitasCentroMas = j + 1; 
                }                
                if (visitantes[i][j] < minVisitasCentro) {
                    minVisitasCentro = visitantes[i][j];
                    mesMaxVisitasCentroMenos = j + 1; 
                }
            }
            if (totalVisitasCentro > maxVisitasCentro) {
                maxVisitasCentro = totalVisitasCentro;
                centroMasVisitado = i + 1;
            }
            if (totalVisitasCentro < minVisitasCentro) {
                minVisitasCentro = totalVisitasCentro;
                centroMenosVisitado = i + 1;
            }
        }       
        for (int j = 0; j < numMeses; j++) {
            int totalVisitasMes = 0;
            for (int i = 0; i < numCentrosTuristicos; i++) {
                totalVisitasMes += visitantes[i][j];
            }
            if (totalVisitasMes > maxVisitasMes) {
                maxVisitasMes = totalVisitasMes;
                mesMasVisitado = j + 1;
            }
            if (totalVisitasMes < minVisitasMes) {
                minVisitasMes = totalVisitasMes;
                mesMenosVisitado = j + 1;
            }
        }       
        System.out.println("\nCentro turístico más visitado: Centro " + centroMasVisitado + " con " + maxVisitasCentro + " visitantes.");
        System.out.println("Mes con más visitantes en este centro: Mes " + mesMaxVisitasCentroMas + " con " + maxVisitasCentro + " visitantes.");
        System.out.println("\nCentro turístico menos visitado: Centro " + centroMenosVisitado + " con " + minVisitasCentro + " visitantes.");
        System.out.println("Mes con menos visitantes en este centro: Mes " + mesMaxVisitasCentroMenos + " con " + minVisitasCentro + " visitantes.");
        System.out.println("\nMes con más afluencia turística: Mes " + mesMasVisitado + " con " + maxVisitasMes + " visitantes.");
        System.out.println("Mes con menos afluencia turística: Mes " + mesMenosVisitado + " con " + minVisitasMes + " visitantes.");
    }   
}