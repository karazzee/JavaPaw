package application;

public interface Profile {
    String getUsername();
    void setUsername(String username);

    String getFirstName();
    void setFirstName(String firstName);
    
    String getLastName();
    void setLastName(String lastName);

    String getImageURL();
    void setImageURL(String imageURL);

}