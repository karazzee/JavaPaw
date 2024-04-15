package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CancelPageController {
	@FXML
	private Button homeButton;
	
	@FXML
	private Button myEventButton;
	
	@FXML
    private void initialize() {	
	}
	
	public void handleHomeButtonClicked(ActionEvent event) throws Exception {
    	// Load the event page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homePage.fxml"));
	    loader.setController(new HomePageController());
	    Parent root;
		try {
			root = loader.load();
		
 		    Scene scene = new Scene(root);

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("Home Page");
 		    stage.show();
 		    
 	        // Close the current window
 	        Stage currentStage = (Stage) homeButton.getScene().getWindow();
 	        currentStage.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void handleRsvp(ActionEvent event) throws Exception {
    	// Load the event page
        System.out.println("cancel > rsvpPage ");

	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/rsvpPage.fxml"));
	    loader.setController(new RsvpPageController());
	    Parent root;
		try {
			root = loader.load();
		
 		    Scene scene = new Scene(root);

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("rsvp Page");
 		    stage.show();
 		    
 	        // Close the current window
 	        Stage currentStage = (Stage) homeButton.getScene().getWindow();
 	        currentStage.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
}
