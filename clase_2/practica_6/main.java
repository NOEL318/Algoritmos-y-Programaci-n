
// Programa que califica promedios
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificacion numero 1: ");
        float cal1 = sc.nextFloat();
        System.out.println("Ingrese la calificacion numero 2: ");
        float cal2 = sc.nextFloat();
        System.out.println("Ingrese la calificacion numero 3: ");
        float cal3 = sc.nextFloat();

        float promedio = (cal1 + cal2 + cal3) / 3;

        if (promedio > 7.5) {
            System.out.println("Usted aprobó el curso con promedio de: "+promedio);
        }
        else{
            System.out.println("Usted NO aprobó el curso con promedio de: "+promedio);
        }
        sc.close();
    }
}
