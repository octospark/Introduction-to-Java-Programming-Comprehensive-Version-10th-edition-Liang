package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author Erlin Goce
 *
 * Mar 20, 2018 5:25:08 PM
 */
public class MultipleTageDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene ad place a button in the scene
		Scene scene = new Scene(new Button("OK"), 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		Stage stage = new Stage(); // Create a new stage
		stage.setTitle("Second stage"); // Set the stage title
		// Set a scene with a button in the stage
		stage.setScene(new Scene(new Button("New Stage"), 100, 100));
		stage.show(); // Display the stage
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
