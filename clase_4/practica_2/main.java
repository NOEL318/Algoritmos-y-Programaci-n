
/* 
Noel Rincón Anaya 181233 ---While
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        while (cont <= 100) {
            if (cont % 2 == 0) {
                System.out.print(cont + " ");
            }
            cont = cont + 1;
        }
    }
}
