package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/loginPage.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Login Page");
        stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
