package PokemonPOO;

import PokemonPOO.Interfaces.Fuego;
import javax.swing.JOptionPane;

// @author AbransZ
public class Charmander extends Pokemom implements Fuego {

    @Override
    public void PuñoFuego() {
        JOptionPane.showMessageDialog(null, "Soy Charmander y estoy haciendo Puño de fuego");
    }

    @Override
    public void Ascuas() {

        JOptionPane.showMessageDialog(null, "Soy Charmander y esto haciendo ascuas");

    }

    @Override
    public void LanzaLlamas() {
        JOptionPane.showMessageDialog(null, "Soy Charmander y estoy haciendo Lanzallamas");

    }

}
