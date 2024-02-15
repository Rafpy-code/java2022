package fidelitzacioclient;

/*
 * @author Ramón Portalanza
            // http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-printf.html
            System.out.printf("%-5s", "ID:");
            System.out.printf("%-7s", "Edat:");
            System.out.printf("%-15s", "Tipus:");
            System.out.printf("%-10s", "Import:");
            System.out.printf("%-10s", "Telèfon");
            System.out.printf("%n%-5d", id);
            System.out.printf("%-7d", edat);
            System.out.printf("%-15s", endTipus);
            System.out.printf("%-10d", importCompra);
            System.out.printf("%-10s", telefon);
            System.out.println();
 */
import java.util.Scanner;

public class FidelitzacioClient {

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
    public static String tipus;
    public static boolean error = false;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t=====Fidelizació de Clients=====");

        //Con scanner rercojo los valores del usuario.
        System.out.print("Id: ");
        id = scanner.nextInt();

        //Una vez otengo los valores, comienzo a realizar el control de que los valores introducidos sean los permitidos
        if (id >= ID_MIN && id <= ID_MAX) {
            System.out.print("Edat: ");
            edat = scanner.nextInt();

            if (edat >= EDAT_MIN && edat <= EDAT_MAX) {
                System.out.println("SELECCIONEU UNA OPCIÓ \n"
                        + "    Venta lliure (0) \n"
                        + "    Pensionista  (1)\n"
                        + "    Carnet jove  (2)\n"
                        + "    Soci         (3)\n");
                System.out.print("Tipus de Venda: ");
                tipusVenda = scanner.nextInt();

                if (tipusVenda >= TIPUS_MIN && tipusVenda <= TIPUS_MAX) {

                    //Aquí recojo el valor para tipus según la opción introducida.
                    switch (tipusVenda) {
                        case 0:
                            tipus = "Venta lliure";
                            break;
                        case 1:
                            tipus = "Pensionista ";
                            break;
                        case 2:
                            tipus = "Carnet Jove ";
                            break;
                        case 3:
                            tipus = "Soci        ";
                            break;
                        default:
                            System.err.println("Tipus de Venda incorrecte!");
                    }

                    System.out.print("Import de la Compra: ");
                    importCompra = scanner.nextInt();

                    if (importCompra >= IMPORT_COMPRA_MIN && importCompra <= IMPORT_COMPRA_MAX) {
                        System.out.print("Telefòn de Contacte: ");
                        telefonContacte = scanner.nextInt();

                        if (telefonContacte >= TELEFON_MIN && telefonContacte <= TELEFON_MAX) {
                            System.out.println("Datos introducidos correctamente!");
                            System.out.println();

                            //Si cualquiera de los datos introducidos no son correctos la bandera error obtiene el valor de true.
                        } else {
                            error = true;
                        }
                    } else {
                        error = true;
                    }
                } else {
                    error = true;
                }
            } else {
                error = true;
            }
        } else {
            error = true;
        }

        //Aquí imprimo los resultados según el valor de la bandera 'error'.
        if (error == true) {
            System.err.println("Els valors introduïts són incorrectes!");
        } else {
            System.out.println(ANSI_PURPLE + "\tId \tEdat \tTipus \t\t\tImport \tTelefòn de Contacte" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "\t" + id + "\t" + edat + "\t" + tipus + "\t\t" + importCompra + "\t" + telefonContacte);
        }
    }

}
