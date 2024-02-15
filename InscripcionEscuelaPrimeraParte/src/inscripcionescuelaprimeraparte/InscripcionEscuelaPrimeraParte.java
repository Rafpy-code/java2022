package inscripcionescuelaprimeraparte;

import java.util.Scanner;
/*
 * @author Ramón Portalanza
El programa pedirá:
- Número de registro del niño
- Si tiene algún hermano en el centro
- Si vive en la zona de la escuela
- Si el padre o la madre trabajan en la zona de la escuela
- Si tiene alguna discapacidad o enfermedad crónica
- Si forma parte de una familia numerosa o monoparental
- Si el padre, madre o algún hermano son ex-alumnos
    1. 
       
    2. P:
   
 */
public class InscripcionEscuelaPrimeraParte {

    public static void main(String[] args) {

        //Declaración de variables
        int numeroRegistro; //Debe ser mayor que 0 y menor que 500.
        int hermanosCentro; //Si tiene al menos un hermano en el centro, tiene 40 puntos.
        // De los 2 siguentes por proximidad en ningún caso se suman estos dos criterios, se elige el que dé mayor puntuación.
        int viveZonaEscuela; //Si vive en la misma población, tiene 30 puntos.
        int padresTrabajan; //Si el padre o madre trabaja en la misma población, tiene 20 puntos.
        int discapacidad; //Si tiene alguna discapacidad igual o superior al 33% o enfermedad crónica: 10 puntos.
        int familiaNumerosaMonoparental; // Si forma parte de una familia numerosa o monoparental: 15 puntos.
        int padreMadreTutorHermanoEscolarizado; //Si el padre, madre, tutor legal o hermano ha sido escolarizado en la misma escuela: 5 puntos.
        int puntuacion = 0;
        //Scanner para recoger los valores ingresados por el usuario.
        Scanner sc = new Scanner(System.in);

        System.out.println("\t=====Bienvenidos a la Inscripción Escolar=====");

        //Solicitud de valores a los usuarios.
        System.out.print("Ingrese el Número de registro: ");
        numeroRegistro = sc.nextInt();

        System.out.print("¿Tiene al menos un hermano en el centro? Sí ingrese 1, No ingrese 0: ");
        hermanosCentro = sc.nextInt();
        if (hermanosCentro == 1) {
            hermanosCentro = 40;
            puntuacion = puntuacion + hermanosCentro;
        }

        System.out.print("¿Vive en la misma población? Sí ingrese 1, No ingrese 0: ");
        viveZonaEscuela = sc.nextInt();

        System.out.print("¿El padre o madre trabaja en la misma población? Sí ingrese 1, No ingrese 0: ");
        padresTrabajan = sc.nextInt();

        //Si las dos preguntas anteriores son SÍ sumo sólo la puntuación mayor.
        if (viveZonaEscuela == 1 && padresTrabajan == 1) {
            viveZonaEscuela = 30;
            puntuacion = puntuacion + viveZonaEscuela;
        } else if (viveZonaEscuela == 1 && padresTrabajan == 0) {
            viveZonaEscuela = 30;
            puntuacion = puntuacion + viveZonaEscuela;
        } else if (viveZonaEscuela == 0 && padresTrabajan == 1) {
            padresTrabajan = 20;
            puntuacion = puntuacion + padresTrabajan;
        }

        System.out.print("¿Tiene alguna discapacidad igual o superior al 33% o enfermedad crónica? Sí ingrese 1, No ingrese 0: ");
        discapacidad = sc.nextInt();
        if (discapacidad == 1) {
            discapacidad = 10;
            puntuacion = puntuacion + discapacidad;
        }

        System.out.print("¿Forma parte de una familia numerosa o monoparental? Sí ingrese 1, No ingrese 0: ");
        familiaNumerosaMonoparental = sc.nextInt();
        if (familiaNumerosaMonoparental == 1) {
            familiaNumerosaMonoparental = 15;
            puntuacion = puntuacion + familiaNumerosaMonoparental;
        }

        System.out.print("¿El padre, madre, tutor legal o hermano ha sido escolarizado en la misma escuela? Sí ingrese 1, No ingrese 0: ");
        padreMadreTutorHermanoEscolarizado = sc.nextInt();
        if (padreMadreTutorHermanoEscolarizado == 1) {
            padreMadreTutorHermanoEscolarizado = 5;
            puntuacion = puntuacion + padreMadreTutorHermanoEscolarizado;
        }

	  //Imprimo los resultados obtenidos.
        System.out.println();
        System.out.println("=====Resultados=====");
        System.out.println("El alumno con número de registro: " + numeroRegistro);
        System.out.println("Ha obtenido una puntuación de: " + puntuacion);
    }

}
