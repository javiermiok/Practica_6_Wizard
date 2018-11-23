package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	Stage stage;
	
	public void mainWindow() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"VentanaWizard.fxml"));
			AnchorPane pane = loader.load();
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(pane));
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		mainWindow();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
