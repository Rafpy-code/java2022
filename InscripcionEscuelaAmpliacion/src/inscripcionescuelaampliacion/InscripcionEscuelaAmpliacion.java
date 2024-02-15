package inscripcionescuelaampliacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Ramón Portalanza  
 */
public class InscripcionEscuelaAmpliacion {

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

                System.out.print("¿Tiene al menos un hermano en el centro? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                int hc = sc.nextInt();
                
                //LOS BLOQUES WHILE LOS USO PARA CADA UNA DE LAS PREGUNTAS.
                //Mientras el valor ingresado sea diferente de 0 o 1 se volverá a repetir el ingreso de un valor correcto.
                while (hc < 0 || hc > 1) {
                    System.out.println("Sólo se admiten los valores: 0 o 1!");
                    System.out.print("¿Tiene al menos un hermano en el centro? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                    hc = sc.nextInt();
                }
                if (hc == 1) {
                    puntuacion = puntuacion + HERMANOSCENTRO;
                }

                System.out.print("¿Vive en la misma población? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                int vze = sc.nextInt();
                while (vze < 0 || vze > 1) {
                    System.out.println("Sólo se admiten los valores: 0 o 1!");
                    System.out.print("¿Vive en la misma población? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                    vze = sc.nextInt();
                }

                System.out.print("¿El padre o madre trabaja en la misma población? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                int pt = sc.nextInt();
                while (pt < 0 || pt > 1) {
                    System.out.println("Sólo se admiten los valores: 0 o 1!");
                    System.out.print("¿El padre o madre trabaja en la misma población? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                    pt = sc.nextInt();
                }

                //Si las dos preguntas anteriores son SÍ sumo sólo la puntuación mayor.
                if (vze == 1 && pt == 1) {
                    puntuacion = puntuacion + VIVEZONAESCUELA;
                } else if (vze == 1 && pt == 0) {
                    puntuacion = puntuacion + VIVEZONAESCUELA;
                } else if (vze == 0 && pt == 1) {
                    puntuacion = puntuacion + PADRESTRABAJAN;
                }

                System.out.print("¿Tiene alguna discapacidad igual o superior al 33% o enfermedad crónica? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                int d = sc.nextInt();
                while (d < 0 || d > 1) {
                    System.out.println("Sólo se admiten los valores: 0 o 1!");
                    System.out.print("¿Tiene alguna discapacidad igual o superior al 33% o enfermedad crónica? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                    d = sc.nextInt();
                }
                
                if (d == 1) {
                    puntuacion = puntuacion + DISCAPACIDAD;
                }

                System.out.print("¿Forma parte de una familia numerosa o monoparental? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                int fnm = sc.nextInt();
                while (fnm < 0 || fnm > 1) {
                    System.out.println("Sólo se admiten los valores: 0 o 1!");
                    System.out.print("¿Forma parte de una familia numerosa o monoparental? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                    fnm = sc.nextInt();
                }
                
                if (fnm == 1) {
                    puntuacion = puntuacion + FAMILIANUMEROSAMONOPARENTAL;
                }

                System.out.print("¿El padre, madre, tutor legal o hermano ha sido escolarizado en la misma escuela? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                int pmthe = sc.nextInt();
                while (pmthe < 0 || pmthe > 1) {
                    System.out.println("Sólo se admiten los valores: 0 o 1!");
                    System.out.print("¿El padre, madre, tutor legal o hermano ha sido escolarizado en la misma escuela? \n0 -> No \n1 -> Sí \n\tRespuesta: ");
                    pmthe = sc.nextInt();
                }
                
                if (pmthe == 1) {
                    puntuacion = puntuacion + PADREMADRETUTORHERMANOESCOLARIZADO;
                }

                //Imprimo los valores obtenidos.
                System.out.println("El alumno con número de registro: " + numeroRegistro);
                System.out.println("Ha obtenido una puntuación de: " + puntuacion);

            } else {
                System.out.println("\tEl número de registro ingresado no es válido!");
            }
        } catch (InputMismatchException ime) {
            System.out.println("El registro/valor debe ser un número entero!");
            //System.out.println(ime);
        }
    }
}