package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpPageController {

	@FXML
	private TextField usernameField;
	
	@FXML
	private TextField emailField;
	
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private PasswordField congirmPasswordField;
	
	@FXML
	private TextField petNameField;
	
	@FXML
	private TextField petBreedField;
	
	@FXML
	private TextField petAgeField;

    @FXML
    private Button signUpButton;

    @FXML
    private void initialize() {
        // You can initialize any necessary components or data here
    }

    @FXML
    public void handleSignUp(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        
        // Perform validation and create User
        
        // If successful
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Signup Successful");
        alert.setHeaderText("Thank you for signing up with JavaPaws");
        alert.setContentText("You have successfully singup for JavaPaws.");
        alert.showAndWait();
        
	    // Load the home page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/loginPage.fxml"));
	    loader.setController(new LoginPageController());
	    Parent root = loader.load();
	    Scene scene = new Scene(root);

	    // Set the stage with the home scene
	    Stage stage = new Stage();
	    stage.setScene(scene);
	    stage.setTitle("Login Page");
	    stage.show();
	    
        // Close the current window
        Stage currentStage = (Stage) signUpButton.getScene().getWindow();
        currentStage.close();
    }
    
    public void handleProfile(ActionEvent event) throws Exception {     
    	
        // update/create event successful alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Save Profile Successful");
        alert.setHeaderText("Thank you for successfully Save Profile! ");
        alert.showAndWait();
        
	    // Load the home page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homePage.fxml"));
	    loader.setController(new HomePageController());
	    Parent root = loader.load();
	    Scene scene = new Scene(root);

	    // Set the stage with the home scene
	    Stage stage = new Stage();
	    stage.setScene(scene);
	    stage.setTitle("home Page");
	    stage.show();
	    
        // Close the current window
        Stage currentStage = (Stage) signUpButton.getScene().getWindow();
        currentStage.close();
    }

    private void signUpUser(String username, String email, String password) {
        // Implement the logic to sign up the user here
        // This could involve sending the data to a server, saving it to a database, etc.
        // You can customize this method according to your application's requirements
    }
}
