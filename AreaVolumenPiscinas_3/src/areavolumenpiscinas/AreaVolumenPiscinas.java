/*
Piscina rectangular 1
llarg: 300,3
ample: 150,5
profunditat: 20,5

Piscina rectangular 2
llarg: 300,3
ample: 80,5
profunditat: 35,5
 */
package areavolumenpiscinas;

/**
 *
 * @author Ramón Portalanza
 */
public class AreaVolumenPiscinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de la constante
        final double LLARGTOTAL = 300.3;
        //Declaración de variables de la Piscina rectangular 1.
        double llarg1 = 300.3;
        double ample1 = 150.5;
        double profunditat1 = 20.5;
        int area1;
        int volum1;
        int volum1a;

        //Declaración de variables de la Piscina rectangular 2.
        double llarg2 = 300.3;
        double ample2 = 80.5;
        double profunditat2 = 35.5;
        int area2;
        int volum2;
        int volum2a;

        //Muestro por pantalla los datos de las 2 piscinas.
        System.out.println("\tPISCINA 1 ");
        System.out.println("llarg: " + llarg1);
        System.out.println("ample: " + ample1);
        System.out.println("profunditat: " + profunditat1);

        System.out.println("\tPISCINA 2 ");
        System.out.println("llarg: " + llarg2);
        System.out.println("ample: " + ample2);
        System.out.println("profunditat: " + profunditat2);

        //Declaración de variables adicionales para el ejercicio.
        double ampleTotal;

        System.out.println();
        System.out.println("==========CÁLCULOS==========");
        System.out.println();

        //Cálculos del área y el volumen de la piscina 1.
        area1 = (int)(llarg1 * ample1);
        volum1 = (int) (area1 * profunditat1);
        System.out.println("El área de la piscina 1 es: " + area1);
        System.out.println("El volum de la piscina 1 es: " + volum1);

        //Cálculos del área y el volumen de la piscina 2.
        area2 = (int) (llarg2 * ample2);
        volum2 = (int) (area2 * profunditat2);
        System.out.println("El área de la piscina 2 es: " + area2);
        System.out.println("El volum de la piscina 2 es: " + volum2);

        //Cálculo del ample y llarg de las 2 piscinas juntas.
        ampleTotal = ample1 + ample2;
        System.out.println("El ampleTotal de las 2 piscinas juntas es: " + ampleTotal + " y un llargTotal de: " + LLARGTOTAL);

        //Recálculo de el volumen de las 2 piscinas intercambiando la profundidad entre ellas.
        volum1a = (int) (area1 * profunditat2);
        System.out.println("El volum de la piscina 1 con la profundidad de la piscina 2 es: " + volum1a);

        volum2a = (int) (area2 * profunditat1);
        System.out.println("El volum de la piscina 2 con la profundidad de la piscina 1 es: " + volum2a);
    }

}
