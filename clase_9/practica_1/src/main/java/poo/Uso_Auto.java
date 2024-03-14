
/* 
Noel Rincón Anaya 181233
*/
package poo;

import java.util.Scanner;

public class Uso_Auto {
    public static void main(String[] args) {
        String saire;
        Auto Cadillac = new Auto();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Su auto cuenta con Aire Acondicionado: (Si/No)");
            saire = sc.nextLine();
        } while (!saire.equals("Si") && !saire.equals("si") && !saire.equals("No") && !saire.equals("no"));
        Cadillac.setColor("Naranja UDLAP");
        Cadillac.setClima(saire);
        System.out.println(Cadillac.getClima());
        System.out.println(Cadillac.getDatos());
    }
}