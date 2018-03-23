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
 * Mar 21, 2018 11:44:53 AM
 */
public class ShowCircleCentered extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		
		// Create a scene ad place it in the shape
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setTitle("ShowCircleCentered");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
