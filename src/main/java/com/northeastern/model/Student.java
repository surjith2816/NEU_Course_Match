package com.northeastern.model;

//Java Core 
import java.util.List;

public class Student extends User {
    private String program;
    private List<String> courses;
    private List<Double> grades;
    private String startSemester;
    private String jobIntern;
    private List<String> classForNextSem;
    private String finalProject;

    // Constructor
    public Student(String name, Integer role, String NUID, String NUEmail, String bio,
                   String linkedin, String phone, String program, List<String> courses,
                   List<Double> grades, String startSemester, String jobIntern,
                   List<String> classForNextSem, String finalProject) {
        super(name, role, NUID, NUEmail, bio, linkedin, phone);
        this.program = program;
        this.courses = courses;
        this.grades = grades;
        this.startSemester = startSemester;
        this.jobIntern = jobIntern;
        this.classForNextSem = classForNextSem;
        this.finalProject = finalProject;
    }

    // Register for a new course
    public void registerForCourse(String course) {
        courses.add(course);
    }

    // Drop a course
    public void dropCourse(String course) {
        int index = courses.indexOf(course);
        if (index != -1) {
            courses.remove(index);
            grades.remove(index);
        }
    }

    // Update grade for a course
    public void updateGrade(String course, Double grade) {
        int index = courses.indexOf(course);
        if (index != -1) {
            grades.set(index, grade);
        }
    }

    // Getter and Setter
    public List<String> getCourses() {
        return courses;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setStartSemester(String startSemester) {
        this.startSemester = startSemester;
    }

    public String getStartSemester() {
        return startSemester;
    }

    public void setJobIntern(String jobIntern) {
        this.jobIntern = jobIntern;
    }

    public String getJobIntern() {
        return jobIntern;
    }

    // Plan classes for the next semester
    public void planClassesForNextSem(List<String> classes) {
        this.classForNextSem = classes;
    }

    public List<String> getClassForNextSem() {
        return classForNextSem;
    }

    public void setFinalProject(String finalProject) {
        this.finalProject = finalProject;
    }

    public String getFinalProject() {
        return finalProject;
    }
}
