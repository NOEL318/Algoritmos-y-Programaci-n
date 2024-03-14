/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */

package poo;

import java.util.Scanner;

public class Uso_Empleado {
    public static void main(String[] args) {
        int _ids = 0;
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        System.out.println("Cuantos empleados desea registrar? ");
        cant = sc.nextInt();

        for (int w = 0; w < cant; w++) {

            System.out.println("Cual es el Nombre del trabajador " + (w + 1) + ": ");
            String name = sc.nextLine();
            _ids = _ids + 1;
            System.out.println("Cual es el Departamento del trabajador " + (w + 1) + ": ");
            String departamento = sc.nextLine();

            Empleado trabajador = new Empleado(name, _ids);

            // Cannot be accessed cause have a 'final' definition on top of builder and its
            // asigned on top instance
            // trabajador.setNombre(nombre);
            trabajador.setDepartamento(departamento);
            for (int i = 0; i < 3; i++) {
                for (int e = 0; e < 2; e++) {
                    System.out.print(trabajador.getData()[e][i]);
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
