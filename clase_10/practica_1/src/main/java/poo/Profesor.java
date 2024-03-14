/*
 *
 * Noel Rincón Anaya - 181233
 *
 */
package poo;

public class Profesor {
  private int _id;
  private static int _idSig=181232;;
  private final String nombre;
  private String apellido_paterno;
  private String apellido_materno;
  private int gradoest;
  private String depto;

  // public static int _id for static vars on every object
  
  public Profesor(String name, String lastnamep, String lastnamem, int gradoest) {
    nombre = name;
    apellido_paterno = lastnamep;
    apellido_materno = lastnamem;
    this.gradoest = gradoest;
    _id=_idSig;
    _idSig++;
    depto="Computacion";
  }



  public String getDatos(){
    return _id+" "+nombre+" "+ apellido_paterno+" "+apellido_materno+" "+ depto+" "+gradoest;
  }

  public static int getId() {
    return _idSig;
  }




}
