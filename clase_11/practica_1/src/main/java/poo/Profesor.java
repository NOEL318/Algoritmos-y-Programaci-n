
package poo;

public class Profesor extends Personah {
    private int horas;
    private String depto;
    private Double sueldo;

    public Profesor(String nombre, String apellidos, int edad, int horas, String depto, double sueldo) {
        super(nombre, apellidos, edad);
        this.horas = horas;
        this.depto = depto;
        this.sueldo = sueldo;

    }

    public String[][] getTeacherProperties() {
        String[][] properties = new String[3][2];
        properties[0][0] = "Horas: ";
        properties[0][1] = horas + "";
        properties[1][0] = "Departamento: ";
        properties[1][1] = depto + "";
        properties[2][0] = "Sueldo: ";
        properties[2][1] = sueldo + "";
        return properties;
    }

    public String getHoras(){
        return horas+" horas.";
    }
    public String getSueldo(){
        return sueldo+" sueldo.";
    }
}
