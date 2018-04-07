package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

/**
 * @author Erlin Goce
 *
 * Mar 30, 2018 3:02:50 PM
 */
public class ShowText extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		Text text1 = new Text(20, 20, "Programming is fun");
		text1.setFont(Font.font("Courier", FontWeight.BOLD,
				FontPosture.ITALIC, 15));
		pane.getChildren().add(text1);
		Text text2 = new Text(60, 60, "Programming is fun\nDisplayText");
		pane.getChildren().add(text2);
		
		Text text3 = new Text(10, 100, "Programming is fun\nDisplayText");
		text3.setFill(Color.RED);
		text3.setUnderline(true);
		text3.setStrikethrough(true);
		pane.getChildren().add(text3);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowText");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
