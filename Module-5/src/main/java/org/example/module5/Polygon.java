package org.example.module5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Collection;
import java.util.Collections;

public class Polygon extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Creating a Polygon
        Polygon polygon = new Polygon();
//Adding coordinates to the polygon
        polygon.getPoints().addAll(Collections.singleton(new Double[]{
                300.0, 50.0,
                450.0, 150.0,
                300.0, 250.0,
                150.0, 150.0,
        }));
//Creating a Group object
        Group root = new Group((Collection<Node>) polygon);
//Creating a scene object
        Scene scene = new Scene(root, 600, 300);
//Setting title to the Stage
        stage.setTitle("Drawing a Polygon");
//Adding scene to the stage
        stage.setScene(scene);
//Displaying the contents of the stage
        stage.show();
    }

    private Collection<Double[]> getPoints() {
        return null;
    }
}
