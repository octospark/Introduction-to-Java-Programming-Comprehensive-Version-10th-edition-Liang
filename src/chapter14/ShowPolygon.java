package chapter14;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
/**
 * @author Erlin Goce
 *
 * Apr 7, 2018 7:26:44 PM
 */
public class ShowPolygon extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 1200, HEIGHT = 600;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		for (int i = 0; i < 20; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 20));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 20));
		}
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setTitle("ShowPolygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
