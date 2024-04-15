package application;

public class DogProfile implements Profile {
    private int profileId;
    private String name;
    private String imageURL;
    private int age;
    private String breed;
    private int ownerId;
    private String ownerName;


    public DogProfile(int profileId,String ownerName, String imageURL, int age, String breed, int ownerId, String ownerName1) {
        this.profileId = profileId;
        this.name = name;
        this.imageURL = imageURL;
        this.age = age;
        this.breed = breed;  
        this.ownerId = ownerId;
        this.ownerName = ownerName1;
    }    
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
    	this.name = name; 
    }
    @Override
    public int getProfileId() {
    	return profileId;
    }
    @Override
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getImageURL() {
        return imageURL;
    }

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
