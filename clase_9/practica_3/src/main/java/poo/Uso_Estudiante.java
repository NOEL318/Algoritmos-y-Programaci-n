
/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */
package poo;

import java.util.Scanner;

public class Uso_Estudiante {
    public static void main(String[] args) {
        String[] nombre = new String[3];
        String[] apellido_materno = new String[3];
        String[] apellido_paterno = new String[3];
        String[] carrera = new String[3];
        String dec = "";
        String ndec = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el Nombre del estudiante " + (i + 1) + ": ");
            nombre[i] = sc.nextLine();
            System.out.print("Ingrese el Apellido Paterno del estudiante " + (i + 1) + ": ");
            apellido_paterno[i] = sc.nextLine();
            System.out.print("Ingrese el Apellido Materno del estudiante " + (i + 1) + ": ");
            apellido_materno[i] = sc.nextLine();
            System.out.print("Ingrese la Carrera del estudiante " + (i + 1) + ": ");
            carrera[i] = sc.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            Estudiante student = new Estudiante(nombre[i], apellido_paterno[i], apellido_materno[i]);
            student.setCarrera(carrera[i]);
            for (int e = 0; e < 6; e++) {
                System.out.print(student.getEstudiantes()[0][e]);
                System.out.println(student.getEstudiantes()[1][e]);
            }
            if (i == 2) {
                student.set_id(true);
            }
        }
        do {
            System.out.println("Desea cambiar la carrera de algún estudiante: ");
            dec = sc.nextLine();
        } while (!dec.equals("Si") && !dec.equals("si") && !dec.equals("No") && !dec.equals("no"));
        if (dec.equals("Si") || dec.equals("si")) {
            do {
                System.out.println("Ingrese el ID del Estudiante a modificar: ");
                String _id = sc.nextLine();
                for (int i = 0; i < 3; i++) {
                    Estudiante student = new Estudiante(nombre[i], apellido_paterno[i], apellido_materno[i]);
                    student.setCarrera(carrera[i]);
                    if (student.getEstudiantes()[1][3].equals(_id)) {
                        System.out.print("Ingrese la Carrera del estudiante " + (i + 1) + ": ");
                        carrera[i] = sc.nextLine();
                        student.setCarrera(carrera[i]);
                    }
                }
                System.out.println("Desea cambiar la carrera de algún otro estudiante: ");
                ndec = sc.nextLine();
            } while (ndec.equals("Si") && ndec.equals("si"));
            for (int i = 0; i < 3; i++) {
                Estudiante student = new Estudiante(nombre[i], apellido_paterno[i], apellido_materno[i]);
                student.setCarrera(carrera[i]);
                for (int e = 0; e < 6; e++) {
                    System.out.print(student.getEstudiantes()[0][e]);
                    System.out.println(student.getEstudiantes()[1][e]);
                }
            }
        }
        sc.close();
    }
}
