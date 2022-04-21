/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafx_test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFX_Test extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        Image image;
        String path = "Untitled.png";
        image = new Image (getClass().getResource(path).toString());
        
        Rectangle rect = new Rectangle(200, 100, Color.AQUA);
        Polygon pol = new Polygon(new double[]{
            20.0,10.0,
            24.0,50.0,
            100.0,70.0,
        });

        Scene scene = new Scene(root, 300, 250);
        
        ImageView imageView = new ImageView(image);
        imageView.setImage(image);
        root.getChildren().add(imageView);
        
        root.getChildren().add(rect);
        rect.setLayoutX (20);
        rect.setLayoutY (20);
        rect.setStroke(Color.BISQUE);
        rect.setStrokeWidth(10);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        root.getChildren().add(pol);

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
