package com.northeastern.model;

//Java Core 
import java.util.List;

public class Student extends User {
    private String program;
    private List<String> courses; // Optional
    private List<Double> grades; // Optional
    private String startSemester; // Optional, (choose field?)
    private String jobIntern; // Optional
    private List<String> classForNextSem; // Optional
    private String finalProject; // Optional

    public void courseShortListing() { /* Implementation code here */ }

    @Override
    public void create() { /* Implementation code here */ }
    @Override
    public void update() { /* Implementation code here */ }
    @Override
    public void delete() { /* Implementation code here */ }
    @Override
    public void search() { /* Implementation code here */ }
}
