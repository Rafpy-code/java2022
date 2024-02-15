package inscripcionescuelasegundaparte;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Ramón Portalanza  
 */
public class InscripcionEscuelaSegundaParte {

    public static void main(String[] args) {

        //Declaración de variables y constantes.
        int numeroRegistro; //Debe ser mayor que 0 y menor que 500.
        final int HERMANOSCENTRO = 40; //Si tiene al menos un hermano en el centro, tiene 40 puntos.
        // De los 2 siguentes por proximidad en ningún caso se suman estos dos criterios, se elige el que dé mayor puntuación.
        final int VIVEZONAESCUELA = 30; //Si vive en la misma población, tiene 30 puntos.
        final int PADRESTRABAJAN = 20; //Si el padre o madre trabaja en la misma población, tiene 20 puntos.
        final int DISCAPACIDAD = 10; //Si tiene alguna discapacidad igual o superior al 33% o enfermedad crónica: 10 puntos.
        final int FAMILIANUMEROSAMONOPARENTAL = 15; // Si forma parte de una familia numerosa o monoparental: 15 puntos.
        final int PADREMADRETUTORHERMANOESCOLARIZADO = 5; //Si el padre, madre, tutor legal o hermano ha sido escolarizado en la misma escuela: 5 puntos.
        int puntuacion = 0;
        //Scanner para recoger los valores ingresados por el usuario.
        Scanner sc = new Scanner(System.in);

        System.out.println("\t=====Bienvenidos a la Inscripción Escolar=====");

        //Solicitud de valores a los usuarios.
        System.out.print("Ingrese el Número de registro: ");
        //Con el Try Catch intento recoger el valor entero, si se ingresa un valor distinto se captura el error.
        try {
            numeroRegistro = sc.nextInt();

            //Realizo la comprobación de que el número de registro ingresado sea válido para continuar.
            if (numeroRegistro > 0 && numeroRegistro < 500) {

                System.out.print("¿Tiene al menos un hermano en el centro? Sí = 1, No = 0: ");
                int hc = sc.nextInt();
                if (hc == 1) {
                    puntuacion = puntuacion + HERMANOSCENTRO;
                }

                System.out.print("¿Vive en la misma población? Sí = 1, No = 0: ");
                int vze = sc.nextInt();

                System.out.print("¿El padre o madre trabaja en la misma población? Sí = 1, No = 0: ");
                int pt = sc.nextInt();

                //Si las dos preguntas anteriores son SÍ sumo sólo la puntuación mayor.
                if (vze == 1 && pt == 1) {
                    puntuacion = puntuacion + VIVEZONAESCUELA;
                } else if (vze == 1 && pt == 0) {
                    puntuacion = puntuacion + VIVEZONAESCUELA;
                } else if (vze == 0 && pt == 1) {
                    puntuacion = puntuacion + PADRESTRABAJAN;
                }

                System.out.print("¿Tiene alguna discapacidad igual o superior al 33% o enfermedad crónica? Sí = 1, No = 0: ");
                int d = sc.nextInt();
                if (d == 1) {
                    puntuacion = puntuacion + DISCAPACIDAD;
                }

                System.out.print("¿Forma parte de una familia numerosa o monoparental? Sí = 1, No = 0: ");
                int fnm = sc.nextInt();
                if (fnm == 1) {
                    puntuacion = puntuacion + FAMILIANUMEROSAMONOPARENTAL;
                }

                System.out.print("¿El padre, madre, tutor legal o hermano ha sido escolarizado en la misma escuela? Sí = 1, No = 0: ");
                int pmthe = sc.nextInt();
                if (pmthe == 1) {
                    puntuacion = puntuacion + PADREMADRETUTORHERMANOESCOLARIZADO;
                }

                //Imprimo los resultados obtenidos.
                System.out.println("El alumno con número de registro: " + numeroRegistro);
                System.out.println("Ha obtenido una puntuación de: " + puntuacion);

            } else {
                System.out.println("\tEl número de registro ingresado no es válido!");
            }
        } catch (InputMismatchException ime) {
            System.out.println("El registro debe ser un número entero!");
            //System.out.println(ime);
        }
    }
}
