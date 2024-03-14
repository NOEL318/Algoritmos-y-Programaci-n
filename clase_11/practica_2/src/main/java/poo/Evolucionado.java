
package poo;

public class Evolucionado extends Pokemon {
    private int nivel_evolucion;

    public Evolucionado(String nombre, String sexo, int peso, int altura, int velocidad, int defensa, int ataque,
            int vida, int _id,
            int nivel_evolucion) {
        super(nombre, sexo, peso, altura, velocidad, defensa, ataque, vida, _id);
        this.nivel_evolucion = nivel_evolucion;
    }

    public String getEvolutionedPokemon() {
        return  "\nNivel de Evolución: "+ nivel_evolucion;
    }

}
