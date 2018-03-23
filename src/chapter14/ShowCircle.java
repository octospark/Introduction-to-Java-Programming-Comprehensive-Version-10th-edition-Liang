package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author Erlin Goce
 *
 * Mar 20, 2018 6:22:17 PM
 */
public class ShowCircle extends Application {
	@Override // Override the start method in the Applicaion class
	public void start(Stage primaryStage) {
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHEAT);
		
		// Create a pane to hold the circle
		Pane pane  = new Pane();
		pane.getChildren().add(circle);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("ShowCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
