package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
/**
 * @author Erlin Goce
 *
 * Mar 23, 2018 4:44:09 PM
 */
public class FontDemo extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new StackPane();
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
		pane.getChildren().add(circle);
		
		Label label = new Label("JavaFX");
		String fontName = Font.getFontNames().get((int)(Math.random() * 399));
		label.setFont(Font.font(fontName, FontWeight.BOLD, FontPosture.ITALIC,
				20));
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setTitle("FontDemo");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
