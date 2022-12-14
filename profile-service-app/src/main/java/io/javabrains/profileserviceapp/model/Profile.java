package io.javabrains.profileserviceapp.model;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Profile {

    @Id
    private int profileId;
    private String fullName;
    private String emailId;
    private String mobileNumber;
    private String gender;
    private String password;

    public Profile(int profileId, String fullName, String emailId, String mobileNumber,
                   String gender, String password) {
        this.profileId = profileId;
        this.fullName = fullName;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.password = password;
    }

    public Profile() {
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
