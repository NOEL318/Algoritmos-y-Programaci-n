package poo;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {
    public static final String ANSI_BLUE = "\u001B[44m";
    public static final String ANSI_RED = "\u001B[41m";
    public static final String ANSI_WHITE = "\u001B[107m";
    public static final String ANSI_BLACK = "\u001B[40m";

    public static final String ANSI_REDT = "\u001B[31m";
    public static final String ANSI_WHITET = "\u001B[97m";
    public static final String ANSI_BLACKT = "\u001B[30m";

    public static final String ANSI_YELLOW = "\u001B[43m";
    public static final String ANSI_GREEN = "\u001B[42m";
    public static final String ANSI_PINK = "\u001B[45m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String[] ANSI_ARRAY = { "\u001B[44m", "\u001B[41m", "\u001B[107m", "\u001B[40m", "\u001B[43m",
            "\u001B[42m", "\u001B[45m" };

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_RED + ANSI_REDT + "\n▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄" + ANSI_RESET);
        String modify = "";
        System.out.println(ANSI_BLACK + ANSI_BLACKT + "▄▄▄▄▄▄▄▄▄▄" + ANSI_RESET + "POKEMÓN" +
                ANSI_BLACK + ANSI_BLACKT + "▄▄▄▄▄▄▄▄▄▄▄" + ANSI_RESET);
        System.out.println(ANSI_WHITE + ANSI_WHITET + "▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" + ANSI_RESET);
        System.out.print(ANSI_PINK + "Ingrese El número de Pokemones a agregar: ");
        int cant = sc.nextInt();

        System.out.print("\n\n");
        Pokemon[] registro = new Pokemon[cant];
        Debilidad[] debilidad = {};
        Evolucionado[] evolucionado = {};
        Inmunidad[] inmunidad = {};
        int home_id = 0;
        int visit_id = 0;
        for (int i = 0; i < cant; i++) {
            int index = 0;
            do {
                index = (int) (Math.random() * 10);
            } while (index > 6);
            System.out.print(ANSI_ARRAY[index] + "Ingrese el Nombre de su Pokemon: ");
            String nombre = sc.next();
            System.out.print("Ingrese el Sexo de su Pokemon: ");
            String sexo = sc.next();
            System.out.print("Ingrese el Peso de su Pokemon: ");
            int peso = sc.nextInt();
            System.out.print("Ingrese La Altura de su Pokemon: ");
            int altura = sc.nextInt();
            System.out.print("Ingrese La Velocidad de su Pokemon: ");
            int velocidad = sc.nextInt();
            System.out.print("Ingrese La Defensa de su Pokemon: ");
            int defensa = sc.nextInt();
            System.out.print("Ingrese El Ataque de su Pokemon: ");
            int ataque = sc.nextInt();
            System.out.print("Ingrese La Vida de su Pokemon: ");
            int vida = sc.nextInt();
            System.out.print("Ingrese El número de su Pokemon en el Catálogo: " + ANSI_RESET);
            int _id = sc.nextInt();
            System.out.print("\n\n");
            index = 0;
            registro[i] = new Pokemon(nombre, sexo, peso, altura, velocidad, defensa, ataque, vida, _id);
        }

        do {
            System.out.print(ANSI_ARRAY[0] + "Desea cambiar alguna propiedad de algún pokemon: ");
            modify = sc.next();
            if (modify.equals("Si") || modify.equals("si")) {
                System.out.print(ANSI_GREEN + "Ingrese el _id del Pokemon a modificar: ");
                int search_id = sc.nextInt();
                for (int i = 0; i < registro.length; i++) {
                    if (registro[i].getId() == search_id) {
                        System.out.println("Su pokemon es el siguiente: ");
                        System.out.println(registro[i].getPokemon());
                        System.out.println("Ingrese la debilidad de su pokemon: ");
                        String adddebilidad = sc.next();

                        System.out.println("Ingrese el nivel de evolución de su pokemon: ");
                        int addevolucion = sc.nextInt();

                        System.out.println("Ingrese la Inmunidad de su pokemon: ");
                        String addinmunidad = sc.next();

                        debilidad = Arrays.copyOf(debilidad, debilidad.length + 1);
                        debilidad[debilidad.length - 1] = new Debilidad(registro[i].getName(), registro[i].getSex(),
                                registro[i].getWeight(), registro[i].getHeight(), registro[i].getSpeed(),
                                registro[i].getDefense(), registro[i].getAttack(), registro[i].getVida(),
                                registro[i].getId(), adddebilidad);

                        evolucionado = Arrays.copyOf(evolucionado, evolucionado.length + 1);
                        evolucionado[evolucionado.length - 1] = new Evolucionado(registro[i].getName(),
                                registro[i].getSex(),
                                registro[i].getWeight(), registro[i].getHeight(), registro[i].getSpeed(),
                                registro[i].getDefense(), registro[i].getAttack(), registro[i].getVida(),
                                registro[i].getId(), addevolucion);

                        inmunidad = Arrays.copyOf(inmunidad, inmunidad.length + 1);
                        inmunidad[inmunidad.length - 1] = new Inmunidad(registro[i].getName(),
                                registro[i].getSex(),
                                registro[i].getWeight(), registro[i].getHeight(), registro[i].getSpeed(),
                                registro[i].getDefense(), registro[i].getAttack(), registro[i].getVida(),
                                registro[i].getId(), addinmunidad);
                    }
                }

                for (int i = 0; i < registro.length; i++) {
                    System.out.println(ANSI_YELLOW + "Pokemones con Debilidades:");
                    System.out.println(debilidad[i].getPokemon());
                    System.out.println(debilidad[i].getDebilityPokemon());

                }
                for (int i = 0; i < registro.length; i++) {

                    System.out.println(ANSI_GREEN + "Pokemones con Evolucion:");
                    System.out.println(evolucionado[i].getPokemon());
                    System.out.println(evolucionado[i].getEvolutionedPokemon());

                }
                for (int i = 0; i < registro.length; i++) {
                    System.out.println(ANSI_PINK + "Pokemones con Inmunidad:");
                    System.out.println(inmunidad[i].getPokemon());
                    System.out.println(inmunidad[i].getInmunityPokemon());
                }
            }
        } while (!modify.equals("No") && !modify.equals("no"));
        do {

            System.out.println("Ingrese el _id del pokemon que elige: ");
            home_id = sc.nextInt();
            System.out.println("Ingrese el _id del pokemon que desafía: ");
            visit_id = sc.nextInt();
            if (home_id == visit_id) {
                System.out.println("No te puedes desafiar a ti mismo, elije otro pokemon");
            }
        } while (home_id == visit_id);
        for (int i = 0; i < registro.length; i++) {
            for (int e = 0; e < registro.length; e++) {
                if (registro[i].getId() == home_id && registro[e].getId() == visit_id) {
                    long waitime = 1000;
                    do {
                        Thread.sleep(1000);
                        int randomlife_home = (int) (Math.random() * 10);
                        System.out.println(
                                registro[i].getName() + " Hizo un ataque con " + randomlife_home + "% de daño");
                        registro[i].setVida(randomlife_home);
                        Thread.sleep(waitime);

                        int randomlife_visit = (int) (Math.random() * 10);
                        System.out.println(
                                registro[e].getName() + " Hizo un ataque con " + randomlife_visit + "% de daño");
                        registro[e].setVida(randomlife_visit);
                    } while (registro[i].getVida() > 0 && registro[e].getVida() > 0);
                    if (registro[i].getVida() > registro[e].getVida()) {
                        System.out.println("El campeón es: " + registro[i].getName());
                    } else {
                        System.out.println("El campeón es: " + registro[e].getName());
                    }
                } else if (registro.length == i) {
                    System.out.println("Por favor elija un pokemon que haya registrado previamente: ");
                }

            }
        }

        sc.close();
    }
}
