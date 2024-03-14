/*
 * 
 * Noel Rincón Anaya - 181233
 * 
 */
package poo;

public class Empleado {
    // With final our String or var couldn't be modified from inside or outsinde
    // only in builder method
    private final String nombre;
    private String departamento;
    private int _id;

    public Empleado(String nombre, int _id) {
        this.nombre = nombre;
        this.departamento = "";
        this._id = _id;
    }

    public String[][] getData() {
        String[][] datos = { { "Nombre: ", "Departamento: ", "_id: " }, { nombre, departamento, _id + "" } };
        return datos;
    }

    public String setDepartamento(String departamento) {
        this.departamento = departamento;
        return departamento;
    }
    // Cannot be accessed cause have a 'final' definition on top
    // public void setNombre(String nombre) {
    // this.nombre = nombre;
    // }
}
