package ejercicios;

import static ejercicios.SetDeTenis.evaluar;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // TODO: Coloca aquí el código del ejercicio 6: Eda
        LocalDate currentDate = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
        int edad = currentDate.getYear() - fechaNacimiento.getYear();
        if (currentDate.getDayOfYear() < fechaNacimiento.getDayOfYear()) {
            edad--; // Si no ha cumplido años aún este año
        }

        // Retornar la edad como un String
        return "Tu edad es: " + edad + " años.";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
