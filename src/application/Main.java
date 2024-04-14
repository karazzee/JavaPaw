package application;
	
import java.io.IOException;

import application.controller.LoginPageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/loginPage.fxml"));
        loader.setController(new LoginPageController());
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
