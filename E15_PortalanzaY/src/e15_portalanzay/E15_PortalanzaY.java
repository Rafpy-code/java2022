package e15_portalanzay;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Ramón Portalanza
 */
public class E15_PortalanzaY {

    //Declaración de constantes.
    public static final int LIMITE = 4;
    public static final int MAX = 10;

    public static void main(String[] args) {
        // Declaración de variables, arrays, Random
        Scanner scanner = new Scanner(System.in);
        String password = "";
        String[] usuario;
        Random random = new Random();

        //Recojo el valor ingresado.
        System.out.print("Ingrese su nombre y apellido: ");
        String texto = scanner.nextLine();

        //Con el método split se separa el String, en este caso por el espacio " " y crea el array.
        usuario = texto.split(" ");

        //Con el bucle for recorro el array, en este caso tiene 2 elementos, de los cuales se recoje un sólo caracter de cada una. 
        for (int i = 0; i < LIMITE / 2; i++) {
            password += usuario[0].charAt(i);
            password += usuario[1].charAt(i);
        }

        //Con este for voy agragando los 4 números que se han generado con random.
        for (int i = 0; i < LIMITE; i++) {
            //Genera valores random de: 0-9
            int int_random = random.nextInt(MAX);
            password += int_random;
        }

        //Imprimo el String de los valores recogidos en los dos for.
        System.out.println("Su password es: " + password);
    }
}
