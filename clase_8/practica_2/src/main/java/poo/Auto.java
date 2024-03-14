/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/package-info.java to edit this template
 */
package poo;

public class Auto {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    String color;
    boolean aire;
    boolean asientos;
    boolean hibrido;
    double precio;
    int cilindros;

    public Auto() {// Builder
        ruedas = 4;
        largo = 430;
        ancho = 150;
        motor = 350;
        color = "Negro";
        aire = false;
        asientos = false;
        hibrido = false;
        precio = 0;
        cilindros = 0;
    }

    // Getters
    public String getRuedas() {
        return "El auto tiene: " + ruedas + " ruedas";
    }

    public String getLargo() {
        return "El largo es: " + largo + " largo";
    }

    public String getAncho() {
        return "El ancho es: " + ancho + " ancho";
    }

    public String getMotor() {
        return "La el motor pesa tiene: " + motor + " motor";
    }

    public String getColor() {
        return "El auto es color: " + color;
    }

    public String[][] getAllProperties() {
        String[][] array = {
                { "No. Ruedas: ", "" + ruedas },
                { "Largo: ", "" + largo },
                { "Ancho: ", "" + ancho },
                { "Motor: ", "" + motor },
                { "Color: ", "" + color },
                { "Aire Acondicionado: ", "" + aire },
                { "Asientos de piel: ", "" + asientos },
                { "Hibrido: ", "" + hibrido },
                { "Precio: ", "" + precio },
                { "Cilindros: ", "" + cilindros }
        };
        return array;
    }

    public String setColor(String newcolor) {
        return color = newcolor;
    }

    public Double setPrecio(Double newprecio) {
        return precio = newprecio;
    }

    public Integer setCilindros(int newcilindros) {
        return cilindros = newcilindros;
    }

    public Boolean setAire(Boolean newaire) {
        return aire = newaire;
    }

    public Boolean setAsientos(Boolean newasientos) {
        return asientos = newasientos;
    }

    public Boolean setHibrido(Boolean newhibrido) {
        return hibrido = newhibrido;
    }
}