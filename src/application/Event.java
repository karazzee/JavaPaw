package application;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.lang.reflect.Field;
import java.time.LocalTime;

public class Event {
	public int eventId; 
	public String eventTitle; 
	public String eventDetail;
	public String eventLocation;
	public String eventPicUrl; 
	public LocalDate date;	
	public LocalTime timeStart;
	public LocalTime timeEnd;
	public String place;
	public int sponsorId;
	public String sponsorName;
	public int sponsorPetId;
	public String sponsorPetName;
	public int partNum;
	public String partIdList; //
	public String partNameList; //
	public String partStatusList; // Draft/Active/His/Cancel
	public int likeNum; 
	public int unLikeNum; 
	public int favoriteNum; 
	public Date createDate;
	public Date upateDate;
	public String status;
   
 

    // Constructor
    public Event(String title, String location, LocalDate date, LocalTime time, LocalTime timeEnd) {
    	this.eventTitle = title;
    	this.eventLocation = location;
        this.date = date;
        this.timeStart = time;
        this.timeEnd = timeEnd;
    }
    // Getter method for event title
    public String getTitle() {
        return this.eventTitle;
    }


    // Getter method for location
    public String getLocation() {
        return this.eventLocation;
    }

    // Getter method for date
    public LocalDate getDate() {   	
        return this.date;
    }
    
    // Getter method for time
    public LocalTime getTime() {
    	timeStart = LocalTime.now();
        return timeStart;
    }

    
    
    public static Event getEvent(String title, String location, LocalDate date, LocalTime timeStart,LocalTime timeEnd) {
        return new Event(title, location, date, timeStart, timeEnd);
    }
   
    private static int[] convertToIntArray(String input) {
        String[] intString = input.split(",");
        int[] intArray = new int[intString.length];
        for (int i = 0; i < intString.length; i++) {
        	intArray[i] = Integer.parseInt(intString[i]);
        }
        return intArray;
    }
    
    private static String[] convertToStrArray(String input) {
        String[] strArray = input.split(",");
        return strArray;
    }
    
