package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	private Stage primaryStage;
    private BorderPane rootLayout;
	
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage= primaryStage;
		this.primaryStage.setTitle("Volume Calculator");
		
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("CalcGui.fxml"));
			Pane pane = (Pane) loader.load();
			Scene scene = new Scene(pane);
			String css = Main.class.getResource("application.css").toExternalForm();
			scene.getStylesheets().clear();
			scene.getStylesheets().add(css);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
