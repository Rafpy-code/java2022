package exercici13_portalanzay;

/*
 * @author Ramón Portalanza
 */
public class Exercici13_1ra_PortalanzaY {

    public static final float MINIMO_SUSPENSOS = 5f;

    public static void main(String[] args) {

        //Declaro las variables.
        float contadorSuspensos = 0;

        //Se declara un array de valores flotantes.
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f};

        System.out.println("++++++ NOTAS EXERCICI 1+++++");
        //Con el bucle for recorro el array para imprimir sus valores.
        for (int i = 0; i < arrayNotes.length; i++) {
            System.out.println((i + 1) + ". Nota: " + arrayNotes[i]);
            //Realizo la comparación de valores para ver saber cuantos suspensos hay suspensos.
            if (arrayNotes[i] < MINIMO_SUSPENSOS) {
                //Voy sumando el contador.
                contadorSuspensos++;
            }
        }
        //Imprimo cuantos suspensos hay.
        System.out.println();
        System.out.println("Hay un total de: " + contadorSuspensos + " suspensos.");

        //Con este bucle for recorro el array y con el if hago la comparación para ver los suspensos. 
        for (int i = 0; i < arrayNotes.length; i++) {
            if (arrayNotes[i] < 5) {
                //Imprimo los resultados que están dentro del rango.
                System.out.println("\tCon la nota: " + arrayNotes[i] + " está suspenso.");
            }
        }
    }
}
