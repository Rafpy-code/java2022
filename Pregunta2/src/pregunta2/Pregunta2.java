package pregunta2;

/*
*@author Ramón Portalanza
 */
public class Pregunta2 {

    // Declaración de constantes, variables
    public static final int HARINA_MINIMA = 600;
    public static final int RACION = 200;
    public static final double LEVADURA_INFERIOR = 0.1;
    public static final double LEVADURA_MEDIA = 0.15;
    public static final double LEVADURA_SUPERIOR = 0.2;
    public static final double LEVADURA_BLAT_MORO = 1.75;

    public static double harinaNecesaria = 800, levaduraNecesaria, levaduraTotal;
    public static boolean harinaBlatMoro = false; //Cambiar según la harina solicitada.

    public static void main(String[] args) {
        // Realizo los cálculos solicitados
        if (harinaNecesaria < HARINA_MINIMA) {
            System.out.println("No hay harina suficiente para realizar el pastel!");
        } else {
            if (harinaBlatMoro == true) {
                if (harinaNecesaria < 1000) {
                    levaduraNecesaria = harinaNecesaria * LEVADURA_INFERIOR * LEVADURA_BLAT_MORO;
                } else if (harinaNecesaria >= 1000 && harinaNecesaria <= 1500) {
                    levaduraNecesaria = harinaNecesaria * LEVADURA_MEDIA * LEVADURA_BLAT_MORO;
                } else if (harinaNecesaria > 1500) {
                    levaduraNecesaria = harinaNecesaria * LEVADURA_SUPERIOR * LEVADURA_BLAT_MORO;
                }
                levaduraTotal = levaduraNecesaria;
                System.out.println("Levadura total: " + levaduraTotal);

            } else {
                if (harinaNecesaria < 1000) {
                    levaduraNecesaria = harinaNecesaria * LEVADURA_INFERIOR;
                } else if (harinaNecesaria >= 1000 && harinaNecesaria <= 1500) {
                    levaduraNecesaria = harinaNecesaria * LEVADURA_MEDIA;
                } else if (harinaNecesaria > 1500) {
                    levaduraNecesaria = harinaNecesaria * LEVADURA_SUPERIOR;
                }
                levaduraTotal = levaduraNecesaria;
                System.out.println("Levadura total: " + levaduraTotal);
            }

        }

    }

}
