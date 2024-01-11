
//Convierte cm a pulgada
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor en cm: ");

        final double cm = scan.nextDouble();
        double pulgada = cm / 2.54;

        System.out.println(cm + "cm equivalen a: " + pulgada + " pulgadas");
        scan.close();
    }
}
