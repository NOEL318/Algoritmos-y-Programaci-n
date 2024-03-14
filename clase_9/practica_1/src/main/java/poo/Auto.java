
package poo;

public class Auto {
    private int ruedas;
    private int largo;
    String color;
    boolean clima;

    public Auto() {// Builder
        ruedas = 4;
        largo = 250;
    }

    // Getters
    public String getDatos() {
        return "El auto tiene: " + ruedas + " ruedas, " + largo + "cm de largo y es color: " + color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setClima(String clima) {
        if (clima.equals("Si") || clima.equals("si")) {
            this.clima = true;
        } else if (clima.equals("No") || clima.equals("no")) {
            this.clima = false;
        }
    }

    public String getClima() {
        if (this.clima) {
            return "El auto tiene clima";
        } else {
            return "El auto no tiene clima";
        }
    }

}