
/* 
Noel Rincón Anaya 181233 ---For
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        int contno = 0;
        int i = 2;
        while (i <= numero / 2) {
            if (numero % i == 0) {
                System.out.println("No es primo");
                contno = 0;
                break;
            } else {
                contno = 1;
            }
            i++;
        }
        if (contno == 1) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }

}