    public static Map getPartList(int partNum,String partIdList,String partNameList) {
    	Map<Integer,String> hashMap = new HashMap<>();
    	int[] intArray = convertToIntArray(partIdList);
    	String[] strArray = convertToStrArray(partNameList);
    	for(int i=0;i<partNum;i++) {
    		hashMap.put(intArray[i], strArray[i]);
    	}
    	
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " 'name is  " + entry.getValue() );
        }
        return hashMap;
    } 
    public static String[] removePartList(Map<Integer,String> hashMap) {
    	String[] strArray = {};
        if (hashMap.containsKey(10)) {
            System.out.println( " ID is in the map.");
        }
        return strArray;
    } 

    
	public static void partEvent(Connection connection,Event event,Profile profile) {
        PreparedStatement selectStatement = null;
        PreparedStatement updateStatement = null;
        try {
        	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	
            String selectSql = " SELECT * FROM event WHERE eventid = ? ";
            selectStatement = connection.prepareStatement(selectSql);
            selectStatement.setString(1, String.valueOf(event.eventId));

            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
            	// part 
                System.out.println("SQLexe part");
                System.out.println("ID: " + resultSet.getInt("eventid"));
                System.out.println("partnum: " + resultSet.getInt("partnum"));
                System.out.println("partidlist: " + resultSet.getString("partidlist"));
                System.out.println("partnamelist: " + resultSet.getString("partnamelist"));
                int pertNum = resultSet.getInt("partnum");
                String partIdList = resultSet.getString("partidlist");
                String partNameList = resultSet.getString("partnamelist");
                

                String updateSql = "update  event  set  partnum = ?, partidlist = ?, partnamelist = ? "
            			+ "where eventId = ?";
                updateStatement = connection.prepareStatement(updateSql);
                updateStatement.setString(1, Integer.toString(1+event.partNum));
                updateStatement.setString(2, event.partIdList+",8");
                updateStatement.setString(3, event.partNameList+",QQ");
                updateStatement.setString(4, Integer.toString(event.eventId));

                
                updateStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
	}
	
	public static void cancelPartEvent(Connection connection,Event event) {
        PreparedStatement selectStatement = null;
        PreparedStatement updateStatement = null;
        try {
        	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	
            String selectSql = " SELECT * FROM event WHERE eventid = ? ";
            selectStatement = connection.prepareStatement(selectSql);
            selectStatement.setString(1, String.valueOf(event.eventId));

            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
            	// part 
                System.out.println("SQLexe part");
                System.out.println("ID: " + resultSet.getInt("eventid"));
                System.out.println("partnum: " + resultSet.getInt("partnum"));
                System.out.println("partidlist: " + resultSet.getString("partidlist"));
                System.out.println("partnamelist: " + resultSet.getString("partnamelist"));

                String updateSql = "update  event  set  partnum = ?, partidlist = ?, partnamelist = ? "
            			+ "where eventId = ?";
                updateStatement = connection.prepareStatement(updateSql);
                updateStatement.setString(1, Integer.toString(event.partNum-1));
                updateStatement.setString(2, event.partIdList+",8");
                updateStatement.setString(3, event.partNameList+",QQ");
                updateStatement.setString(4, Integer.toString(event.eventId));

                
                updateStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
	}
    
    //update and insert 
	public static void updateEvent(Connection connection,Event event) {
        PreparedStatement selectStatement = null;
        PreparedStatement insertStatement = null;
        PreparedStatement updateStatement = null;
        try {
        	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	
            String selectSql = " SELECT * FROM event WHERE eventid = ? ";
            selectStatement = connection.prepareStatement(selectSql);
            selectStatement.setString(1, String.valueOf(event.eventId));

            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
            	// update 
                System.out.println("SQLexe UPDATE");

                String updateSql = "update  event  set  "
                		+" eventtitle = ?, eventdetail = ?, eventpicurl = ?, date = ?, timestart = ?, "
            			+ "timeend = ?, place = ?, sponsorid = ?, sponsorname = ?,sponsorpetid = ?, "
            			+ "sponsorpetname = ?, partnum = ?, partidlist = ?, partnamelist = ?, partstatuslist = ?, "
            			+ "likenum = ?, unlikenum = ?, favoritenum = ?, createdate = ?,upatedate = ?, status = ?"
            			+ "where eventId = ?";
                updateStatement = connection.prepareStatement(updateSql);
                updateStatement.setString(1, event.eventTitle);
                updateStatement.setString(2, event.eventDetail);
                updateStatement.setString(3, "");
                updateStatement.setString(4, "2024-03-10 12:36:00");
                updateStatement.setString(5, String.valueOf(event.timeStart));
                updateStatement.setString(6, String.valueOf(event.timeEnd));
                updateStatement.setString(7, event.place);
                updateStatement.setString(8, Integer.toString(event.sponsorId) );
                updateStatement.setString(9, event.sponsorName);
                updateStatement.setString(10, Integer.toString(event.sponsorPetId) );
                updateStatement.setString(11, event.sponsorPetName);
                updateStatement.setString(12, Integer.toString(event.sponsorPetId));
                updateStatement.setString(13, event.partIdList);
                updateStatement.setString(14, event.partNameList);
                updateStatement.setString(15, event.partStatusList);
                updateStatement.setString(16, Integer.toString(event.likeNum));
                updateStatement.setString(17, Integer.toString(event.favoriteNum));
                updateStatement.setString(18, Integer.toString(event.unLikeNum));
                updateStatement.setString(19, dateFormat.format(event.createDate));
                updateStatement.setString(20, dateFormat.format(event.upateDate));
                updateStatement.setString(21, event.status);
                updateStatement.setString(22, Integer.toString(event.eventId));

                
                updateStatement.executeUpdate();
            } else {
            	//insert 
                System.out.println("SQLexe INSERT");

            	String table_cols= "eventtitle, eventdetail, eventpicurl, date, timestart, timeend, place, sponsorid, sponsorname,sponsorpetid, "
            			+ "sponsorpetname, partnum, partidlist, partnamelist, partstatuslist, likenum, unlikenum, favoritenum, createdate,upatedate, status";
                String insertSql = "INSERT INTO event ("+table_cols+") VALUES (?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?)";
                insertStatement = connection.prepareStatement(insertSql);
                insertStatement.setString(1, event.eventTitle);
                insertStatement.setString(2, event.eventDetail);
                insertStatement.setString(3, "");
                insertStatement.setString(4, "2024-03-10 12:36:00");
                insertStatement.setString(5, String.valueOf(event.timeStart));
                insertStatement.setString(6, String.valueOf(event.timeEnd));
                insertStatement.setString(7, event.place);
                insertStatement.setString(8, Integer.toString(event.sponsorId) );
                insertStatement.setString(9, event.sponsorName);
                insertStatement.setString(10, Integer.toString(event.sponsorPetId) );
                insertStatement.setString(11, event.sponsorPetName);
                insertStatement.setString(12, Integer.toString(event.sponsorPetId));
                insertStatement.setString(13, event.partIdList);
                insertStatement.setString(14, event.partNameList);
                insertStatement.setString(15, event.partStatusList);
                insertStatement.setString(16, Integer.toString(event.likeNum));
                insertStatement.setString(17, Integer.toString(event.favoriteNum));
                insertStatement.setString(18, Integer.toString(event.unLikeNum));
                insertStatement.setString(19, dateFormat.format(event.createDate));
                insertStatement.setString(20, dateFormat.format(event.upateDate));
                insertStatement.setString(21, event.status);
                insertStatement.setString(22, Integer.toString(event.eventId));
        		
                insertStatement.executeUpdate();
            }
            System.out.println("SQL exe OK");
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
