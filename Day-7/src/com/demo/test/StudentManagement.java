package com.demo.test;

import com.demo.beans.Student;
import com.demo.exception.LowAttendanceException;

import java.io.*;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Create 10 students
        students.add(new Student(1, "Anushka", "CS", 85, 92));
        students.add(new Student(2, "Rohan", "IT", 78, 81));
        students.add(new Student(3, "Meena", "AI", 58, 75)); 
        students.add(new Student(4, "sita", "CS", 90, 88));
        students.add(new Student(5, "Priya", "IT", 95, 91));
        students.add(new Student(6, "Aryan", "CS", 72, 68));
        students.add(new Student(7, "Kiran", "AI", 65, 79));
        students.add(new Student(8, "Mahesh", "DS", 82, 85));
        students.add(new Student(9, "Gita", "CS", 59, 93));  
        students.add(new Student(10, "Nita", "IT", 88, 77));

        // Calculate grades (handle exceptions)
        for (Student s : students) {
            try {
                s.calculateGrade();
            } catch (LowAttendanceException e) {
                System.out.println( e.getMessage());
            }
        }

        // Serialize students to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            oos.writeObject(students);
            System.out.println("\n Students added successfully to 'students.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }

     
        List<Student> deserializedList = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.txt"))) {
            deserializedList = (List<Student>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Sort by attendance (descending)
        deserializedList.sort((a, b) -> Double.compare(b.getAttendance(), a.getAttendance()));

        // Display sorted list
        System.out.println("\n Students sorted by attendance (descending):");
        for (Student s : deserializedList) {
            System.out.println(s);
        }
    }
}
