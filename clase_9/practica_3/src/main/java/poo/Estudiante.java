/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */
package poo;

public class Estudiante {
    final String nombres;
    final String apellido_paterno;
    final String apellido_materno;
    static int _id = 181233;
    String carrera;
    public static String role;

    // public static int _id for static vars on every object
    public Estudiante(String nombres, String apellido_paterno, String apellido_materno) {
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        _id = _id + 1;
        role = "Estudiante";
    }

    public String[][] getEstudiantes() {
        String[][] array_estudiantes = {
                { "Nombre: ", "Apellido Paterno: ", "Apellido Materno: ", "_ID: ", "Rol: ", "Carrera: " },
                { nombres, apellido_paterno, apellido_materno, _id + "", role, carrera } };
        return array_estudiantes;
    }

    public String setCarrera(String carrera) {
        return this.carrera = carrera;
    }

    public void set_id(Boolean reset) {
        if (reset) {
            _id = 181233;
        }
    }

}
