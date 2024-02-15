package e14_portalanzay;

/*
 * @author Ramón Portalanza
 */
public class E14_PortalanzaY {

    //Declaro las constantes.
    public static final int NUMERO_CAMPOS = 4; //En este caso hay 4 campos.
    public static final int HOMBRE = 0;
    public static final int MUJER = 1;

    public static void main(String[] args) {

        //Declaro las variables.
        int minTiempoHombre = 0, minTiempoMujer = 0;
        int posGanador = 0, posGanadora = 0;

        //Inicio el array con valores ya establecidos.
        int[][] corredores = {
            //dorsal, sexo, edad, tiempos
            {3457, 1, 51, 52},
            {3467, 1, 32, 41},
            {3568, 0, 14, 57},
            {3570, 0, 12, 63},
            {3571, 1, 45, 63},
            {3572, 0, 17, 46},
            {3573, 0, 12, 44},
            {3574, 0, 30, 42},
            {3575, 1, 24, 77},
            {3576, 0, 57, 48}
        };

        int largoArray = corredores.length;

        //Imprimo el listado de los corredores.
        System.out.println("\tCORREDORES");
        System.out.println("Nº\tDorsal Sexo Edad Tiempos");

        //Con el doble bucle for recorro el array bidimensional para imprimir el listado de los corredores.
        for (int i = 0; i < largoArray; i++) {
            System.out.print((i + 1) + ".\t[ ");
            for (int j = 0; j < NUMERO_CAMPOS; j++) {
                //Con este if else doy los espacios entre campos.
                if (j == NUMERO_CAMPOS - 1) {
                    System.out.print(corredores[i][j] + " ");
                } else {
                    System.out.print(corredores[i][j] + "   ");
                }
            }
            System.out.println("]");
        }
        //for para encontrar el ganador.
        for (int i = 0; i < largoArray; i++) {
            if (corredores[i][1] == HOMBRE) {
                if (minTiempoHombre == 0) {
                    //Asigno el valor de la primera posición de los tiempos a la variable minTiempoHombre.
                    minTiempoHombre = corredores[i][3];
                    //Con el índice i se la posición del ganador.
                    posGanador = i;
                    //Voy comparando los valores de los tiempos para encontrar el menor.  
                } else if (corredores[i][3] < minTiempoHombre) {
                    minTiempoHombre = corredores[i][3];
                    posGanador = i;
                }
                //Para encontrar la ganadora.
            } else {
                if (minTiempoMujer == 0) {
                    //Asigno el valor de la primera posición de los tiempos a la variable minTiempoMujer.
                    minTiempoMujer = corredores[i][3];
                    //Con el índice i se la posición del ganador.
                    posGanadora = i;
                } else if (corredores[i][3] < minTiempoMujer) {
                    minTiempoMujer = corredores[i][3];
                    posGanadora = i;
                }
            }
        }
        //Imprimo los resultados de los ganadores.
        System.out.println();
        System.out.println("Ganador:  [" + corredores[posGanador][0] + " " + corredores[posGanador][1]
                + " " + corredores[posGanador][2] + " " + corredores[posGanador][3] + "]");

        System.out.println("Ganadora: [" + corredores[posGanadora][0] + " " + corredores[posGanadora][1]
                + " " + corredores[posGanadora][2] + " " + corredores[posGanadora][3] + "]");
    }
}
