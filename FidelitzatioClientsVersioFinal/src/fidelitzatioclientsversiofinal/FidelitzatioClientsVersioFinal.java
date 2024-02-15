package fidelitzatioclientsversiofinal;

import java.util.Scanner;

/*
 * @author Ramón Portalanza
 */
public class FidelitzatioClientsVersioFinal {

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
    private static final int MAX_CLIENTES = 10;

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static int id, edat, tipusVenda, importCompra, telefonContacte, auxiliar, tipus0, tipus1, tipus2, tipus3, estadistica, importeTotal;
    public static int intentosId, intentosEdat, intentosTipusVenda, intentosImport, intentosTelefon, contadorClientes, masClientes = 1, opcionTipus, elecionTipus;
    public static String tipus;
    public static boolean error = false, salidaClientes = false;
    public static Scanner scanner = new Scanner(System.in);
    public static int[] idArray = new int[MAX_CLIENTES];
    public static int[] edatArray = new int[MAX_CLIENTES];
    public static int[] tipusVendaArray = new int[MAX_CLIENTES];
    public static int[] importCompraArray = new int[MAX_CLIENTES];
    public static int[] telefonContacteArray = new int[MAX_CLIENTES];
    public static int posicionClientes = 0;

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "\t}}}}} Fidelizació de Clients Versió Final {{{{{" + ANSI_RESET);

        while (!salidaClientes) {

            //MENÚ PRINCIPAL.
            System.out.println(ANSI_PURPLE + "\n\t###Desea registrar un cliente?###" + ANSI_RESET);
            System.out.println("Sí -> 1");
            System.out.println("No -> 0");
            System.out.print("\tContinuar: ");

            //Comprobación de que el usuario ingresa un número y no un signo o letra.
            if (scanner.hasNextInt()) {
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

                            //22-Nov-Voy agregando al array de las opciones.
                            idArray[posicionClientes] = id;

                            //Si se cumple la condición igualo el contador de los intentos al valor máximo para que no vuelva a repetir el bucle.
                            intentosId = 3;
                            //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                            while (intentosEdat < 3) {
                                System.out.print("Edat: ");
                                edat = scanner.nextInt();

                                if (edat >= EDAT_MIN && edat <= EDAT_MAX) {
                                    //22-Nov-Voy agregando al array de las opciones.
                                    edatArray[posicionClientes] = edat;

                                    intentosEdat = 3;
                                    //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                                    while (intentosTipusVenda < 3) {

                                        System.out.println(ANSI_PURPLE + "\n\tSELECCIONEU UNA OPCI\u00d3" + ANSI_RESET);
                                        System.out.println(""" 
                                                           Venta lliure (0) 
                                                           Pensionista  (1)
                                                           Carnet jove  (2)
                                                           Soci         (3)
                                                       """);
                                        System.out.print("\tTipus de Venda: ");
                                        tipusVenda = scanner.nextInt();

                                        if (tipusVenda >= TIPUS_MIN && tipusVenda <= TIPUS_MAX) {
                                            //22-Nov-Voy agregando al array de las opciones.
                                            tipusVendaArray[posicionClientes] = tipusVenda;

                                            intentosTipusVenda = 3;

                                            //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                                            while (intentosImport < 3) {
                                                System.out.print("Import de la Compra: ");
                                                importCompra = scanner.nextInt();

                                                if (importCompra >= IMPORT_COMPRA_MIN && importCompra <= IMPORT_COMPRA_MAX) {
                                                    //22-Nov-Voy agregando al array de las opciones.
                                                    importCompraArray[posicionClientes] = importCompra;

                                                    intentosImport = 3;

                                                    //Mientras no se supere el número de intentos, el programa continúa la ejecución.
                                                    while (intentosTelefon < 3) {
                                                        System.out.print("Telefòn de Contacte: ");
                                                        telefonContacte = scanner.nextInt();

                                                        //Si todos los datos son correctos se imprimen los datos y el programa finaliza.
                                                        if (telefonContacte >= TELEFON_MIN && telefonContacte <= TELEFON_MAX) {
                                                            //22-Nov-Voy agregando al array de las opciones.
                                                            telefonContacteArray[posicionClientes] = telefonContacte;
                                                            posicionClientes++;
                                                            intentosTelefon = 3;

                                                            //clientesArray[posicionClientes] = opcionesArray[posicionClientes];
                                                            //posicionClientes++;
                                                            //22-Nov-For para recorrer el array de opciones
                                                            System.out.println("\n\tDatos introducidos correctamente!");
                                                            System.out.println();

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
                }
                if (contadorClientes == MAX_CLIENTES) {
                    salidaClientes = true;
                    System.out.println("\n\tS'han introduït: " + contadorClientes + " clients - Máximo permitido!\n");
                }
            } else {
                //El programa se repetirá hasta que se ingrese un número entero.
                System.err.println("No heu ingressat un número sencer ");
                scanner.nextLine();
            }
        }//Este es el cierre del while.

        System.out.println(ANSI_PURPLE + "\n\t CLIENTES REGISTRADOS \n" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "\tId \tEdat \tTipus \t\t\tImport \tTelefòn de Contacte" + ANSI_RESET);

        //Con el bucle for recorro los arrays para imprimir los valores correspondientes.
        for (int i = 0; i < contadorClientes; i++) {
            //Realizo la suma total de los importes.
            importeTotal += importCompraArray[i];

            //Con el switch segun el valor de tipusVendaArray[i] se elige la opción a imprimir del tipus.
            switch (tipusVendaArray[i]) {
                case 0 -> {
                    tipus = "Venta lliure";
                    //Incremento los contadores para cada opción de tipusVenda.
                    tipus0++;
                }
                case 1 -> {
                    tipus = "Pensionista ";
                    tipus1++;
                }
                case 2 -> {
                    tipus = "Carnet Jove ";
                    tipus2++;
                }
                case 3 -> {
                    tipus = "Soci        ";
                    tipus3++;
                }
            }
            //Imprimo cada posición de [i].
            System.out.println(ANSI_BLUE + "\t" + idArray[i] + "\t" + edatArray[i] + "\t" + tipus + "\t\t" + importCompraArray[i] + "\t" + telefonContacteArray[i] + ANSI_RESET);
        }
        System.out.println(ANSI_BLUE + "\nS'han introduït: " + contadorClientes + " clients." + ANSI_RESET);
        //Menú para preguntar al cliente si desea ver los daros por tipus.
        System.out.println(ANSI_PURPLE + "\n\t ¿Mostrar les dades de clients per tipus?" + ANSI_RESET);
        System.out.println("Sí -> 1");
        System.out.println("No -> 0");
        System.out.print("\tOpción: ");
        System.out.println();
        //Compruebo que sea entero.
        if (scanner.hasNextInt()) {
            opcionTipus = scanner.nextInt();

            //MENÚ PARA EL TIPO DE VENTA
            if (opcionTipus == 1) {
                System.out.println("""
                            Elija una opción");
                            Venta lliure -> 0");
                            Pensionista  -> 1");
                            Carnet Jov   -> 2");
                            Soci         -> 3""");
                System.out.print("Opción: ");

                //Compruebo que sea entero.
                if (scanner.hasNextInt()) {
                    elecionTipus = scanner.nextInt();

                    //for burbuja para ordenar las edades de menor a mayor.
                    for (int i = 0; i < contadorClientes - 1; i++) {
                        for (int j = i + 1; j < contadorClientes; j++) {

                            //Si el primer valor es mayor que el segundo.
                            if (edatArray[i] > edatArray[j]) {
                                //Utilizo una variable para guardar la posición mayor.
                                auxiliar = edatArray[i];
                                //Asigno a la primera posición el valor de la segunda posición.
                                edatArray[i] = edatArray[j];
                                //Asigno a la segunda posición el valor mayor.
                                edatArray[j] = auxiliar;
                            }
                        }

                    }

                    System.out.println(ANSI_PURPLE + "\n\t CLIENTES ORDENADOS POR TIPO DE VENTA \n" + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "\tId \tEdat \tTipus \t\t\tImport \tTelefòn de Contacte" + ANSI_RESET);

                    //for para recorrer el array ordenado por edad y a su vez en cada if else if se asigna el tipo de venta.
                    for (int k = 0; k < contadorClientes; k++) {
                        if (elecionTipus == 0 && tipusVendaArray[k] == 0) {
                            tipus = "Venta lliure";
                            System.out.println(ANSI_BLUE + "\t" + idArray[k] + "\t" + edatArray[k] + "\t" + tipus + "\t\t" + importCompraArray[k] + "\t" + telefonContacteArray[k]);

                        } else {
                            if (elecionTipus == 1 && tipusVendaArray[k] == 1) {
                                tipus = "Pensionista ";
                                System.out.println(ANSI_BLUE + "\t" + idArray[k] + "\t" + edatArray[k] + "\t" + tipus + "\t\t" + importCompraArray[k] + "\t" + telefonContacteArray[k]);
                            } else {
                                if (elecionTipus == 2 && tipusVendaArray[k] == 2) {
                                    tipus = "Carnet Jove ";
                                    System.out.println(ANSI_BLUE + "\t" + idArray[k] + "\t" + edatArray[k] + "\t" + tipus + "\t\t" + importCompraArray[k] + "\t" + telefonContacteArray[k]);
                                } else {
                                    if (elecionTipus == 3 && tipusVendaArray[k] == 3) {
                                        tipus = "Soci        ";
                                        System.out.println(ANSI_BLUE + "\t" + idArray[k] + "\t" + edatArray[k] + "\t" + tipus + "\t\t" + importCompraArray[k] + "\t" + telefonContacteArray[k] + ANSI_RESET);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //MENÚ PARA LAS ESTADÍSTICAS.
        System.out.println(ANSI_PURPLE + "\n\t ¿Mostrar resum estadístic de les dades?" + ANSI_RESET);
        System.out.println("Sí -> 1");
        System.out.println("No -> 0");
        System.out.print("\tOpción: ");
        System.out.println();
        //Compruebo que sea un entero.
        if (scanner.hasNextInt()) {
            estadistica = scanner.nextInt();

            //Si dessea ver la estadística, imprimo los datos solicitados.
            if (estadistica == 1) {
                System.out.println(ANSI_PURPLE + "\n\tESTADÍSTICAS\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "S'han introduït: " + contadorClientes + " clients.");
                System.out.println(ANSI_BLUE + "\n\tNúmero de clients per tipus");
                System.out.println(ANSI_BLUE + "Venta lliure:" + tipus0);
                System.out.println(ANSI_BLUE + "Pensionista :" + tipus1);
                System.out.println(ANSI_BLUE + "Carnet Jove :" + tipus2);
                System.out.println(ANSI_BLUE + "Soci        :" + tipus3);
                System.out.println(ANSI_BLUE + "\nImport total acumulat: " + importeTotal + ANSI_RESET);
            }
        }
        //Inicializo nuevamente los Arrays y la posición de los clientes.
        idArray = new int[MAX_CLIENTES];
        edatArray = new int[MAX_CLIENTES];
        tipusVendaArray = new int[MAX_CLIENTES];
        importCompraArray = new int[MAX_CLIENTES];
        telefonContacteArray = new int[MAX_CLIENTES];
        posicionClientes = 0;
    }
}
