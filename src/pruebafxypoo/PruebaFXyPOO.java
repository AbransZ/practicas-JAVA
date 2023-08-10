package pruebafxypoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


// @author AbransZ

public class PruebaFXyPOO extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta Banesco = new Cuenta("Jose", 100.87);
        Cuenta provincial =new Cuenta("abrahan", 35.58);
        
        Banesco.retirar(24.50);
        Banesco.ingresar(85.90);
        
        provincial.ingresar(24.50);
        provincial.retirar(85.90);
        
        JOptionPane.showMessageDialog(null,Banesco.toString());
        JOptionPane.showMessageDialog(null,provincial.toString());
        provincial.toString();

//launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("PrimerFXyPOO.fxml"));
        Scene scene =new Scene(root);
        stage.setTitle("Bienvenido");
        stage.setScene(scene);
        stage.show();
    }

}
