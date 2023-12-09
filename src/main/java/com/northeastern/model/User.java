package com.northeastern.model;
//Java Core 
public class User {
    protected String name;
    protected Integer role;
    protected String NUID;
    protected String NUEmail; // optional
    protected String bio; // optional
    protected String linkedin; // optional
    protected String phone; // optional

    // Constructor
    public User(String name, Integer role, String NUID, String NUEmail, String bio,
                String linkedin, String phone) {
        this.name = name;
        this.role = role;
        this.NUID = NUID;
        this.NUEmail = NUEmail;
        this.bio = bio;
        this.linkedin = linkedin;
        this.phone = phone;
    }

    public void login() {
        // Logs in the user.

    }

    public void updateProfile(String name, String NUID, String bio, String linkedin, String phone) {
        // Updates the user's profile.
        this.name = name;
        this.NUID = NUID;
        this.bio = bio;
        this.linkedin = linkedin;
        this.phone = phone;
    }

    public String getProfile() {
        // Returns a json representation of the user's profile.
        return "{" +
                "\"name\": \"" + name + "\"," +
                "\"role\": " + role + "," +
                "\"NUID\": \"" + NUID + "\"," +
                "\"NUEmail\": \"" + NUEmail + "\"," +
                "\"bio\": \"" + bio + "\"," +
                "\"linkedin\": \"" + linkedin + "\"," +
                "\"phone\": \"" + phone + "\"" +
                "}";
    }

    // Getter and Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getRole() {
        return role;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUEmail(String NUEmail) {
        this.NUEmail = NUEmail;
    }

    public String getNUEmail() {
        return NUEmail;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public void setLinkedIn(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getLinkedIn() {
        return linkedin;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    // Getter and Setter End

}
