package fidelitzacioclientsampliacions;

import java.util.Scanner;

/*
 * @author Ramón Portalanza
 */
public class FidelitzacioClientsAmpliacions {

    //Declaración de variables, constantes, scanner, color de textos de salida.
    private static final int ID_MIN = 111;
    private static final int ID_MAX = 999;
    private static final int EDAT_MIN = 14;
    private static final int EDAT_MAX = 120;
    private static final int TIPUS_MIN = 0;
    private static final int TIPUS_MAX = 3;
    private static final int IMPORT_COMPRA_MIN = 0;
    private static final int IMPORT_COMPRA_MAX = 1000;
    private static final int TELEFON_MIN = 111111111;
    private static final int TELEFON_MAX = 999999999;

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static int id, edat, tipusVenda, importCompra, telefonContacte;
    public static int intentosId, intentosEdat, intentosTipusVenda, intentosImport, intentosTelefon;
    public static String tipus;
    public static boolean error = false;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t=====Fidelizació de Clients Ampliacions=====");

        //Mientras no se supere el número de intentos el programa continúa la ejecución.
        while (intentosId < 3) {
            //Con scanner rercojo los valores del usuario.
            System.out.print("Id: ");
            id = scanner.nextInt();

            //Una vez otengo los valores, comienzo a realizar el control de que los valores introducidos sean los permitidos.
            if (id >= ID_MIN && id <= ID_MAX) {
                intentosId = 3;
                //Mientras no se supere el número de intentos el programa continúa la ejecución.
                while (intentosEdat < 3) {
                    System.out.print("Edat: ");
                    edat = scanner.nextInt();

                    if (edat >= EDAT_MIN && edat <= EDAT_MAX) {
                        intentosEdat = 3;
                        //Mientras no se supere el número de intentos el programa continúa la ejecución.
                        while (intentosTipusVenda < 3) {
                            System.out.println("""
                                               SELECCIONEU UNA OPCI\u00d3 
                                                   Venta lliure (0) 
                                                   Pensionista  (1)
                                                   Carnet jove  (2)
                                                   Soci         (3)
                                               """);
                            System.out.print("Tipus de Venda: ");
                            tipusVenda = scanner.nextInt();

                            if (tipusVenda >= TIPUS_MIN && tipusVenda <= TIPUS_MAX) {
                                intentosTipusVenda = 3;
                                //Aquí recojo el valor para tipus según la opción introducida.
                                switch (tipusVenda) {
                                    case 0 ->
                                        tipus = "Venta lliure";
                                    case 1 ->
                                        tipus = "Pensionista ";
                                    case 2 ->
                                        tipus = "Carnet Jove ";
                                    case 3 ->
                                        tipus = "Soci        ";
                                    default ->
                                        System.err.println("Tipus de Venda incorrecte!");
                                }
                                //Mientras no se supere el número de intentos el programa continúa la ejecución.
                                while (intentosImport < 3) {
                                    System.out.print("Import de la Compra: ");
                                    importCompra = scanner.nextInt();

                                    if (importCompra >= IMPORT_COMPRA_MIN && importCompra <= IMPORT_COMPRA_MAX) {
                                        intentosImport = 3;
                                        //Mientras no se supere el número de intentos el programa continúa la ejecución.
                                        while (intentosTelefon < 3) {
                                            System.out.print("Telefòn de Contacte: ");
                                            telefonContacte = scanner.nextInt();

                                            //Si todos los datos son correctos se imprimen los datos y el programa finaliza.
                                            if (telefonContacte >= TELEFON_MIN && telefonContacte <= TELEFON_MAX) {
                                                intentosTelefon = 3;
                                                System.out.println("Datos introducidos correctamente!");
                                                System.out.println();

                                                //Aquí realizo el incremento de los intentos e igualo las demás variables de intentos al máximo para que no me vuelva a pedir los datos.
                                            } else {
                                                intentosTelefon++;

                                                System.err.println("Telefon: Incorrecte! \tIntento: " + intentosTelefon);
                                                //Si se supera el número de intentos el programa finaliza.
                                                if (intentosTelefon == 3) {
                                                    error = true;
                                                }
                                            }
                                        }
                                        //Aquí realizo el incremento de los intentos e igualo las demás variables de intentos al máximo para que no me vuelva a pedir los datos.
                                    } else {
                                        intentosImport++;

                                        System.err.println("Import: Incorrecte! \tIntento: " + intentosImport);
                                        //Si se supera el intento de los errores se termina el programa.
                                        if (intentosImport == 3) {
                                            error = true;
                                        }
                                    }
                                }
                                //Aquí realizo el incremento de los intentos e igualo las demás variables de intentos al máximo para que no me vuelva a pedir los datos.
                            } else {
                                intentosTipusVenda++;

                                System.err.println("TipusVenda: Incorrecte! \tIntento: " + intentosTipusVenda);
                                //Si se supera el número de intentos el programa finaliza.
                                if (intentosTipusVenda == 3) {
                                    error = true;
                                }
                            }
                        }
                        //Aquí realizo el incremento de los intentos e igualo las demás variables de intentos al máximo para que no me vuelva a pedir los datos.
                    } else {
                        intentosEdat++;

                        System.err.println("Edat: Incorrecte! \tIntento: " + intentosEdat);
                        //Si se supera el número de intentos el programa finaliza.
                        if (intentosEdat == 3) {
                            error = true;
                        }
                    }
                }
                //Aquí realizo el incremento de los intentos.
            } else {
                intentosId++;
                System.err.println("ID: Incorrecte! \tIntento: " + intentosId);
                //Si se supera el número de intentos el programa finaliza.
                if (intentosId == 3) {
                    error = true;
                }
            }
        }
        //Aquí imprimo los resultados según el valor de la bandera 'error'.
        if (error == true) {
            System.err.println("Els valors introduïts són incorrectes! ***Fi***");

        } //Si todos los datos son correctos se imprimen los datos y el programa finaliza.
        else {
            System.out.println(ANSI_PURPLE + "\tId \tEdat \tTipus \t\t\tImport \tTelefòn de Contacte" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "\t" + id + "\t" + edat + "\t" + tipus + "\t\t" + importCompra + "\t" + telefonContacte);
        }
    }
}
