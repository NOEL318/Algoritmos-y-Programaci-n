
// Programa que usa operadores lógicos
import java.util.Scanner;
import java.math.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multipliacion");
        System.out.println("4 - Division");
        System.out.println("5 - Potencia");
        System.out.println("6 - Raiz");

        System.out.println("Ingrese el valor numerico de la opcion que desee: ");
        int opcion = sc.nextInt();

        System.out.println("Ingrese el valor numero 1: ");
        float num1 = sc.nextFloat();
        System.out.println("Ingrese el valor numero 2: ");
        float num2 = sc.nextFloat();

        double potenciaraiz;
        float R;
        if (opcion == 1) {
            R = num1 + num2;
            System.out.println("La suma es: " + R);
        } else if (opcion == 2) {
            R = num1 - num2;
            System.out.println("La resta es: " + R);
        } else if (opcion == 3) {
            R = num1 * num2;
            System.out.println("La multiplicacion es: " + R);
        } else if (opcion == 4) {
            R = num1 / num2;
            System.out.println("La division es: " + R);
        } else if (opcion == 5) {
            potenciaraiz = Math.pow(num1, num2);
            System.out.println("La potencia es: " + potenciaraiz);
        } else if (opcion == 6) {
            potenciaraiz = Math.sqrt(num1);
            System.out.println("La raiz es: " + potenciaraiz);
        } else {
            System.out.println("Ingrese el valor numerico valido de las opciones del menu ");
        }

        sc.close();
    }
}
