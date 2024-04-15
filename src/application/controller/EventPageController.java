package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EventPageController {
	@FXML
	private Button homeButton;
	
    private Button myEventButton;

    private Button myProfileButton;
	
	@FXML
    private void initialize() {	
	}
		
		
	public void handleRsvp(ActionEvent event) throws Exception {
    	// Load the rsvp Page
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
    public void handleHomePage(ActionEvent event) throws Exception {

    	// Load the home page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homePage.fxml"));
	    loader.setController(new HomePageController());
	    Parent root;
		try {
			root = loader.load();
		
 		    Scene scene = new Scene(root);

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("home Page");
 		    stage.show();
 		    
 	        // Close the current window
 	        Stage currentStage = (Stage) homeButton.getScene().getWindow();
 	        currentStage.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    public void handleProfile(ActionEvent event) throws Exception {        
	    // Load the home page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/profile.fxml"));
	    loader.setController(new SignUpPageController());
	    Parent root = loader.load();
	    Scene scene = new Scene(root);

	    // Set the stage with the home scene
	    Stage stage = new Stage();
	    stage.setScene(scene);
	    stage.setTitle("profile Page");
	    stage.show();
	    
        // Close the current window
        Stage currentStage = (Stage) homeButton.getScene().getWindow();
        currentStage.close();
    }

}
