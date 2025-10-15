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
 * https://github.com/QuentinProulx/Lab06
 * @author 6324569 - Quentin Proulx
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

        // Ground
        Rectangle grass = new Rectangle(0, 400, 500, 100);
        grass.setFill(Color.GREEN);
        
        // House
        Rectangle baseHouse = new Rectangle(150, 200, 200, 200);
        baseHouse.setFill(Color.LIGHTGREY);
        baseHouse.setStroke(Color.BLACK);
        
        Polygon roof = new Polygon(150, 200, 350, 200, 250, 100, 3);
        roof.setFill(Color.RED);
        
        Rectangle base = new Rectangle(150, 400, 200, 10);
        base.setFill(Color.BEIGE);
        
        Rectangle door = new Rectangle(225, 300, 50, 100);
        door.setFill(Color.DARKRED);
        
        Rectangle chimney = new Rectangle(175, 100, 25, 75);
        chimney.setFill(Color.GRAY);
        
        // Windows
        Rectangle window1 = new Rectangle(275, 230, 50, 50);
        window1.setFill(Color.LIGHTBLUE);
        
        Rectangle window2 = new Rectangle(175, 230, 50, 50);
        window2.setFill(Color.LIGHTBLUE);
        
        Line v1 = new Line(200, 280, 200, 230);
        Line v2 = new Line(300, 280, 300, 230);
        
        Line h1 = new Line(175, 255, 225, 255);
        Line h2 = new Line(275, 255, 325, 255);
        
        // Sun
        Circle sun = new Circle(450, 50, 40);
        sun.setFill(Color.YELLOW);
        
        Line beam1 = new Line(400, 50, 375, 50);
        beam1.setStroke(Color.YELLOW);
        
        Line beam2 = new Line(410, 85, 380, 115);
        beam2.setStroke(Color.YELLOW);
        
        Line beam3 = new Line(450, 100, 450, 125);
        beam3.setStroke(Color.YELLOW);
        
        // Running
        Pane root = new Pane(grass, baseHouse, roof, base, chimney, door, window1, window2, v1, v2, h1, h2, sun, beam1, beam2, beam3);
        Scene scene = new Scene(root, 500, 500);
        
        stage.setTitle("House with Window Panes");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
}
