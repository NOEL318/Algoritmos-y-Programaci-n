/**
 * La clase Java anterior genera una matriz de 4x5 de enteros aleatorios, calcula varias estadísticas
 * como la suma, máximo, mínimo y promedio de los elementos de la matriz e identifica los índices de
 * los valores máximo y mínimo.
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
        int mayorimp = 0;

        int menor = 100;
        int menorimp = 100;

        int contimp = 0;
        int sumimp = 0;

        String mayorindex = "";
        String mayorimpindex = "";

        String menorindex = "";
        String menorimpindex = "";
        int anterior = 0;
        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 5; e++) {
                suma = suma + matriz[i][e];
                if (matriz[i][e] >= mayor) {
                    mayor = matriz[i][e];
                    mayorindex = "|" + (e + 1) + ", " + (i + 1) + "|";
                }
                if (matriz[i][e] <= menor) {
                    menor = matriz[i][e];
                    menorindex = "|" + (e + 1) + ", " + (i + 1) + "|";
                }
                if (matriz[i][e] % 2 != 0) {
                    contimp = contimp + 1;
                    sumimp = sumimp + matriz[i][e];
                    if (matriz[i][e] >= mayorimp) {
                        mayorimp = matriz[i][e];
                        mayorimpindex = "|" + (e + 1) + ", " + (i + 1) + "|";
                    }
                    if (matriz[i][e] <= menorimp) {
                        menorimp = matriz[i][e];
                        menorimpindex = "|" + (e + 1) + ", " + (i + 1) + "|";
                    }
                }
                System.out.print(" |" + matriz[i][e] + "| ");
            }
            System.out.println("");
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El indice del mayor es: " + mayorindex);
        System.out.println("El menor es: " + menor);
        System.out.println("El indice del menor es: " + menorindex);
        System.out.println("El numero de impares es: " + contimp);
        System.out.println("La suma de impares es: " + sumimp);
        System.out.println("El promedio de impares es: " + sumimp / 20);
        System.out.println("El mayor de impares es: " + mayorimp);
        System.out.println("El indice del mayor impar es: " + mayorimpindex);
        System.out.println("El menor de impares es: " + menorimp);
        System.out.println("El indice del menor impar es: " + menorimpindex);

    }
}
