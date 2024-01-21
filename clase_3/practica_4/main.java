import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el diametro de la rueda en metros: ");
        double diametro = sc.nextDouble();
        System.out.print("Ingrese el grosor de la rueda en metros: ");
        double grosor = sc.nextDouble();

        if (diametro > 1.5) {
            System.out.println("La rueda es para un vehículo grande");
            if (grosor < 0.4) {
                System.out.println("El grosor para esta rueda es inferior al recomendado");
            }
        } else if (diametro <= 1.5 && diametro > 0.8) {
            System.out.println("La rueda es para un vehículo mediano");
            if (grosor < 0.25) {
                System.out.println("El grosor para esta rueda es inferior al recomendado");
            }
        } else {
            System.out.println("La rueda es para un vehículo pequeño");
        }
    }
}
