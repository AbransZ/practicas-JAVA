

package PokemonPOO;

import PokemonPOO.Interfaces.Planta;
import javax.swing.JOptionPane;


// @author AbransZ
 
public class Bulbasur extends Pokemom implements Planta{

    @Override
    public void LatigoCepa() {
         JOptionPane.showMessageDialog(null, "Soy bulbasur y estoy haciendo Latigo Cepa");
    }

    @Override
    public void Paralizar() {
        JOptionPane.showMessageDialog(null, "Soy bulbasur y estoy haciendo Paralizar");
    }

    @Override
    public void Drenaje() {
     JOptionPane.showMessageDialog(null, "Soy bulbasur y estoy haciendo Drenaje");   
    }

    @Override
    public void HojaAfilada() {
        JOptionPane.showMessageDialog(null, "Soy bulbasur y estoy haciendo Hoja afilada");
    }
    
    

}
