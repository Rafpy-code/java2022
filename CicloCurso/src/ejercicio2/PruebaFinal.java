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
