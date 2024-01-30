/* 
Noel Rincón Anaya 181233 ---For
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        double n = sc.nextDouble();
        for (int i = 0; i < 10; i++) {
            System.out.println(n + "x" + i + "= " + (n * i));
        }
    }

}
