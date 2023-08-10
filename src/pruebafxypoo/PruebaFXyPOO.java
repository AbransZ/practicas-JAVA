package pruebafxypoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


// @author AbransZ

public class PruebaFXyPOO extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
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
