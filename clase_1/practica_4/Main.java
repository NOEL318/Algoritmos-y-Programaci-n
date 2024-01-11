
//Leer datos de la persona Nombre, Edad y Estatura
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese Su Nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Ingrese Su Edad: ");
        int edad = scan.nextInt();
        System.out.print("Ingrese Su Estatura: ");
        float estatura = scan.nextFloat();

        System.out.println(("Usted se llama: " + nombre + "\nTiene: " + edad + " Años\nMide: " + estatura));
        scan.close();
    }
}
