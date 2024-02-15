package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Ramón Portalanza
 */
public class ArrayC {
    
    //Declaro las constantes.
    public static final int CODIGO_MINIMO = 0;
    public static final int CODIGO_MAXIMO = 1000;

    public static void main(String[] args) {

        //Declaro las varables.
        Scanner scanner = new Scanner(System.in);
        boolean correcto;
        int codigoUsuario, numUsuarios = 0, posicionAuxiliar;
        int[] usuarios;

        System.out.print("¿Cuántos usuarios desea ingresar? -> ");

        //Compruebo que sea un entero.
        correcto = scanner.hasNextInt();
        if (correcto) {
            //Recojo el valor del tamaño del array.
            numUsuarios = scanner.nextInt();
            //Limpio el boofer del scanner.
            scanner.nextLine();

            //Creo el array con la dimensión solicitada.
            usuarios = new int[numUsuarios];

            //Con el bucle for voy llenando el array.
            for (int i = 0; i < numUsuarios; i++) {
                System.out.print("Ingrese el código de usuario, valores entre [0 - 1000] -> ");

                //Compruebo que el código sea un entero.
                if (correcto) {
                    //Recojjo el valor.
                    codigoUsuario = scanner.nextInt();
                    //Limpio el boofer del scanner.
                    scanner.nextLine();

                    //Compruebo si el codigo está dentro del rango solicitado.
                    if (codigoUsuario >= CODIGO_MINIMO && codigoUsuario <= CODIGO_MAXIMO) {
                        //Agrego a cada posición el código correspondiente.
                        usuarios[i] = codigoUsuario;
                        //System.out.println("Código correcto.");
                    } else {
                        //Si el código está fuera de rango, resto 1 al valor de i para que no asigne el valor 0 al array.
                        i--;
                        System.out.println("\tNo es un código válido");
                    }
                }
            }
            //Imprimo el tamaño del array.
            System.out.println("Se han registrado: " + usuarios.length + " usuarios.");

            //Imprimo el array original con un bucle for.
            System.out.println("\nArray ORIGINAL");
            //foreach o for mejorado.
            for (int usuario : usuarios) {
                System.out.println(usuario);
            }

            //Utilizo un bucle for anidado para ir cambiando las posiciones del array original.
            for (int i = 0; i < usuarios.length - 1; i++) {
                for (int j = i + 1; j < usuarios.length; j++) {

                    //Si el primer valor es mayor que el segundo.
                    if (usuarios[i] > usuarios[j]) {
                        //Utilizo una variable para guardar la posición mayor.
                        posicionAuxiliar = usuarios[i];
                        //Asigno a la primera posición el valor de la segunda.
                        usuarios[i] = usuarios[j];
                        //Asigno a la segunda posición el valor mayor.
                        usuarios[j] = posicionAuxiliar;
                    }
                }
            }
            //Imprimo los valores del array ordenado, usando un bucle for.
            System.out.println("\nArray ORDENADO");
            for (int i = 0; i < numUsuarios; i++) {
                System.out.println(usuarios[i]);
            }
        } else {
            System.out.println("No ha ingresado un número entero.");
        }
    }
}
