
package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CadastroPordutos extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main/TelaCadProduto.fxml"));

        
        Scene scene = new Scene(root);
        
       primaryStage.setTitle("Bem Vindo ao Gestão Online!");
       primaryStage.setScene(scene);
       primaryStage.show();
    }


    
    public static void main(String[] args) {
        launch(args);
    }
    
}
