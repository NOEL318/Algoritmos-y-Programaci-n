/**
 * La clase principal inicializa dos matrices e imprime sus elementos.
 */

/* 
Noel Rincón Anaya 181233
*/
public class main {
    public static void main(String[] args) {
        int[] vec = new int[6];
        int[] vec2 = { 8, 7, 5, 12, -5 };
        vec[0] = 4;
        vec[1] = -5;
        vec[2] = 52;
        vec[3] = 8;
        vec[4] = 12;
        vec[5] = 21;

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Vector [" + i + "] =" + vec[i]);
        }

        for (int i = 0; i < vec2.length; i++) {
            System.out.println("Vector 2 [" + i + "] =" + vec2[i]);
        }


    }
}
