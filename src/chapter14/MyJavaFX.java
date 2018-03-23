package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author Erlin Goce
 *
 * Mar 20, 2018 4:54:07 PM
 */
public class MyJavaFX extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/**
	 * The main method is only needed for the IDE with limited 
	 * JavaFX support. Not needed for running from the 
	 * */
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
