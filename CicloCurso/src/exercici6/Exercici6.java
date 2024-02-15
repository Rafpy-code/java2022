package exercici6;
/*
 * @author Ramón Portalanza
 */
public class Exercici6 {
    
    
}


package ejercicio1;

/*
 * @author Ramón Portalanza
 */
public class CicloCurso {

    //Declaro las variables
    public static int edad = 1; //La edad la voy cambiando para probar todas las opciones del programa.
    public static int ciclo;
    public static int curso;

    public static void main(String[] args) {
        System.out.println("\t=====Informe=====");
        //Realizo las comprobaciones según la edad asignada en la variable declarada anteriormente.
        if (edad < 3) {
            System.out.println("Es demasiado pequeño!");
        } else if (edad < 6) {
            ciclo = 0;
        } else if (edad < 7) {
            curso = 1;
            ciclo = 1;
        } else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        } else if (edad < 9) {
            curso = 3;
            ciclo = 2;
        } else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        } else if (edad < 11) {
            curso = 5;
            ciclo = 3;
        } else if (edad < 12) {
            curso = 6;
            ciclo = 3;
        } else {
            System.out.println("Es demasiado grande");
            ciclo = -1;
            curso = -1;
        }
        //En el Switch voy imprimiendo los resultados según los valores que se le asigna a la variable ciclo. 
        switch (ciclo) {
            case 0:
                System.out.println("Es de educación infntil.");
                if (edad > 6) {
                    System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                } else {
                    System.out.println("El alumno tiene " + edad + " años y aún no se le asigna ningún curso.");
                }
                break;
            case 1:
                System.out.println("Es de educación primaria, ciclo inicial.");
                System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                break;
            case 2:
                System.out.println("Es de educación primaria, ciclo medio.");
                System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                break;
            case 3:
                System.out.println("Es de educación primaria, ciclo superior.");
                System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                break;
            default:
                System.out.println("No pertenecece a ningún ciclo porque tiene: " + edad + " años.");
        }
    }

}

package ejercicio2;

//import java.text.DecimalFormat;

/*
 * @author Ramón Portalanza
 */
public class PruebaFinal {

    //Declaro las constantes y variables.
    public static final double TOTALLLIURAMENTS = 10.00D; //1 es el 100% de las entregas.
    public static boolean noSeguidaAC = false;
    public static double numLliuraments = 6.00D; //Voy cambiando los porcentajes según las entregas realizadas.
    public static double notaPractiques = 6.00D;
    public static double notaProvaFinal = 10.00D;
    public static double notaLliuraments = 0.00D;
    public static double notaFinal = 0.00D;

    public static void main(String[] args) {
        System.out.println("\t=====Resultados=====");
        System.out.printf("Nota prova final: %.2f\n", notaProvaFinal);
        //Realizo el cálculo del porcentaje del número de entregas.
        numLliuraments = (numLliuraments * TOTALLLIURAMENTS) / 100;
        System.out.printf("Percenttage de Lliuraments: %.2f", numLliuraments);
        System.out.println();

        if (notaProvaFinal < 7) {
            System.out.println("\tSuspés per prova final!");
        } else {
            if (numLliuraments < 0.7) {
                System.out.println("\tSuspés. No has seguit avaluació continua.!");
                noSeguidaAC = true;
            } else if (numLliuraments == 1) {
                notaLliuraments = 10;
            } else if (numLliuraments >= 0.9) {
                notaLliuraments = 8;
            } else if (numLliuraments >= 0.8) {
                notaLliuraments = 6;
            } else if (numLliuraments >= 0.7) {
                notaLliuraments = 4;
            }
        }
        //Realizo el calculo para saber cual será la nota final.
        notaFinal = ((notaProvaFinal * 0.2) + (notaLliuraments * 0.1) + (notaPractiques * 0.7));

        //Muestro las recomendaciones que el alumno debería seguir.
        System.out.println();
        System.out.println("\t=====Recomanacions=====");

        //System.out.println(noSeguidaAC);
        System.out.println("NOTAS OBTENIDAS---------------");
        //Con printf("Nota prova final: %.2f\n", notaProvaFinal) %.2f me permite imprimir el número de decimales que se indique
        System.out.printf("Nota prova final: %.2f\n", notaProvaFinal);
        System.out.printf("Nota lliuraments: %.2f\n", notaLliuraments);
        System.out.printf("Nota pràctiques: %.2f\n", notaPractiques);
        System.out.println("COMPUTO DE LAS NOTAS OBTENIDAS -> notaFinal = (20% de notaProva + 10% notaLLiuraments + 70% notaPractiques)");
        System.out.printf("Nota prova final: %.2f\n", notaProvaFinal * 0.2);
        System.out.printf("Nota lliuraments: %.2f\n", notaLliuraments * 0.1);
        System.out.printf("Nota pràctiques: %.2f\n", notaPractiques * 0.7);
        System.out.printf("\tNota final: %.2f\n", notaFinal);
        if (notaFinal < 5) {
            if (noSeguidaAC) {
                System.out.println("Cal seguir avaluació contínua.");
            } else {
                System.out.println("Fes els exercicis preparatoris per a la PAF2.");
            }
        }
    }

}


package ejercicio3;

/*
 * @author Ramón Portalanza
 */
public class Temperatura {

    //Declaración de variables.
    public static double temperatura = 40.00D;
    public static double edat = 11.00D;
    public static double pes = 15.00D;
    public static double dosiParacetamol;

    public static void main(String[] args) {
        if (temperatura < 38) {
            System.out.println("El nen està bé!");
        } else if (temperatura < 39) {
            System.out.println("Es recomanable donar-li un bany per baixar temperatura.");
            if (edat < 3) {
                System.out.println("Has de consultar al médico.");
            } else if (edat < 12) {
                dosiParacetamol = (15 * pes); //La dosis está medida en mg y el peso en kg.
                System.out.println("Cal donar-li: dosisParacetamol cada 8h " + dosiParacetamol + " mg.");
            } else if (edat <= 12) {
                dosiParacetamol = 500;
                System.out.println("Cal donar-li: dosisParacetamol cada 8h " + dosiParacetamol + " mg.");
            }
        }

        if (temperatura >= 40) {
            System.out.println("Per més de 40 cal portar-lo a l'hospital!!!");
        }
    }

}

