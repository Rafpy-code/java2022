/*
Piscina rectangular 1
llarg1: 300  
ample1: 150
profunditat1: 20

Piscina rectangular 2
llarg2: 300
ample2: 80
profunditat2: 35

       1. L'àrea que ocupa cadascuna de les dues piscines
       - area1 ← llarg1 * ample1;
       - area2 ← llarg2 * ample2;
       
       2. El volum d'aigua que pot allotjar cadascuna de les dues piscines
       - volum1 ← area1 * profunditat1;
       - volum2 ← area2 * profunditat2;
       
       3. Els valors d'ample i llarg de l'espai que ocuparien les dues piscines si les posem les dues una al costat de l'altre. Aquest espai tindrà un llarg igual al de qualsevol d'elles (totes dues tenen el mateix llarg), i un ample resultant de sumar els dos amples.
	- ampleTotal ←  ample1 + ample2;
	- llargTotal ← llarg1;

       4. L'àrea que ocuparien les dues piscines quan estan una al costat de l'altre. 
       - areaTotal ← area1 + area2;
       5. El volum d'aigua que allotjarien entre les dues.
       - volumTotal ← volum1 + volum2
       
       6. El programa ha d'doubleercanviar1 els valors de profunditat de les dues piscines i tornar a calcular i mostrar el valor del volum d'aigua que pot encabir cada piscina amb aquestes noves mides. 
       - volum1a ← area1 * profunditat2;
       - volum2a ← area2 * profunditat1;
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
        //Declaración de variables de la Piscina rectangular 1.
        double llarg1 = 300;
        double ample1 = 150;
        double profunditat1 = 20;
        double area1;
        double volum1;
        double volum1a;

        //Declaración de variables de la Piscina rectangular 2.
        double llarg2 = 300;
        double ample2 = 80;
        double profunditat2 = 35;
        double area2;
        double volum2;
        double volum2a;

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
        double llargTotal;

        System.out.println();
        System.out.println("==========CÁLCULOS==========");
        System.out.println();

        //Cálculos del área y el volumen de la piscina 1.
        area1 = llarg1 * ample1;
        volum1 = area1 * profunditat1;
        System.out.println("El área de la piscina 1 es: " + area1);
        System.out.println("El volum de la piscina 1 es: " + volum1);

        //Cálculos del área y el volumen de la piscina 2.
        area2 = llarg2 * ample2;
        volum2 = area2 * profunditat2;
        System.out.println("El área de la piscina 2 es: " + area2);
        System.out.println("El volum de la piscina 2 es: " + volum2);

        //Cálculo del ample y llarg de las 2 piscinas juntas.
        ampleTotal = ample1 + ample2;
        llargTotal = llarg1;
        System.out.println("El ampleTotal de las 2 piscinas juntas es: " + ampleTotal + " y un llargTotal de: " + llargTotal);

        //Recálculo de el volumen de las 2 piscinas intercambiando la profundidad entre ellas.
        volum1a = area1 * profunditat2;
        System.out.println("El volum de la piscina 1 con la profundidad de la piscina 2 es: " + volum1a);

        volum2a = area2 * profunditat1;
        System.out.println("El volum de la piscina 2 con la profundidad de la piscina 1 es: " + volum2a);
    }

}
