
// Programa que usa operadores lógicos

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("El numero es mayor a 10");
        } else if (num < 10) {
            System.out.println("El numero es menor a 10");
        } else {
            System.out.println("El numero es igual a 10");

        }

        sc.close();
    }
}