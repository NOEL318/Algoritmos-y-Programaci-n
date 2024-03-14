package poo;

public class PartialTimeProfessor extends Profesor {
    private int horas;
    private String depto;
    private Double sueldo;

    public PartialTimeProfessor(String nombre, String apellidos, int edad, int horas, String depto, Double sueldo) {
        super(nombre, apellidos, edad, horas, depto, sueldo);
        this.horas = horas;
        this.depto = depto;
        this.sueldo = sueldo;
    }

    public String getHoras(){
        return horas+" horas."
    }

    public String getSueldo(){
        return sueldo+" sueldo."
    }
}
