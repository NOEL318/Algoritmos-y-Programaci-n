import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su voto por el partido A=ROJO B=VERDE C=AZUL: ");
        char partido = sc.next().charAt(0);
        if (partido == 'A' || partido == 'a') {
            System.out.println("Usted ha votado por el partido Rojo");
        } else if (partido == 'B' || partido == 'b') {
            System.out.println("Usted ha votado por el partido Verde");

        } else if (partido == 'C' || partido == 'c') {
            System.out.println("Usted ha votado por el partido Azul");
        } else {
            System.out.println("Ingrese un candidato valido.");
        }

    }
}
