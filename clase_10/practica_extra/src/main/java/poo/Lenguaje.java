/*
 *
 * Noel Rincón Anaya - 181233
 *
 */
package poo;

public class Lenguaje {
  private final String nombre;
  private Double experiencia;
  private Double porcentaje;
  private boolean nivel;

  // public static int _id for static vars on every object
  public Lenguaje(String name, Double nexperiencia, Double nporcentaje, boolean nnivel) {
    nombre = name;
    this.experiencia = nexperiencia;
    this.porcentaje = nporcentaje;
    this.nivel = nnivel;
  }

  public String getDatos() {
    return nombre + " " + experiencia + " " + porcentaje + " " + (nivel == true ? "Alto Nivel" : "Bajo Nivel");
  }

  public String getName() {
    return nombre;
  }

  public Double getExperiencia() {
    return experiencia;
  }

}
