
/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */
package poo;

import java.util.Scanner;

public class Uso_Profesor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        Profesor[] docentes = new Profesor[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el Nombre del profesor: ");
            String nombre_profesor = sc.next();
            System.out.println("Ingrese el Apellido Paterno del profesor: ");
            String ap_paterno_profesor = sc.next();
            System.out.println("Ingrese el Apellido Materno del profesor: ");
            String ap_materno_profesor = sc.next();
            System.out.println("Ingrese el Grado de Estudios del profesor: ");
            int gradoest_profesor = sc.nextInt();
            docentes[i] = new Profesor(nombre_profesor, ap_paterno_profesor, ap_materno_profesor, gradoest_profesor);
        }

        for (int e = 0; e < docentes.length; e++) {
            System.out.println(docentes[e].getDatos());
        }
        sc.close();
    }
}
