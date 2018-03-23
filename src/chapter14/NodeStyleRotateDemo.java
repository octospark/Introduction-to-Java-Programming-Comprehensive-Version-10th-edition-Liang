package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.*;

/**
 * @author Erlin Goce
 *
 * Mar 21, 2018 12:47:21 PM
 */
public class NodeStyleRotateDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		Button btOK = new Button("OK");
		btOK.setStyle("-fx-border-color:blue; -fx-fill:red; -fx-text-fill:red;");
		Font font2 = Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 32);
		btOK.setFont(font2);
		btOK.setRotate(-15);
		pane.getChildren().add(btOK);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color:red; -fx-background-color: lightgray;");
		
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("NodeStyleRotateDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
