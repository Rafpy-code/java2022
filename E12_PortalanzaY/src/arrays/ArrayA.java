package arrays;

import java.util.Scanner;

/*
 * @author Ramón Portalanza
 */
public class ArrayA {

    //Declaro las constantes.
    public static final int CODIGO_MINIMO = 0;
    public static final int CODIGO_MAXIMO = 1000;
    
    public static void main(String[] args) {
        //Declaración de variables.
        Scanner scanner = new Scanner(System.in);
        int codigoUsuario = 0;

        System.out.print("Ingrese el código de usuario, valores entre [0 - 1000] -> ");

        //Compruebo que el número sea entero.
        if (scanner.hasNextInt()) {
            //Asigno el valor a la variable códigoUsuario. 
            codigoUsuario = scanner.nextInt();

            //Realizo la comprobación de que el codigo ingresado esté en el rango solicitado.
            if (codigoUsuario >= CODIGO_MINIMO && codigoUsuario <= CODIGO_MAXIMO) {
                System.out.println("Código correcto.");
            } else {
                System.out.println("No es un código válido");
            }
        }
    }
}
