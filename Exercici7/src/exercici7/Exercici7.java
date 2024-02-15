package exercici7;

import java.util.Scanner;

/*
 * @author Institut Obert de Catalunya Exercici 7. Solució 
 * Modificaciones: Ramón Portalanza
 */
public class Exercici7 {

    //Declaración de variables, constantes.
    public static final int CAT1 = 1;
    public static final int CAT2 = 2;
    public static final int CAT3 = 3;
    public static final int CAT4 = 4;
    public static final int CAT5 = 5;
    public static final int CAT6 = 6;
    public static final int IVA_SRED = 4;
    public static final int IVA_RED = 8;
    public static final int IVA_GNAL = 21;   
    public static final int LIMIT_PREU1 = 101;
    public static final int LIMIT_PREU2 = 501;
    public static final int COSTT_PREU1 = 3;
    public static final int COSTT_PREU2 = 20;
    public static final int COSTT_PREU3 = 50;

    public static void main(String[] args) {

        //Definim tipus de dades        
        int opcio, numUnitats, categoria, iva, cost;
        float preu, preuFinal, preuSIva;
        Scanner scan = new Scanner(System.in);

        //Necessari per a lectura de dades de teclat        
        boolean tipusCorrecte;

        //Mostrem el menu inicial                
        System.out.println("1- Calcular preu final");
        System.out.println("2- Mostrar quin IVA s'aplica");
        System.out.println("3- Cost de l'enviament");
        System.out.print("Entra una opció: ");

        tipusCorrecte = scan.hasNextInt();

        //per analitzar tipus de dada         
        if (tipusCorrecte) {  // si és un número sencer              
            opcio = scan.nextInt();

            if (opcio == 1) {
                //Demanem i llegim dades d'usuari                  
                System.out.print("Preu base: ");
                preu = scan.nextFloat();
                System.out.print("Num.unitats: ");
                numUnitats = scan.nextInt();
                System.out.print("Categoria: ");
                categoria = scan.nextInt();

                //Identifiquem quin es l'IVA a aplicar
                iva = switch (categoria) {
                    case CAT1, CAT2 ->
                        IVA_SRED;
                    case CAT3, CAT4 ->
                        IVA_RED;
                    case CAT5, CAT6 ->
                        IVA_GNAL;
                    default ->
                        IVA_GNAL;
                };

                //calcul i mostra del resultat                
                preuFinal = (preu + preu * iva / 100) * numUnitats;
                System.out.println("El preu final es: " + preuFinal);
            } else {
                if (opcio == 2) {

                    //Demanem i llegim la categoria                      
                    System.out.print("Categoria: ");
                    categoria = scan.nextInt();

                    //Identifiquem quin es l'IVA a aplicar
                    iva = switch (categoria) {
                        case CAT1, CAT2 ->
                            IVA_SRED;
                        case CAT3, CAT4 ->
                            IVA_RED;
                        case CAT5, CAT6 ->
                            IVA_GNAL;
                        default ->
                            IVA_GNAL;
                    };

                    //Calcul i mostra del resultat                    
                    System.out.println("L'Iva aplicat és: " + iva);
                } else {
                    if (opcio == 3) {
                        
                        //Demanem i llegim dades d'usuari                          
                        System.out.print("Preu base: ");
                        preu = scan.nextFloat();
                        System.out.print("Num.unitats: ");
                        numUnitats = scan.nextInt();

                        //Calculem preu sense iva                        
                        preuSIva = preu * numUnitats;

                        //Identifiquem quin es el cost d'enviament                        
                        if (preuSIva < LIMIT_PREU1) {
                            cost = COSTT_PREU1;
                        } else {
                            if (preuSIva < LIMIT_PREU2) {
                                cost = COSTT_PREU2;
                            } else {
                                cost = COSTT_PREU3;
                            }
                        }
                        System.out.println("El cost de l'enviament és: " + cost + " per a una compra de " + preuSIva +" preu sense iva");
                    } else {
                        System.out.println("Error. Has d'entrar 1, 2 o 3.");
                    }
                }
            }
        }
    }  
}