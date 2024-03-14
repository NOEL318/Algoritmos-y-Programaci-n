
/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */
package poo;

import java.util.Scanner;

public class Uso_Lenguaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        String nivel = "";

        String modif = "";
        String search_name = "";
        boolean bnivel = false;
        System.out.println("Ingrese la cantidad de lenguajes de Programación que desea agregar a su CV: ");
        int nlenguajes = sc.nextInt();
        Lenguaje[] lenguajes = new Lenguaje[nlenguajes];
        for (int i = 0; i < nlenguajes; i++) {
            System.out.println("Ingrese el Nombre del lenguaje " + (i + 1) + ": ");
            String nombre = sc.next();
            System.out.println("Ingrese los años de experiencia del lenguaje " + (i + 1) + ": ");
            Double experiencia = sc.nextDouble();

            System.out.println("Ingrese el % de experiencia que tiene en el lenguaje" + (i + 1) + ": ");
            Double porcentaje = sc.nextDouble();

            do {
                System.out.println("Es un lenguaje de alto nivel" + (i + 1) + ": ");
                nivel = sc.next();
            } while (!nivel.equals("Si") && !nivel.equals("si") && !nivel.equals("No") && !nivel.equals("no"));
            if (nivel.equals("Si") && nivel.equals("si")) {
                bnivel = true;
            } else {
                bnivel = false;
            }
            lenguajes[i] = new Lenguaje(nombre, experiencia, porcentaje, bnivel);
        }

        do {
            System.out.println("Desea Modificar algun lenguaje de su CV?");
            modif = sc.next();
            if (modif.equals("Si") || modif.equals("si")) {
                System.out.println("Ingrese el Nombre del lenguaje a modificar: ");
                search_name = sc.next();
                for (int e = 0; e < lenguajes.length; e++) {
                    if (lenguajes[e].getName().equals(search_name)) {
                        System.out.println("Ingrese el Nombre del lenguaje " + (e + 1) + ": ");
                        String nombre = sc.next();
                        System.out.println("Ingrese los años de experiencia del lenguaje " + (e + 1) + ": ");
                        Double experiencia = sc.nextDouble();

                        System.out.println("Ingrese el % de experiencia que tiene en el lenguaje" + (e + 1) + ": ");
                        Double porcentaje = sc.nextDouble();
                        do {
                            System.out.println("Es un lenguaje de alto nivel" + (e + 1) + ": ");
                            nivel = sc.next();
                        } while (!nivel.equals("Si") && !nivel.equals("si") && !nivel.equals("No")
                                && !nivel.equals("no"));
                        if (nivel.equals("Si") && nivel.equals("si")) {
                            bnivel = true;
                        } else {
                            bnivel = false;
                        }
                        lenguajes[e] = new Lenguaje(nombre, experiencia, porcentaje, bnivel);

                    }
                }
            }
        } while (modif.equals("Si") && modif.equals("si"));
        System.out.println("Sus lenguajes para su CV son: ");

        String domina = "";
        Double mayor = 0.0;
        for (int e = 0; e < lenguajes.length; e++) {
            System.out.println(lenguajes[e].getDatos());
            if (lenguajes[e].getExperiencia() > mayor) {
                domina = lenguajes[e].getName();
            }
        }
        System.out.println("\nEl lenguaje que mas domina es: " + domina);
        System.out.println("Use este factor para obtener el empleo que desea ");

        sc.close();
    }
}
