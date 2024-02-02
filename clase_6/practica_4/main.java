/**
 * La clase principal crea una matriz de cadenas e imprime cada elemento con su índice correspondiente.
 */

/* 
Noel Rincón Anaya 181233
*/
public class main {
    public static void main(String[] args) {
        String[] vec = new String[5];
        vec[0]="David";
        vec[1]="Daniel";
        vec[2]="Fernanda";
        vec[3]="Ivonne";
        vec[4]="Ivanna";

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Nombre (" + i + ") " + vec[i]);
        }
    }
}