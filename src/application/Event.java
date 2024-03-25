package application;
import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
	private String title;
	private String location;
    private LocalDate date;
    private LocalTime time;
   
 

    // Constructor
    public Event(String title, String location, LocalDate date, LocalTime time) {
    	this.title = title;
    	this.location = location;
        this.date = date;
        this.time = time;
    }
    // Getter method for event title
    public String getTitle() {
        return title;
    }


    // Getter method for location
    public String getLocation() {
        return location;
    }

    // Getter method for date
    public LocalDate getDate() {   	
        return date;
    }
    
    // Getter method for time
    public LocalTime getTime() {
    	time = LocalTime.now();
        return time;
    }

    
    
    public static Event getEvent(String title, String location, LocalDate date, LocalTime time) {
        return new Event(title, location, date, time);
    }
   
    // Method to get an event
    //public static Event getEvent() {
        
       // return new Event(title, location, date, time );
    //}

}
