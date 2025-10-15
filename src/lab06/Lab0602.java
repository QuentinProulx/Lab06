/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author 6324569
 */
public class Lab0602 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // House
        Rectangle baseHouse = new Rectangle(150, 200, 200, 200);
        baseHouse.setFill(Color.LIGHTGREY);
        baseHouse.setStroke(Color.BLACK);
        
        Polygon roof = new Polygon(150, 200, 350, 200, 250, 100, 3);
        roof.setFill(Color.RED);
        
        Rectangle base = new Rectangle(150, 400, 200, 10);
        base.setFill(Color.WHEAT);
        
        // Running
        Pane root = new Pane(baseHouse, roof, base);
        Scene scene = new Scene(root, 500, 500);
        
        stage.setTitle("House with Window Panes");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
}
