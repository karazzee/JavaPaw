package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import application.Main;

public class LoginPageController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink signUpLink;

    @FXML
    private void initialize() {
        signUpLink.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/signUpPage.fxml"));
                loader.setController(new SignUpPageController());
                Parent root = loader.load();
                Scene scene = new Scene(root);
     		    // Set the stage with the home scene
     		    Stage stage = new Stage();
     		    stage.setScene(scene);
     		    stage.setTitle("SignUp Page");
     		    stage.show();
                
                // Close the current window
                Stage currentStage = (Stage) signUpLink.getScene().getWindow();
                currentStage.close();
                
            } catch (IOException e) {
                e.printStackTrace();
                // Handle any exceptions
            }
        });
    }

    @FXML
    private void handleLogin() throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        // Check if the username and password match the expected values
        if (username.equals("admin") && password.equals("password")) {
            // Call the showHomePage method from the Main class
            showHomePage();
            
            // Close the current window
            Stage currentStage = (Stage) usernameField.getScene().getWindow();
            currentStage.close();
        } else {
            // Show an alert dialog for invalid credentials
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText("Invalid Credentials");
            alert.setContentText("The username or password you entered is incorrect.");
            alert.showAndWait();
        }
    }
    // Method to switch to home page
 	  public static void showHomePage() throws IOException {
 		    // Load the home page
 		    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homePage.fxml"));
 		    loader.setController(new HomePageController());
 		    Parent root = loader.load();
 		    Scene scene = new Scene(root);
 		    scene.getStylesheets().add("application.css");

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("Home Page");
 		    stage.show();
 		}
    
    
}
