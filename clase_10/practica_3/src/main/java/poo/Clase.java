/*
 *
 * Noel Rincón Anaya - 181233
 *
 */
package poo;

public class Clase {
  private final String nombre_clase;
  private String clave;
  private int horas;
  private String depto;
  private int unidades;
  private boolean tronco;
  // public static int _id for static vars on every object
  public Clase(String name, String nclave, int nhoras, String ndepto, boolean nbtronco, int nunidades) {
    nombre_clase = name;
    clave = nclave;
    horas = nhoras;
    this.depto = ndepto;
    unidades = nunidades;
    tronco = nbtronco;
  }

  public String getDatos() {
    return nombre_clase + " " + clave + " " + horas + " " + depto + " " + unidades;
  }

  public String getClave() {
    return clave;
  }

  public int getHours() {
    return horas;
  }

  public boolean getTronco() {
    return tronco;
  }

}
