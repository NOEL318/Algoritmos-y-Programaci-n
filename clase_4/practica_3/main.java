
/* 
Noel Rincón Anaya 181233 ---While
*/
import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        double num_alea;
        while (cont <= 100) {
            num_alea = Math.round(Math.random() * 100);
            System.out.print(num_alea);
            cont = cont + 1;
        }
    }
}
