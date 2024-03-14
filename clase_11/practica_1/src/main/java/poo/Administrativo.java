
package poo;

public class Administrativo extends Personah {
    private int _id;
    private String puesto;

    public Administrativo(String nombre, String apellidos, int edad, int _id, String puesto) {
        super(nombre, apellidos, edad);
        this._id = _id;
        this.puesto = puesto;

    }

    public String[][] getAdminProperties() {
        String[][] properties = new String[2][2];
        properties[0][0] = "_id: ";
        properties[0][1] = _id + "";
        properties[1][0] = "Puesto: ";
        properties[1][1] = puesto + "";
        return properties;
    }

}
