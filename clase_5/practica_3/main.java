
/* 
Noel Rincón Anaya 181233 ---For
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        
        if (numero % 2 != 0) {
            if (numero % 3 != 0) {
                if (numero % 5 != 0) {
                    System.out.println("Su numero es primo");
                } else {
                    System.out.println("Su numero es primo");
                }
            } else {
                System.out.println("Su numero no es primo");
            }
        } else {
            System.out.println("Su numero no es primo");
        }

    }

}
