/* 

Noel Rincón Anaya 181233 ---Calcular area de un circulo 

*/
import java.util.Scanner;

import java.lang.Math;

/**
 * 
 * 
 * 
 * @author 181233
 * 
 */

public class AreaCirculo {

    /**
     * 
     * @param args the command line arguments
     * 
     */

    public static void main(String[] args) {

        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio de su Circulo");

        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area de su circulo es: " + area);

    }

}
