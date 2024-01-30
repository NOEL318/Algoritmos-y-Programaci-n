
/* 
Noel Rincón Anaya 181233 ---While
*/
import java.lang.Math;

public class main {
    public static void main(String[] args) {

        int cont = 1;
        double suma = 0;
        int cuantos = 0;
        while (cont <= 100) {
            if (cont % 2 == 0) {
                suma = suma + cont;
                System.out.println("Par: " + cont);
                cuantos = cuantos + 1;
            }

            cont = cont + 1;
        }
        double promedio = suma / cuantos;
        System.out.println("Su promedio es: " + promedio);
        System.out.println("Su numero de pares: " + cuantos);
        System.out.println("Su suma de pares: " + suma);
    }
}
