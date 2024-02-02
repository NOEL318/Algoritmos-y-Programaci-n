
/* 
Noel Rincón Anaya 181233
*/
import java.lang.Math;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        int mayor = 0;
        String mayorindex = "";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 5; e++) {
                matriz[i][e] = (int) Math.round(Math.random() * 100);
                System.out.print(" |" + matriz[i][e] + "| ");
            }
            System.out.println("");
        }
        System.out.println("Ingrese una opción del menu: ");
        System.out.println("1- Números primos e imprimirlos");
        System.out.println("2- Múltiplos de 7 e imprimirlos");
        System.out.println("3- Imprimir el mayor de los múltiplosde 3 (fila y columna )");
        int dec = sc.nextInt();
        switch (dec) {
            case 1: {
                System.out.println("1- Números primos e imprimirlos");
                for (int i = 0; i < 4; i++) {
                    for (int e = 0; e < 5; e++) {
                        if (matriz[i][e] % 2 != 0) {
                            if (matriz[i][e] % 3 != 0) {
                                if (matriz[i][e] % 5 != 0) {
                                    System.out.println("Su numero. " + matriz[i][e] + " es primo");
                                } else {
                                    System.out.println("Su numero. " + matriz[i][e] + " es primo");
                                }
                            } else {
                                System.out.println("Su numero. " + matriz[i][e] + " no es primo");
                            }
                        } else {
                            System.out.println("Su numero. " + matriz[i][e] + " no es primo");
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("2- Múltiplos de 7 e imprimirlos");
                for (int i = 0; i < 4; i++) {
                    for (int e = 0; e < 5; e++) {
                        if (matriz[i][e] % 7 == 0) {
                            System.out.println("Su numero: " + matriz[i][e] + " es múltiplo de 7");
                        }
                    }
                }
                break;
            }
            case 3: {
                System.out.println("3- Imprimir el mayor de los múltiplosde 3 (fila y columna )");
                for (int i = 0; i < 4; i++) {
                    for (int e = 0; e < 5; e++) {
                        if (matriz[i][e] % 3 == 0) {
                            if (matriz[i][e] >= mayor) {
                                mayor = matriz[i][e];
                                mayorindex = "|" + (e + 1) + ", " + (i + 1) + "|";
                            }
                        }
                    }
                }
                System.out.println("El mayor de los multiplos de 3 es: " + mayor);
                System.out.println("El indice del mayor multiplo de 3 es: " + mayorindex);
                break;
            }
            default:
                System.out.println("Error elija una opcion del menu");
                break;
        }
    }
}
