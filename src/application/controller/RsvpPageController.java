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

public class RsvpPageController {
		
	@FXML
	private Button homeButton;
	
    @FXML
    private void initialize() {

    }

    public void handleCancelButtonClicked(ActionEvent event) throws Exception {

    	// Load the event page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/cancelPage.fxml"));
	    loader.setController(new CancelPageController());
	    Parent root;
		try {
			root = loader.load();
		
 		    Scene scene = new Scene(root);

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("Cancel Page");
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

