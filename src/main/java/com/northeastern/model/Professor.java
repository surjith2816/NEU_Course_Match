package com.northeastern.model;

//Java Core 
import java.util.List;

public class Professor extends User {
    private String areaOfExpertise;
    private List<Integer> coursesIds;
    private GradingLevel gradingLevel;

    public enum GradingLevel {
        EASY, MEDIUM, HARD
    }

    // Constructor
    public Professor(String name, Integer role, String NUID, String NUEmail, String bio,
                     String linkedin, String phone, String areaOfExpertise,
                     List<Integer> coursesIds, GradingLevel gradingLevel) {
        super(name, role, NUID, NUEmail, bio, linkedin, phone);
        this.areaOfExpertise = areaOfExpertise;
        this.coursesIds = coursesIds;
        this.gradingLevel = gradingLevel;
    }

    // Add a new course to the list of courses taught by the professor
    public void addCourse(int courseId) {
        coursesIds.add(courseId);
    }

    // Remove a course from the list of courses taught by the professor
    public void removeCourse(int courseId) {
        coursesIds.remove(Integer.valueOf(courseId));
    }

    // Get the list of courses taught by the professor
    public List<Integer> getCoursesTaught() {
        return coursesIds;
    }

    // Set the grading level of the professor
    public void setGradingLevel(GradingLevel level) {
        this.gradingLevel = level;
    }

    // Get the grading level of the professor
    public GradingLevel getGradingLevel() {
        return gradingLevel;
    }

    // Update the area of expertise
    public void updateAreaOfExpertise(String newAreaOfExpertise) {
        this.areaOfExpertise = newAreaOfExpertise;
    }

    // Get the area of expertise
    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    // Get a summary of the professor's profile
    public String getProfileSummary() {
        return "{" +
                "\"name\": \"" + name + "\"," +
                "\"areaOfExpertise\": \"" + areaOfExpertise + "\"," +
                "\"gradingLevel\": \"" + gradingLevel + "\"," +
                "\"coursesTaught\": " + coursesIds.toString() +
                "}";
    }
}

