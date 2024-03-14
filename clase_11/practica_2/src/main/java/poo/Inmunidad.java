
package poo;

public class Inmunidad extends Pokemon {
    private String inmunidad;

    public Inmunidad(String nombre, String sexo, int peso, int altura, int velocidad, int defensa, int ataque,
            int vida, int _id,
            String inmunidad) {
        super(nombre, sexo, peso, altura, velocidad, defensa, ataque, vida, _id);
        this.inmunidad = inmunidad;
    }

    public String getInmunityPokemon() {
        return "\nInmunidad: " + inmunidad;
    }
}
