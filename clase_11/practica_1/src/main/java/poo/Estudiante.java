
package poo;

public class Estudiante extends Personah {
    private int _id;
    private String carrera;

    public Estudiante(String nombre, String apellidos, int edad, int _id, String carrera) {
        super(nombre, apellidos, edad);
        this._id = _id;
        this.carrera = carrera;
    }

    public String[][] getStudentProperties() {
        String[][] properties = new String[2][2];
        properties[0][0] = "_id: ";
        properties[0][1] = _id + "";
        properties[1][0] = "Carrera: ";
        properties[1][1] = carrera + "";
        return properties;
    }
}
