package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
/**
 * @author Erlin Goce
 *
 * Mar 20, 2018 6:16:08 PM
 */
public class ButtonInPane extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in a pane"); // Set a stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
