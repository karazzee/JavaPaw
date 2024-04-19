package application;

public class DogProfile extends Dog implements Profile {
    private int profileId;
    private String name;
    private String imageURL;
    private int age;
    private String breed;
    private int ownerId;
    private String ownerName;

    
    public DogProfile() {
    	
    }
    
    public DogProfile(int profileId,String name, String imageURL, int age, String breed, int ownerId, String ownerName) {
        this.profileId = profileId;
        this.name = name;
        this.imageURL = imageURL;
        this.age = age;
        this.breed = breed;  
        this.ownerId = ownerId;
        this.ownerName = ownerName;
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
    
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }


}
