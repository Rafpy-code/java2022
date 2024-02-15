package arrays;

import java.util.Scanner;
/*
 * @author Ramón Portalanza
 */
public class ArrayB {

    //Declaro las constantes.
    public static final int CODIGO_MINIMO = 0;
    public static final int CODIGO_MAXIMO = 1000;
    public static void main(String[] args) {

        //Declaro las variables.
        System.out.print("¿Cuántos usuarios desea ingresar? -> ");
        Scanner scanner = new Scanner(System.in);
        boolean correcto = scanner.hasNextInt();
        int codigoUsuario, numUsuarios;    
        int[] usuarios;
        
        //Compruebo que sea un entero.
        if (correcto) {
            //Recojo el valor del tamaño del array.
            numUsuarios = scanner.nextInt();
            
            //Creo el array con la dimensión solicitada.
            usuarios = new int[numUsuarios];

            //Con el bucle for voy llenando el array.
            for (int i = 0; i < numUsuarios; i++) {
                System.out.print("Ingrese el código de usuario, valores entre [0 - 1000] -> ");
                
                //Compruebo que el codigo sea un entero.
                if (correcto) {
                    //Recojjo el valor.
                    codigoUsuario = scanner.nextInt();
                    
                    //Compruebo si el codigo está dentro del rango solicitado.
                    if (codigoUsuario >= CODIGO_MINIMO && codigoUsuario <= CODIGO_MAXIMO) {
                        //Agrego a cada posición el código correspondiente.
                        usuarios[i] = codigoUsuario;
                        //ystem.out.println("Código correcto.");
                    } else {
                        //Si el código está fuera de rango, resto 1 al valor de i para que no asigne el valor 0 al array.
                        i--;
                        System.out.println("No es un código válido");
                    }
                }
            }
            //Imprimo el tamaño del array.
            System.out.println("Se han registrado: " + usuarios.length + " usuarios.");
            
            //foreach o for mejorado.
            for (int usuario : usuarios) {
                System.out.println(usuario);
            }
        } else {
            System.out.println("No es un entero!");
        }

    }
}
