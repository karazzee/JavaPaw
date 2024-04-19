package application.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import application.Event;
import application.Main;
import application.UserProfile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class RsvpPageController {
		
	@FXML
	private Button homeButton;
	@FXML
	private Button myEventButton;
	@FXML
	private TextField usernameField;
	@FXML
	private TextField locationField;
	@FXML
	private TextField eventDateField;
	@FXML
	private TextField eventTimeField;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
    @FXML
    private void initialize() {
    	//System.out.println("usernameField:111 " + usernameField.textProperty().toString());

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
	public void handleRsvp(ActionEvent eventIn) throws Exception {
		
		System.out.println("myevent  -> myevent ");
				
        Connection connection = null;
        List<Event> eventList = new ArrayList<>(); 
        Event eventFilter = new Event();
        Event event = new Event();
        eventList = event.getEventList(connection,eventFilter);
        System.out.println(" myevent  -> getEventList "+eventList);
        
    	// Load the event page
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
    
	public void handleLaunchEvent(ActionEvent event) throws Exception {
    	// Load the event page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/launchPage.fxml"));
	    loader.setController(new RsvpPageController());
	    Parent root;
		try {
			root = loader.load();
		
 		    Scene scene = new Scene(root);

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("Launch Page");
 		    stage.show();
 		    
 	        // Close the current window
 	        Stage currentStage = (Stage) homeButton.getScene().getWindow();
 	        currentStage.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
	public void handleSaveLaunchEvent(ActionEvent acEvent) throws Exception, ParseException, ClassNotFoundException, SQLException {
		
        Connection connection = null;
		
		// usernameField locationField eventDateField eventTimeField
		System.out.println("FXML Field:111 ");
		//initial before update/create event
		if(usernameField != null && locationField!= null && eventDateField != null && eventTimeField!= null ) {
			System.out.println("usernameField:  " + usernameField.getText());
		}

		

		//update/create event
		System.out.println("RsvpPageController:  updateEvent");

		Event event = new Event(usernameField.getText(),locationField.getText(),dateFormat.parse("2024-06-15 00:00:00"),Time.valueOf("11:30:00"),Time.valueOf("15:30:00"));
		event.eventId = 6;
		event.eventDetail = "Join other dog lovers for a guided hike through beautiful Redwood forests.";
		UserProfile profile = new UserProfile();
		profile.name = "Kara";
		event.updateEvent(connection, event, profile);
		
		
        // update/create event successful alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Save Successful");
        alert.setHeaderText("Thank you for successfully launched Event! ");
        alert.showAndWait();
        
    	// Load the event page
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
		}finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    }
	public void handleCancelLaunch(ActionEvent event) throws Exception {
    	// Load the event page
	    FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/cancelLaunchPage.fxml"));
	    loader.setController(new RsvpPageController());
	    Parent root;
		try {
			root = loader.load();
		
 		    Scene scene = new Scene(root);

 		    // Set the stage with the home scene
 		    Stage stage = new Stage();
 		    stage.setScene(scene);
 		    stage.setTitle("Cancel Launch Page");
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

	    // Load the myEvent page
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

