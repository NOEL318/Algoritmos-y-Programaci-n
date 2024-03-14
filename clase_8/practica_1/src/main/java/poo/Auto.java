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

    public Auto() {// Builder
        ruedas = 4;
        largo = 430;
        ancho = 150;
        motor = 350;
        color = "Negro";
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

    public String setColor(String newcolor) {
        return color=newcolor;
    }
}
