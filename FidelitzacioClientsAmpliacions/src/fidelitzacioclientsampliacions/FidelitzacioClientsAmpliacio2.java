package fidelitzacioclientsampliacions;

import java.util.Scanner;
/*
 * @author Ramón Portalanza
 */
public class FidelitzacioClientsAmpliacio2 {

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
    public static int intentosId, intentosEdat, intentosTipusVenda, intentosImport, intentosTelefon, contadorClientes, masClientes = 1;
    public static String tipus;
    public static boolean error = false, salidaClientes = false;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t*****Fidelizació de Clients Ampliacio 2*****");

        while (!salidaClientes) {
            //Menú principal.
            System.out.println("\n\t###Desea registrar un cliente?###");
            System.out.println("Sí -> 1");
            System.out.println("No -> 0");
            System.out.print("Continuar: ");
            masClientes = scanner.nextInt();
            
            //Si se elige una opción que no está en el menú, se vuelve al menú principal.
            if (masClientes != 1 && masClientes != 0) {
                System.err.println("Trieu una opció correcta");
            }
            //Si la opción es 1, se inicia el programa.
            if (masClientes == 1) {
                //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                while (intentosId < 3) {
                    //Con scanner rercojo los valores introducidos por el usuario.
                    System.out.print("Id: ");
                    id = scanner.nextInt();

                    //Una vez otengo los valores, comienzo a realizar el control de que los valores introducidos sean los permitidos.
                    if (id >= ID_MIN && id <= ID_MAX) {
                        //Si se cumple la condición igualo el contador de los intentos al valor máximo para que no vuelva a repetir el bucle.
                        intentosId = 3;
                        //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                        while (intentosEdat < 3) {
                            System.out.print("Edat: ");
                            edat = scanner.nextInt();

                            if (edat >= EDAT_MIN && edat <= EDAT_MAX) {
                                intentosEdat = 3;
                                //Mientras no se supere el número de intentos, el programa continúa la ejecución.
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
                                        //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                                        while (intentosImport < 3) {
                                            System.out.print("Import de la Compra: ");
                                            importCompra = scanner.nextInt();

                                            if (importCompra >= IMPORT_COMPRA_MIN && importCompra <= IMPORT_COMPRA_MAX) {
                                                intentosImport = 3;

                                                //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                                                while (intentosTelefon < 3) {
                                                    System.out.print("Telefòn de Contacte: ");
                                                    telefonContacte = scanner.nextInt();

                                                    //Si todos los datos son correctos se imprimen los datos y el programa finaliza.
                                                    if (telefonContacte >= TELEFON_MIN && telefonContacte <= TELEFON_MAX) {
                                                        intentosTelefon = 3;

                                                        System.out.println("\n\tDatos introducidos correctamente!");
                                                        System.out.println();

                                                        System.out.println(ANSI_PURPLE + "\tId \tEdat \tTipus \t\t\tImport \tTelefòn de Contacte" + ANSI_RESET);
                                                        System.out.println(ANSI_BLUE + "\t" + id + "\t" + edat + "\t" + tipus + "\t\t" + importCompra + "\t" + telefonContacte);

                                                        //Incremento el valor del contador para saber cuantos clientes se han registrado correctamente.
                                                        contadorClientes++;

                                                      //En cada else realizo el incremento de los intentos respectivamente.
                                                    } else {
                                                        intentosTelefon++;

                                                        System.err.println("Telefon: Incorrecte! \tIntento: " + intentosTelefon);
                                                        //Si se supera el número de intentos el programa finaliza.
                                                        if (intentosTelefon == 3) {
                                                            error = true;
                                                        }
                                                    }
                                                }
                                                //Aquí realizo el incremento de los intentos.
                                            } else {
                                                intentosImport++;

                                                System.err.println("Import: Incorrecte! \tIntento: " + intentosImport);
                                                //Si se supera el intento de los errores se termina el programa.
                                                if (intentosImport == 3) {
                                                    error = true;
                                                }
                                            }
                                        }
                                        //Aquí realizo el incremento de los intentos.
                                    } else {
                                        intentosTipusVenda++;

                                        System.err.println("TipusVenda: Incorrecte! \tIntento: " + intentosTipusVenda);
                                        //Si se supera el número de intentos el programa finaliza.
                                        if (intentosTipusVenda == 3) {
                                            error = true;
                                        }
                                    }
                                }
                              //Aquí realizo el incremento de los intentos.
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
                }//Aquí imprimo los resultados según el valor de la bandera 'error'.
                if (error == true) {
                    //Igualo a 0  todos los contadores de los intentos después de realizar los 3 intentos.
                    intentosId = 0;
                    intentosEdat = 0;
                    intentosTipusVenda = 0;
                    intentosImport = 0;
                    intentosTelefon = 0;
                }
                //Igualo a 0  todos los contadores de los intentos para cada nuevo cliente.
                intentosId = 0;
                intentosEdat = 0;
                intentosTipusVenda = 0;
                intentosImport = 0;
                intentosTelefon = 0;
            } //Este es el cierre del if principal.
            //Si elige la opción 0, imprime el total de clientes introducidos.
            else if (masClientes == 0) {
                salidaClientes = true;
                System.out.println("\nS'han introduït: " + contadorClientes + " clients.");
            }
        }//Este es el cierre del while.
    }
}