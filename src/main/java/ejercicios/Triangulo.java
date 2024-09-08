package ejercicios;

import java.util.Scanner;

/**
 * Programa para clasificar un triángulo basado en la longitud de sus lados.
 * 
 * @autor danielsanchez
 */
public class Triangulo {
    
    public static String evaluar(double a, double b, double c) {
        // Verificar si los lados cumplen con la desigualdad triangular
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "No es un triángulo válido";
        }

        // Clasificar el triángulo si es válido
        if (a == b && b == c) {
            return "El triángulo es equilátero";
        } else if (a == b || a == c || b == c) {
            return "El triángulo es isósceles";
        } else {
            return "El triángulo es escaleno";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Solicitar la longitud de los lados del triángulo
        System.out.print("a: ");
        double a = lector.nextDouble();
        System.out.print("b: ");
        double b = lector.nextDouble();
        System.out.print("c: ");
        double c = lector.nextDouble();
        
        // Evaluar y mostrar el tipo de triángulo
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
        // Cerrar el Scanner
        lector.close();
    }