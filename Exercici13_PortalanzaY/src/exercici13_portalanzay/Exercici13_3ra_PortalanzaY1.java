package exercici13_portalanzay;

/*
 * @author Ramón Portalanza
 */
public class Exercici13_3ra_PortalanzaY1 {

    //Declaro las constantes.
    public static final float EXELENTES = 9f;

    public static void main(String[] args) {

        //Se declara un array de valores flotantes.
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f};
        //Declaro las variables.
        float notaMinima = 0f, notaMaxima = 10f;
        float sumaNotas = 0f, notaBaja = 0f, notaMedia = 0f, notaAlta = 0f, elementosArray = arrayNotes.length;

        System.out.println("++++++ NOTAS EXERCICI 3+++++");

        //Con el bucle for recorro el array para imprimir sus valores.
        for (int i = 0; i < arrayNotes.length; i++) {
            //Imprimo las notas.
            System.out.println((i + 1) + ". Nota: " + arrayNotes[i]);
        }

        //Imprimo los resultados.
        System.out.println();
        System.out.println("+++++ RESULTADOS +++++");
        //Con este for voy imprimiendo los valores de las notas excelentes.
        for (int i = 0; i < arrayNotes.length; i++) {
            //Realizo la comparación para saber las notas que son iguales o superiores a 9.
            if (arrayNotes[i] >= EXELENTES) {
                System.out.printf("\tHay un -> %.2f en la posición %d %n", arrayNotes[i], i + 1);
            }
        }
    }
}
