package edu.kje;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) {
        primarystage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event){
                System.out.println("Hello World!");
            }
        
    });

    StackPane root = new StackPane();
    root.getChildren().add(btn);
    primarystage.setScene(new Scene(root, 300, 250));
    primarystage.show();

    }

}
