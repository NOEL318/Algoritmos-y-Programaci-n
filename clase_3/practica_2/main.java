import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double c = sc.nextDouble();

        double general1 = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
        double general2 = (-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;

        System.out.println("Sus soluciones son: ");
        System.out.println("X1: " + general1);
        System.out.println("X2: " + general2);

    }
}
