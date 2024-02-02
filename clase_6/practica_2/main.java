/**
 * La clase principal genera una matriz de 150 números enteros aleatorios entre 0 y 100 y luego imprime
 * los elementos de la matriz.
 */

/* 
Noel Rincón Anaya 181233
*/
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        int[] vec = new int[150];


        for (int i = 0; i < vec.length; i++) {
            vec[i]=(int) Math.round(Math.random()*100);
        }


        for (int i = 0; i < vec.length; i++) {
            System.out.println("Vector [" + i + "] =" + vec[i]);
        }


        for (int num:vec) {
            System.out.println("Vector [" + num+ "] ");
        }


    }
}
