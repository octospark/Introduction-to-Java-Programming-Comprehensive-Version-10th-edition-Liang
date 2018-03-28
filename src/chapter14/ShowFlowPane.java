package chapter14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
/**
 * @author Erlin Goce
 *
 * Mar 27, 2018 7:41:03 PM
 */
public class ShowFlowPane extends Application{
	@Override
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.getChildren().addAll(new Label("First Name: "), 
				new TextField(), new Label("MI: "));
		TextField tfMI = new TextField();
		tfMI.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMI, new Label("Last Name: "),
				new TextField());
		
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("ShowFlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
