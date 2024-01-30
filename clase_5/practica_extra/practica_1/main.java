
/* 
Noel Rincón Anaya 181233 ---For
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
