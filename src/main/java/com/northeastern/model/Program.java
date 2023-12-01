package com.northeastern.model;

//Java Core 
import java.util.List;

public class Program {
    private String name;
    private int programID;
    private List<Integer> courseIds;

    // Constructor
    public Program(String name, int programID, List<Integer> courseIds) {
        this.name = name;
        this.programID = programID;
        this.courseIds = courseIds;
    }

    // Example methods
    public String getProgramDetails() {
        // Returns program details as a json.
        return "{" +
                "\"name\": \"" + name + "\"," +
                "\"programID\": " + programID + "," +
                "\"courseIds\": " + courseIds +
                "}";
    }

    // Add a course to the program
    public void addCourse(int courseId) {
        if (!courseIds.contains(courseId)) {
            courseIds.add(courseId);
        }
    }

    // Remove a course from the program
    public void removeCourse(int courseId) {
        courseIds.remove(Integer.valueOf(courseId));
    }

    // Getter and Setter
    public List<Integer> getCourseIds() {
        return courseIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public int getProgramID() {
        return programID;
    }
}
