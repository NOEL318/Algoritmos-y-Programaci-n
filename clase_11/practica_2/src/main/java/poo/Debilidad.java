
package poo;

public class Debilidad extends Pokemon {
    private String debilidad;

    public Debilidad(String nombre, String sexo, int peso, int altura, int velocidad, int defensa, int ataque,
            int vida, int _id,
            String debilidad) {
        super(nombre, sexo, peso, altura, velocidad, defensa, ataque, vida, _id);
        this.debilidad = debilidad;
    }

    public String getDebilityPokemon() {
        return "\nDebilidad: " + debilidad;
    }

}
