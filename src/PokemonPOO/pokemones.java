package PokemonPOO;

import javax.swing.JOptionPane;

// @author AbransZ
public class pokemones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Pokemon = null;
        String Ataque;

        Pikachu pika = new Pikachu();
        Bulbasur bulba = new Bulbasur();
        Charmander charman = new Charmander();
        Squirtel Squirt = new Squirtel();
        
        pika.getNombre();

        Pokemon = JOptionPane.showInputDialog("Que pokemon desea utilizar?");
        String Variable=Pokemon.toLowerCase();
        
        
        switch (Variable)
        {
            case "pikachu":

                Ataque = JOptionPane.showInputDialog("Que Ataque desea usar? \n "
                        + "1. ImpactTrueno\n "
                        + "2. Puño de trueno\n "
                        + "3. Rayo\n"
                        + "4. Hiper Rayo\n\n"
                        + "O ataques basicos \n"
                        + "5. Arañazo\n"
                        + "6. Placaje\n"
                        + "7. Mordisco");

                switch (Ataque)
                {
                    case "1":
                        pika.atacarImpacTrueno();
                        break;

                    case "2":
                        pika.atacarPuñoTrueno();
                        break;

                    case "3":
                        pika.atacarRayo();
                        break;

                    case "4":
                        pika.atacarRayoCarga();
                        break;
                    case "5":
                        pika.atacarArañazo();
                        break;
                    case "6":
                        pika.atacarPlacaje();
                        break;

                    case "7":
                        pika.atacarMordisco();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ataque no Registrado!!");
                        break;
                }

                break;
            default:
               JOptionPane.showMessageDialog(null, "Pokemon no Registrado!!");
               break;
        }
    }

}
