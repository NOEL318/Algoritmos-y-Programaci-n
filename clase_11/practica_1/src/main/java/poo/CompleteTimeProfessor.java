package poo;

public class CompleteTimeProfessor extends Profesor {
    private int horas;

    public CompleteTimeProfessor(String nombre, String apellidos, int edad, int _id, String depto, int horas) {
        super(nombre, apellidos, edad, _id, depto);
        this._id = _id;
        this.depto = depto;
        this.horas = horas;
    }

    public String getHoras() {
        return horas + " horas.";
    }
}
