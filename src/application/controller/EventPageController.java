package application.controller;

import java.io.IOException;

import application.Dog;
import application.DogProfile;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class EventPageController {
	@FXML
	private Button homeButton;
	@FXML
    private Button myEventButton;
	@FXML
    private Button myProfileButton;
	@FXML
    private Button rsvpButton; 
	
	@FXML
    private void initialize() {	
	}
		
		
	public void handleRsvp(ActionEvent event) throws Exception {
		
		System.out.println("event -> handleRsvp -> myevent ");
		
		if(rsvpButton !=null) {
	        // update/create event successful alert
	        Alert alert = new Alert(AlertType.INFORMATION);
	        alert.setTitle("RSVP Successful");
	        alert.setHeaderText("Thank you for successfully RSVP Event! ");
	        alert.showAndWait();
		}

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
	public void handleMyEvent(ActionEvent event) throws Exception {
		
		System.out.println("event -> handleMyEvent -> myevent ");

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
	public void handleDogProfile(ActionEvent eventIn) throws Exception {
		
		System.out.println("event  -> handleDogProfile ");
				
        // If successful
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(" Dog's Profile");
        Dog dog = new Dog();
        DogProfile dogProfile = new DogProfile(5,"Julie","",3,"Huskey",1,"stein");
        dogProfile.sound();
        String ProfileStr = "\n"+"\n"+"\n"+
        		"    ProfileId:  "+dogProfile.getProfileId()+"\n"+"\n"+
        		"    Name:  "+dogProfile.getName()+"\n"+"\n"+
        		"    Age:  "+dogProfile.getAge()+"Years \n"+"\n"+
        		"    Breed:  "+dogProfile.getBreed()+"\n"+"\n"+
        		"    OwnerId:  "+dogProfile.getOwnerId()+"\n"+"\n"+
        		"    OwnerName:  "+dogProfile.getOwnerName()+"\n"+"\n"+"\n";
        alert.setHeaderText(ProfileStr);
        alert.showAndWait();
    }

}
