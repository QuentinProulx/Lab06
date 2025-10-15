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
public class Lab0601 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // Constants for the scene size
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;

        // Constants for each square's XY coordinates
        final int X1 = 10, Y1 = 10; // Square #1
        final int X2 = 60, Y2 = 60; // Square #1
        final int X3 = 110, Y3 = 110; // Square #3

        // Constants for each square's width and height
        final int WIDTH1 = 500, HEIGHT1 = 500; // Square #1
        final int WIDTH2 = 400, HEIGHT2 = 400; // Square #2
        final int WIDTH3 = 300, HEIGHT3 = 300; // Square #3

        // Constants for the circle's geometry
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;

        // Create square #1 here. Set its stroke color to black
        // and set its fill color to null.
        Rectangle rect1 = new Rectangle(X1, Y1, WIDTH1, HEIGHT1);
        rect1.setFill(null);
        rect1.setStroke(Color.BLACK);

        // Create square #2 here. Set its stroke color to black
        // and set its fill color to null.
        Rectangle rect2 = new Rectangle(X2, Y2, WIDTH2, HEIGHT2);
        rect2.setFill(null);
        rect2.setStroke(Color.BLACK);

        // Create square #3 here. Set its stroke color to black
        // and set its fill color to null.
        Rectangle rect3 = new Rectangle(X3, Y3, WIDTH3, HEIGHT3);
        rect3.setFill(null);
        rect3.setStroke(Color.BLACK);

        // Create the diagonal lines here.
        Line line1 = new Line(10, 10, 110, 110);
        Line line2 = new Line(510, 10, 410, 110);
        Line line3 = new Line(10, 510, 110, 410);
        Line line4 = new Line(510, 510, 410, 410);
        
        // Create the circle here.
        // Add the nodes to a Pane here.
        Circle circ = new Circle(260, 260, 150);
        circ.setStroke(Color.BLACK);
        
        // Create a Scene with the Pane as the root node,
        // and display it here.
        Pane root = new Pane(rect1, rect2, rect3, line1, line2, line3, line4, circ);
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}
