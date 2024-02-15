package exercici8;

import java.util.Scanner;

/*
 * @author Ramón Portalanza
 */
public class Exercici8 {

    //Declaración de CONSTANTES.
    public static final int MIN = 1;
    public static final int MAX = 20;
    public static final int MIN_MULTIPLO = 0;
    public static final int MAX_MULTIPLO = 100;

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scanner = new Scanner(System.in);
        int numIntroduit, multiplos = MIN_MULTIPLO;
        boolean correcto = true;

        System.out.println("\t=====MULTIPLES D'UN NÚMERO INTRODUÏT=====");

        //Mientras no se cumpla la condición de verdad, el programa se repetirá para obtener los valores correctos.
        while (correcto) {
            System.out.print("Introduïu un número entre l'1 i el 20 -> ");

            //hasNextInt() me devuelve true si el número es entero.
            if (scanner.hasNextInt()) {

                //Asigno el valor introducido a la variable.
                numIntroduit = scanner.nextInt();

                //Compruebo que el número introducido está dentro del rango solicitado.
                if (numIntroduit >= MIN && numIntroduit <= MAX) {

                    //Mientras sea menor que 100 se imprimirán los valores de los multiplos.
                    while (multiplos <= MAX_MULTIPLO) {
                        System.out.println(multiplos);
                        multiplos += numIntroduit;
                    }
                    //Cambio el valor de la bandera para que finalice el programa.
                    correcto = false;
                } else {
                    //El programa se repetirá hasta que se ingrese un número dentro del rango establecido.
                    System.err.println("Fora de rang! ");
                }
            } else {
                //El programa se repetirá hasta que se ingrese un número entero.
                System.err.println("No heu ingressat un número sencer ");
                scanner.nextLine();
            }
        }
    }
}
