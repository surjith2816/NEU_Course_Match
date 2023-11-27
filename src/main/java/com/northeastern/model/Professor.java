package com.northeastern.model;

//Java Core 
import java.util.List;

public class Professor extends User {
    private String areaOfExpertise;
    private List<Integer> coursesIds; // List of course Id's
    private GradingLevel gradingLevel;

    public enum GradingLevel {
        EASY, MEDIUM, HARD
    }

    @Override
    public void create() { /* Implementation code here */ }
    @Override
    public void update() { /* Implementation code here */ }
    @Override
    public void delete() { /* Implementation code here */ }
    @Override
    public void search() { /* Implementation code here */ }
}
