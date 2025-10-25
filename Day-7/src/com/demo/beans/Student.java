package com.demo.beans;

import java.io.Serializable;

import com.demo.exception.LowAttendanceException;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;
    private String grade;

 
    public Student() {
    	
    }

  
    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    // Method to calculate grade
    public void calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance below 60% for " + sname);
        }

        if (score >= 90) grade = "A";
        else if (score >= 75) grade = "B";
        else if (score >= 60) grade = "C";
        else grade = "D";
    }

    public double getAttendance() { 
    	return attendance_percentage; 
    	}

    @Override
    public String toString() {
        return String.format("RollNo: %d, Name: %s, Course: %s, Attendance: %.1f%%, Score: %.1f, Grade: %s",
                rollno, sname, course, attendance_percentage, score, grade);
    }
}
