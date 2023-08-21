

package PokemonPOO;

import PokemonPOO.Interfaces.Acuatico;
import javax.swing.JOptionPane;


// @author AbransZ
 
public class Squirtel extends Pokemom implements Acuatico{

    @Override
    public void HidroBomba() {
        JOptionPane.showMessageDialog(null, "Soy Squirtel y estoy haciendo Hidrobomba");
        
    }

    @Override
    public void PistolaAgua() {
        
         JOptionPane.showMessageDialog(null, "Soy Squirtel y estoy haciendo Pistola de agua");
    }

    @Override
    public void HidroPulso() {
        
         JOptionPane.showMessageDialog(null, "Soy Squirtel y estoy haciendo hidropulso");
    }

    @Override
    public void Burbuja() {
        
         JOptionPane.showMessageDialog(null, "Soy Squirtel y estoy haciendo ataque burbujas");
    }

}
