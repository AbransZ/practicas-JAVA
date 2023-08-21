

package PokemonPOO;

import PokemonPOO.Interfaces.Electrico;
import javax.swing.JOptionPane;


// @author AbransZ
 
public class Pikachu extends Pokemom implements Electrico{

    @Override
    public void atacarImpacTrueno() {
       JOptionPane.showMessageDialog(null, "Soy Pikachu y estoy haciendo Impactrueno");
    }

    @Override
    public void atacarPuñoTrueno() {
        JOptionPane.showMessageDialog(null, "Soy Pikachu y estoy haciendo Puño de trueno");
    }

    @Override
    public void atacarRayo() {
        JOptionPane.showMessageDialog(null, "Soy Pikachu y estoy haciendo Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        JOptionPane.showMessageDialog(null, "Soy Pikachu y estoy haciendo Hiper Rayo");
        
    }

}
