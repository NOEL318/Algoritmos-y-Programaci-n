package poo;

public class Personah {
    // Personah properties
    private String nombre;
    private String apellidos;
    private int edad;

    // Builder
    public Personah(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getName() {
        return nombre;
    }

    public String getLastName() {
        return apellidos;
    }
    public int getAge() {
        return edad;
    }

}
