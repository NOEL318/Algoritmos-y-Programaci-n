package poo;

public class CompleteTimeProfessor extends Profesor {
    private int incentivo;
    private double sueldo;
    private int horas;
    private String depto;

    public CompleteTimeProfessor(String nombre, String apellidos, int edad, int horas, String depto,
            double sueldo, int incentivo) {
        super(nombre, apellidos, edad, horas, depto, sueldo);
        this.incentivo = incentivo;
        this.horas = horas;
        this.sueldo = sueldo;
        this.depto = depto;
    }

    public String getHoras() {
        return horas + " horas.";
    }

    public String getSueldo() {
        return sueldo + " sueldo.";
    }

    public String getIncentivo() {
        return incentivo + " incentivo.";
    }

    public String[][] getTeacherProperties() {
        String[][] properties = new String[4][2];
        properties[0][0] = "Horas: ";
        properties[0][1] = horas + "";
        properties[1][0] = "Departamento: ";
        properties[1][1] = depto + "";
        properties[2][0] = "Sueldo: ";
        properties[2][1] = sueldo + "";
        properties[3][0] = "Incentivo: ";
        properties[3][1] = incentivo + "";
        return properties;
    }

}
