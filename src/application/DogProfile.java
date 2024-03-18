package application;

public class DogProfile implements Profile {
    private String username;
    private String firstName;
    private String lastName;
    private String imageURL;
    private int age;
    private String breed;

    public DogProfile(String username, String firstName, String lastName, String imageURL, int age, String breed) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageURL = imageURL;
        this.age = age;
        this.breed = breed;       
    }    
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }

    @Override
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
