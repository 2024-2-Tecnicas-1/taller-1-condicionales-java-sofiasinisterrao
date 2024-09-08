package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        if (numVictoriasA >= 7 && numVictoriasB <= 5 && numVictoriasA - numVictoriasB >= 2) {
            return "Ganó A";
        }
        if (numVictoriasB >= 7 && numVictoriasA <= 5 && numVictoriasB - numVictoriasA >= 2) {
            return "Ganó B";
        }
        
        // Comprobar empate a 6 juegos
        if (numVictoriasA == 7 && numVictoriasB == 6) {
            return "Ganó A";
        }
        if (numVictoriasB == 7 && numVictoriasA == 6) {
            return "Ganó B";
        }
        
        // Comprobar si el set está en curso
        if (numVictoriasA < 7 && numVictoriasB < 7) {
            return "Aún no termina";
        }
        
        // Comprobar resultados inválidos
        if ((numVictoriasA >= 8 || numVictoriasB >= 8) || 
            (numVictoriasA > 7 && numVictoriasB > 7) || 
            (Math.abs(numVictoriasA - numVictoriasB) > 2)) {
            return "Inválido";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
