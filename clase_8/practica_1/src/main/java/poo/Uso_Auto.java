package poo;

import java.util.Scanner;

public class Uso_Auto {
    public static void main(String[] args) {
        Auto Cadillac = new Auto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el color que desea ponerle a su auto: ");
        String newcolor = sc.nextLine();
        Cadillac.setColor(newcolor);
        System.out.println(Cadillac.getRuedas());
        System.out.println(Cadillac.getLargo());
        System.out.println(Cadillac.getAncho());
        System.out.println(Cadillac.getMotor());
        // Cadillac.color = "Blanco";
        System.out.println(Cadillac.getColor());
    }
}
