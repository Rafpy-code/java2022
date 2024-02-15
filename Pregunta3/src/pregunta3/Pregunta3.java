package pregunta3;

/*
 * @author Ramón Portalanza
 */
public class Pregunta3 {

    //Declaracion de constantes y variables
    public static final int VALOR_MAXIMO = 10;
    public static int numeroBuscado = 3;
    public static boolean encontrado = false;

    public static void main(String[] args) {
        // Bucle for anidado
        for (int i = 1; i <= VALOR_MAXIMO; i++) {
            for (int j = 1; j <= VALOR_MAXIMO; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // Parte a)
        System.out.println();
        System.out.println("Es mostrin els múltiples dels números senars, en ordre descendent.");
        for (int i = 1; i <= VALOR_MAXIMO; i++) {
            if (i % 2 != 0) {
                System.out.print("Fila " + i + ": ");
                for (int j = VALOR_MAXIMO; j >= 1; j--) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }

        //Parte b)
        System.out.println();
        System.out.println("En el moment en que un dels valors mostrats sigui un valor positiu igual a valorCerca,\nel programa ha deixar de mostrar  nombres.\n");

        for (int i = 1; i <= VALOR_MAXIMO; i++) {
            if (i % 2 != 0) {
                System.out.print("Fila " + i + ": ");
                while (encontrado == false) {
                    for (int j = VALOR_MAXIMO; j >= 1; j--) {
                        System.out.print(i * j + "\t");
                        if (i * j == numeroBuscado + 1) {
                            j = 0;
                            encontrado = true;
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

}
