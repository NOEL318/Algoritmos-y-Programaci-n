
// Programa que usa operadores lógicos
import java.util.Scanner;
import java.math.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor numero 1: ");
        float num1 = sc.nextFloat();
        System.out.println("Ingrese el valor numero 2: ");
        float num2 = sc.nextFloat();
        double potenciaraiz;
        float R;

        R = num1 + num2;
        System.out.println("La suma es: " + R);
        R = num1 - num2;
        System.out.println("La resta es: " + R);
        R = num1 * num2;
        System.out.println("La multiplicacion es: " + R);
        R = num1 / num2;
        System.out.println("La division es: " + R);

        potenciaraiz = Math.pow(num1, num2);
        System.out.println("La potencia es: " + potenciaraiz);

        potenciaraiz = Math.sqrt(num1);
        System.out.println("La raiz es: " + potenciaraiz);

        sc.close();
    }
}
