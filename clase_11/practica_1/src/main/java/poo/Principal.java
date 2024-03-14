package poo;

import java.util.Scanner;

public class Principal {
    public static final String ANSI_BLUE = "\u001B[44m";
    public static final String ANSI_YELLOW = "\u001B[43m";

    public static final String ANSI_GREEN = "\u001B[42m";
    public static final String ANSI_PINK = "\u001B[45m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "";
        String apellidos = "";
        String carrera = "";

        int edad = 0;
        int id = 0;
        int horas = 0;
        Double sueldo = 0;

        System.out.println(ANSI_GREEN + "\n▄▄▄▄▄▄▄ Estudiante ▄▄▄▄▄▄▄▄" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Ingrese el Nombre del Estudiante: " + ANSI_RESET);
        nombre = sc.next();
        System.out.println(ANSI_YELLOW + "Ingrese los Apellidos del Estudiante: " + ANSI_RESET);
        apellidos = sc.next();
        System.out.println(ANSI_YELLOW + "Ingrese la Edad del Estudiante: " + ANSI_RESET);
        edad = sc.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese el ID del Estudiante: " + ANSI_RESET);
        id = sc.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese la carrera del Estudiante: " + ANSI_RESET);
        carrera = sc.next();

        Estudiante alumno = new Estudiante(nombre, apellidos, edad, id, carrera);
        System.out.println(ANSI_GREEN + "Nombre: " + alumno.getName() + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Apellidos: " + alumno.getLastName() + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Edad: " + alumno.getAge() + ANSI_RESET);

        for (int i = 0; i < 2; i++) {
            for (int e = 0; e < 2; e++) {
                System.out.print(ANSI_GREEN + alumno.getStudentProperties()[i][e] + ANSI_RESET);
            }
            System.out.println("");
        }

        System.out.println(ANSI_BLUE + "\n▄▄▄▄▄▄▄ Profesor ▄▄▄▄▄▄▄▄" + ANSI_RESET);

        System.out.println(ANSI_YELLOW + "Ingrese el Nombre del Profesor: " + ANSI_RESET);
        nombre = sc.next();
        System.out.println(ANSI_YELLOW + "Ingrese los Apellidos del Profesor: " + ANSI_RESET);
        apellidos = sc.next();
        System.out.println(ANSI_YELLOW + "Ingrese la Edad del Profesor: " + ANSI_RESET);
        edad = sc.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese la cantidad de Horas del Profesor: " + ANSI_RESET);
        horas = sc.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese el Departamento del Profesor: " + ANSI_RESET);
        String depto = sc.next();

        System.out.println(ANSI_YELLOW + "Ingrese el Sueldo del Profesor: " + ANSI_RESET);
        Double sueldo = sc.nextDouble();

        Profesor docente = new Profesor(nombre, apellidos, edad, horas, depto, sueldo);
        System.out.println(ANSI_BLUE + "Nombre: " + docente.getName() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Apellidos: " + docente.getLastName() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Edad: " + docente.getAge() + ANSI_RESET);

        for (int i = 0; i < 3; i++) {
            for (int e = 0; e < 2; e++) {
                System.out.println(ANSI_BLUE + docente.getTeacherProperties()[i][e] + ANSI_RESET);
            }
        }

        System.out.println(ANSI_PINK + "\n▄▄▄▄▄▄▄ Administrativo ▄▄▄▄▄▄▄▄" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Ingrese el Nombre del Administrativo: " + ANSI_RESET);
        nombre = sc.next();
        System.out.println(ANSI_YELLOW + "Ingrese los Apellidos del Administrativo: " + ANSI_RESET);
        apellidos = sc.next();
        System.out.println(ANSI_YELLOW + "Ingrese la Edad del Administrativo: " + ANSI_RESET);
        edad = sc.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese el ID del Administrativo: " + ANSI_RESET);
        id = sc.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese el Departamento del Administrativo: " + ANSI_RESET);
        String puesto = sc.next();

        Administrativo admon = new Administrativo("Jhonny", "Nate", edad, id, puesto);
        System.out.println(ANSI_PINK + "Nombre: " + admon.getName() + ANSI_RESET);
        System.out.println(ANSI_PINK + "Apellidos: " + admon.getLastName() + ANSI_RESET);
        System.out.println(ANSI_PINK + "Edad: " + admon.getAge() + ANSI_RESET);

        for (int i = 0; i < 2; i++) {
            for (int e = 0; e < 2; e++) {
                System.out.println(ANSI_PINK + admon.getAdminProperties()[i][e] + ANSI_RESET);

            }
        }

    }
}