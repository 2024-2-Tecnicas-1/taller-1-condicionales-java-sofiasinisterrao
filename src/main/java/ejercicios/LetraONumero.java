
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        if (Character.isDigit(caracter)) {
            // Si el carácter es un dígito
            return "Es número";
        } else if (Character.isLetter(caracter)) {
            // Si el carácter es una letra
            if (Character.isUpperCase(caracter)) {
                return "Es letra mayúscula";
            } else if (Character.isLowerCase(caracter)) {
                return "Es letra minúscula";
            }
        }
        // Si no es ni letra ni número
        return "No es letra ni número";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
