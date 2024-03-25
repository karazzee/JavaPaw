package application.controller;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.time.LocalDate;
import java.time.LocalTime;

import application.Event;

public class HomePageController{
	
	 @FXML
	    private Label title1; // = new Label("Ballpit Fun in the Park");
	    
	    @FXML
	    private Label location1; // = new Label("Central Park");

	    @FXML
	    private Label date1; // = new Label("05/08/2024");

	    @FXML
	    private Label time1; // = new Label("11AM");
	    
	    /*
	    @FXML
	    private Label title2;
	    
	    @FXML
	    private Label location2;

	    @FXML
	    private Label date2;

	    @FXML
	    private Label time2;
	    */
    
    //Event event1 = Event.getEvent("Ballpit Fun in the Park", "Central Park", LocalDate.of(2024, 3, 15), LocalTime.of(10, 0));
    
    @FXML
    private void initialize() {
       
    	 // Create and populate event1
       Event event1 = Event.getEvent("Ballpit Fun in the Park", "Central Park", LocalDate.of(2024, 5, 15), LocalTime.of(10, 0));
       title1.setText(event1.getTitle());
       location1.setText(event1.getLocation());
       date1.setText(event1.getDate().toString());
       time1.setText(event1.getTime().toString());
       
       
       /*
    	title1.setText("Fun");
       location1.setText("Central Park");
       date1.setText("05/15/2024");
       time1.setText("11 AM");
       */
   }
    
}
