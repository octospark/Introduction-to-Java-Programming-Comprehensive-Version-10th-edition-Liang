package chapter14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * @author Erlin Goce
 *
 * Mar 28, 2018 10:30:39 PM
 */
public class ShowHBoxVBox extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBoxVBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private HBox getHBox() {
		HBox hBox = new HBox(20);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setStyle("-fx-background-color: gold");
		hBox.getChildren().add(new Button("Computer Science"));
		hBox.getChildren().add(new Button("Chemistry"));
		ImageView imageView = new ImageView(new Image("chapter14/image/us.gif"));
		hBox.getChildren().add(imageView);
		return hBox;
	}
	
	private VBox getVBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Courses"));
		
		Label[] courses = {new Label("CSCI 131"), new Label("CSCI 1302"),
				new Label("CSCI 2410"), new Label("CSCI 3720")};
		for (Label course: courses) {
			VBox.setMargin(course, new Insets(0, 0, 0, 15));
			vBox.getChildren().add(course);
		}
		return vBox;
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
