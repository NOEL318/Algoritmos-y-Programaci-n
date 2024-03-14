package poo;

public class Pokemon {
    private String nombre;
    private String sexo;
    private int peso;
    private int altura;
    private int velocidad;
    private int defensa;
    private int ataque;
    private int vida;
    private int _id;

    // Builder
    public Pokemon(String nombre, String sexo, int peso, int altura, int velocidad, int defensa, int ataque, int vida,
            int _id) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.ataque = ataque;
        this.vida = vida;
        this._id = _id;
    }

    public String getName() {
        return nombre;
    }
    public String getSex() {
        return sexo;
    }
    public int getWeight() {
        return peso;
    }
    public int getHeight() {
        return altura;
    }
    public int getSpeed() {
        return velocidad;
    }
    public int getDefense() {
        return defensa;
    }
    public int getAttack() {
        return ataque;
    }

    public int getId() {
        return _id;
    }

    public String getPokemon() {
        return "\n_id: " + _id + "\nNombre: " + nombre + "\nPeso: " + peso + "\nAltura: " + altura + "\nVelocidad: "
                + velocidad + "\nDefensa " + defensa + "\nAtaque: " + ataque + "\nVida: "
                + vida + "\nSexo: "
                + sexo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int damage) {
        this.vida = vida - damage;
    }

    public void setPeso(int newweight) {
        this.peso = newweight;
    }

}
