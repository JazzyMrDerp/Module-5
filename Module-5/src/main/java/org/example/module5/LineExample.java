package org.example.module5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class LineExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // TODO Auto-generated method stub
        Line line = new Line(); //instantiating Line class
        line.setStartX(0); //setting starting X point of Line
        line.setStartY(0); //setting starting Y point of Line
        line.setEndX(100); //setting ending X point of Line
        line.setEndY(200); //setting ending Y point of Line
        Group root = new Group(); //Creating a Group
        root.getChildren().add(line); //adding the class object //to the group
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Line Example");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}



