
/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */
package poo;
import java.util.Scanner;
public class Uso_Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        String tronco = "";
        String modif = "";
        String search_clave = "";
        boolean btronco = false;
        System.out.println("Ingrese las Cantidad de materias a registrar en el sistema: ");
        int nmaterias = sc.nextInt();
        Clase[] materias = new Clase[nmaterias];
        for (int i = 0; i < nmaterias; i++) {
            System.out.println("Ingrese el Nombre del la clase " + (i + 1) + ": ");
            String nombre_clase = sc.next();
            System.out.println("Ingrese la Clave de la clase " + (i + 1) + ": ");
            String clave = sc.next();
            System.out.println("Ingrese las Horas del Curso por semestre " + (i + 1) + ": ");
            int horas = sc.nextInt();
            System.out.println("Ingrese el Departamento de la clase " + (i + 1) + ": ");
            String depto = sc.next();
            System.out.println("Ingrese el Numero de unidades de la clase " + (i + 1) + ": ");
            int unidades = sc.nextInt();
            do {
                System.out.println("Es de tronco común?");
                tronco = sc.next();
            } while (!tronco.equals("Si") && !tronco.equals("si") && !tronco.equals("No") && !tronco.equals("no"));
            if (tronco.equals("Si") && tronco.equals("si")) {
                btronco = true;
            } else {
                btronco = false;
            }
            materias[i] = new Clase(nombre_clase, clave, horas, depto, btronco, unidades);
        }
        do {
            System.out.println("Desea Modificar alguna materia?");
            modif = sc.next();
            if (modif.equals("Si") || modif.equals("si")) {
                System.out.println("Ingrese la Clave de la materia a modificar: ");
                search_clave = sc.next();
                for (int e = 0; e < materias.length; e++) {
                    if (materias[e].getClave().equals(search_clave)) {
                        System.out.println(materias[e].getDatos());
                        System.out.println("Ingrese el Nombre del la clase " + (e + 1) + ": ");
                        String nombre_clase = sc.next();
                        System.out.println("Ingrese el Departamento de la clase " + (e + 1) + ": ");
                        String depto = sc.next();
                        System.out.println("Ingrese el Numero de unidades de la clase " + (e + 1) + ": ");
                        int unidades = sc.nextInt();
                        materias[e] = new Clase(nombre_clase, search_clave, materias[e].getHours(), depto,
                                materias[e].getTronco(), unidades);
                    }
                }
            }
        } while (modif.equals("Si") && modif.equals("si"));
        System.out.println("Sus materias son: ");

        for (int e = 0; e < materias.length; e++) {
        System.out.println(materias[e].getDatos());
        }
        sc.close();
    }
}
