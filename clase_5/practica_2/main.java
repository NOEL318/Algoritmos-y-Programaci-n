
/* 
Noel Rincón Anaya 181233 ---For
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.println("Ingrese de la frase el caracter que desea contar: ");
        String caracter = sc.next();
        int acumulador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter.charAt(0)) {
                acumulador = acumulador + 1;
            }
        }
        System.out.println("Se repite: " + caracter.charAt(0) + " " + acumulador + " veces.");

    }
}
