package com.northeastern.model;

//Java Core 

public class Course {
    private int courseId;
    private String courseName;
    private long professorID;
    private String professorName;

    // Constructor
    public Course(int courseId, String courseName, long professorID, String professorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.professorID = professorID;
        this.professorName = professorName;
    }

    // Example methods
    public String getCourseDetails() {
        // Returns course details as a json.

        return "{" +
                "\"courseId\": " + courseId + "," +
                "\"courseName\": \"" + courseName + "\"," +
                "\"professorID\": " + professorID + "," +
                "\"professorName\": \"" + professorName + "\"" +
                "}";
    }

    // Getter and Setter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessorID(long professorID) {
        this.professorID = professorID;
    }

    public long getProfessorID() {
        return professorID;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorName() {
        return professorName;
    }

}
