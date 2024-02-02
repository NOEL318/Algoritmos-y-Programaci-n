/**
 * La clase Java anterior genera una matriz de números aleatorios de 4x5, calcula la suma de todos los
 * números en la matriz y encuentra el número más grande en la matriz.
 */

/* 
Noel Rincón Anaya 181233
*/
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 5; e++) {
                matriz[i][e] = (int) Math.round(Math.random() * 100);
            }
        }
        int suma = 0;
        int mayor = 0;
        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 5; e++) {
                suma = suma + matriz[i][e];
                if (matriz[i][e] >= mayor) {
                    mayor = matriz[i][e];
                }
            }
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El mayor es: " + mayor);

    }
}
