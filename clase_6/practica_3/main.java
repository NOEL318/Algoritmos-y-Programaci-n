/**
 * El método principal genera una matriz de 150 números enteros aleatorios e imprime los números pares
 * de la matriz.
 */

/* 
Noel Rincón Anaya 181233
*/
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        int[] vec = new int[150];

        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) Math.round(Math.random() * 100);
            if (vec[i] % 2 == 0) {

                System.out.println("Vector [" + vec[i] + "] ");
            }
        }
    }
}