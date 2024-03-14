package poo;

import java.util.Scanner;

public class Uso_Auto {
    public static void main(String[] args) {
        Auto Cadillac = new Auto();
        Scanner sc = new Scanner(System.in);
        double price = 0;
        int cilindros = 0;
        String saire, sasientos, shibrido;

        System.out.println("Ingrese el color que desea ponerle a su auto: ");
        String newcolor = sc.nextLine();
        do {
            System.out.println("Su auto cuenta con Aire Acondicionado: (Si/No)");
            saire = sc.nextLine();
        } while (!saire.equals("Si") && !saire.equals("si") && !saire.equals("No") && !saire.equals("no"));
        if (saire.equals("Si") || saire.equals("si")) {
            Cadillac.setAire(true);
        } else if (saire.equals("No") || saire.equals("no")) {
            Cadillac.setAire(false);
        }

        do {
            System.out.println("Tiene asientos de piel: (Si/No)");
            sasientos = sc.nextLine();
        } while (!sasientos.equals("Si") && !sasientos.equals("si") && !sasientos.equals("No")
                && !sasientos.equals("no"));

        if (sasientos.equals("Si") || sasientos.equals("si")) {
            Cadillac.setAsientos(true);
        } else if (sasientos.equals("No") || sasientos.equals("no")) {
            Cadillac.setAsientos(false);
        }

        do {
            System.out.println("Es hibrido: (Si/No)");
            shibrido = sc.nextLine();
        } while (!shibrido.equals("Si") && !shibrido.equals("si") && !shibrido.equals("No") && !shibrido.equals("no"));

        if (shibrido.equals("Si") || shibrido.equals("si")) {
            Cadillac.setHibrido(true);
        } else if (shibrido.equals("No") || shibrido.equals("no")) {
            Cadillac.setHibrido(false);
        }

        System.out.println("Ingrese el precio: ");
        price = sc.nextDouble();
        Cadillac.setPrecio(price);

        System.out.println("No. de Cilindros: ");
        cilindros = sc.nextInt();
        Cadillac.setCilindros(cilindros);

        Cadillac.setColor(newcolor);

        String[][] allproperties = Cadillac.getAllProperties();
        for (int i = 0; i < allproperties.length; i++) {
            System.out.print(allproperties[i][0]);
            if (allproperties[i][1].equals("true")) {
                System.out.print("Si");
            } else if ((allproperties[i][1].equals("false"))) {
                System.out.print("No");
            } else {
                System.out.print(allproperties[i][1]);
            }
            System.out.println("");
        }
        sc.close();
    }
}
