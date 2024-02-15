package ejercicio1;

/*
 * @author Ramón Portalanza
 */
public class CicloCurso {

    //Declaro las variables
    public static int edad = 1; //La edad la voy cambiando para probar todas las opciones del programa.
    public static int ciclo;
    public static int curso;

    public static void main(String[] args) {
        System.out.println("\t=====Informe=====");
        //Realizo las comprobaciones según la edad asignada en la variable declarada anteriormente.
        if (edad < 3) {
            System.out.println("Es demasiado pequeño!");
        } else if (edad < 6) {
            ciclo = 0;
        } else if (edad < 7) {
            curso = 1;
            ciclo = 1;
        } else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        } else if (edad < 9) {
            curso = 3;
            ciclo = 2;
        } else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        } else if (edad < 11) {
            curso = 5;
            ciclo = 3;
        } else if (edad < 12) {
            curso = 6;
            ciclo = 3;
        } else {
            System.out.println("Es demasiado grande");
            ciclo = -1;
            curso = -1;
        }
        //En el Switch voy imprimiendo los resultados según los valores que se le asigna a la variable ciclo. 
        switch (ciclo) {
            case 0:
                System.out.println("Es de educación infntil.");
                if (edad > 6) {
                    System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                } else {
                    System.out.println("El alumno tiene " + edad + " años y aún no se le asigna ningún curso.");
                }
                break;
            case 1:
                System.out.println("Es de educación primaria, ciclo inicial.");
                System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                break;
            case 2:
                System.out.println("Es de educación primaria, ciclo medio.");
                System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                break;
            case 3:
                System.out.println("Es de educación primaria, ciclo superior.");
                System.out.println("El alumno tiene " + edad + " años y pertenece al curso: " + curso);
                break;
            default:
                System.out.println("No pertenecece a ningún ciclo porque tiene: " + edad + " años.");
        }
    }

}
