package exercici13_portalanzay;

/*
 * @author Ramón Portalanza
 */
public class Exercici13_2da_PortalanzaY {

    public static void main(String[] args) {

        //Se declara un array de valores flotantes.
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f};
        //Declaro las variables.
        float notaAuxiliar1 = 0f, notaAuxiliar2 = 10f;
        float sumaNotas = 0f, notaBaja = 0f, notaMedia = 0f, notaAlta = 0f, elementosArray = arrayNotes.length;

        System.out.println("++++++ NOTAS EXERCICI 2 +++++");

        //Con el bucle for recorro el array para imprimir sus valores.
        for (int i = 0; i < arrayNotes.length; i++) {
            //Imprimo las notas.
            System.out.println((i + 1) + ". Nota: " + arrayNotes[i]);

            //Sumo todos los valorres del array para sacar la media.
            sumaNotas += arrayNotes[i];

            //Realizo la comparación para saber la nota más alta.
            if (arrayNotes[i] > notaAuxiliar1) {
                notaAuxiliar1 = arrayNotes[i];
            }
            notaAlta = notaAuxiliar1;

            //Realizo la comparación para saber la nota más baja.
            if (arrayNotes[i] < notaAuxiliar2) {
                notaAuxiliar2 = arrayNotes[i];
            }
            notaBaja = notaAuxiliar2;
        }

        //Imprimo los resultados.
        System.out.println();
        System.out.println("+++++ RESULTADOS +++++");
        System.out.printf("La nota más alta es: %.2f\n", notaAlta);

        //Realizo el cálculo de la nota media.
        notaMedia = (sumaNotas / elementosArray);

        System.out.printf("La nota media es: %.2f\n", notaMedia);

        System.out.printf("La nota más baja es: %.2f\n", notaBaja);
    }
}
