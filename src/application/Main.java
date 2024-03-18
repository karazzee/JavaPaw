package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
        Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("fxml/loginPage.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        stage.setTitle("JavaFX Application");
        stage.setScene(new Scene(root, 1024, 768));
        stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
