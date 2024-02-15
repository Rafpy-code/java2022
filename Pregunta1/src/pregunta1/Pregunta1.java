package pregunta1;
/*
 * @author Ramón Portalanza
 */
public class Pregunta1 {

    // Declaración de constantes, variables
    public static boolean familiaNumerosa = true; //Cambiar los valores true/false para ver las diferentes etapas
    public static boolean becaAnterior = false;
    public static boolean apruebaCursoPasado = true;
    public static boolean cursaGradoMedio = true;

    public static int beca, material;

    public static void main(String[] args) {
        // Realizo las comprovaciones solicitadas para la beca
        if (cursaGradoMedio == true) {
            if (familiaNumerosa == true) {
                if (becaAnterior == true) {
                    if (apruebaCursoPasado) {
                        beca = 2500;
                        material = 600;
                    } else {
                        beca = 1000;
                        material = 150;
                    }

                } else {
                    if (apruebaCursoPasado) {
                        beca = 3000;
                        material = 800;
                    } else {
                        beca = 1200;
                        material = 200;
                    }
                }

            } else {
                if (apruebaCursoPasado == true) {
                    beca = 800;
                    material = 250;
                }
            }
        System.out.println("\tObtiene: \nbeca: " + beca +  "\nmaterial: " + material);

        } else {
            System.out.println("En aquests moments no hi ha cap bonificació disponible");
        }

    }

}
