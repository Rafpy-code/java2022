package ejercicio3;

/*
 * @author Ramón Portalanza
 */
public class Temperatura {

    //Declaración de variables.
    public static double temperatura = 39.30D;
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
