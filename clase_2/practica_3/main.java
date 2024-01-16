
// Programa que usa operadores lógicos

public class main {
    public static void main(String[] args) {
        System.out.println("Noel Rincón Anaya\n181233\n");

        String Nombre = "Noel ";
        String Apellido_Paterno = "Rincon ";
        String Apellido_Materno = "Anaya";
        String Nombre_Completo = Nombre + Apellido_Paterno + Apellido_Materno;

        System.out.println(
                Nombre.toUpperCase() + Apellido_Paterno.toUpperCase() + Apellido_Materno.toUpperCase());

        System.out.println("Numero de letras de tu nombre: " + Nombre.length());

        System.out.println(
                Nombre_Completo.replace("a", "*"));

    }
}