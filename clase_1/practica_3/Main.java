
//Convierte km a millas
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Noel Rincón Anaya\n181233\n");

        System.out.print("Ingrese el valor en km: ");
        final double km = scan.nextDouble();
        double milla = km / 1.609;

        System.out.println("Su conversion de: " + km + "km a millas es: " + milla);
        scan.close();
    }
}
