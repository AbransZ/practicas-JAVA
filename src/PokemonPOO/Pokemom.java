package PokemonPOO;

import javax.swing.JOptionPane;

// @author AbransZ
public abstract class Pokemom {

    protected int num_pokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    protected String tipo;

    public Pokemom(int num_pokedex, String nombre, double peso, String sexo, int temporada, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
        this.tipo = tipo;
    }

    public Pokemom() {
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNombre() {
        nombre=JOptionPane.showInputDialog("Ingresa el nombre del pokemon");
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Metodo de ataque placaje
    public void atacarPlacaje() {

        JOptionPane.showMessageDialog(null, "Soy " + nombre + "y estoy atacando placaje");

    }

    //Metodo ataque arañazo
    public void atacarArañazo() {

        JOptionPane.showMessageDialog(null, "Soy " + nombre + "y estoy atacando arañazo");

    }

    //Metodo ataque Mordisco
    public void atacarMordisco() {

        JOptionPane.showMessageDialog(null, "Soy " + nombre + "y estoy atacando mordisco");

    }
}
