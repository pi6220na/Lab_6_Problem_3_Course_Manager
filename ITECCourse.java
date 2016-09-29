package com.wolfe;

import java.util.ArrayList;

/**
 * Created by pi6220na on 9/27/2016.
 */
public class ITECCourse {
    //Data that an ITECCourse obj needs to store
    private String name;                // course name
    private int code;                   // course code
    private ArrayList<String> students; // list of student names
    private int maxStudents;            // maximum number of students in course
    private String roomNumber;          // room number

    // constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    // overloaded constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String roomNumber) {
        this(courseName, courseCode, courseMaxStudents);
        this.roomNumber = roomNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    // add student to course if enough room
    public void addStudents(String studentName) {

        if (students.size() == maxStudents) {
            System.out.println("Course is full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    // display course information
    public void writeCourseInfo() {
        System.out.println();
        System.out.println("Course name: " + name);
        System.out.println("Course code: " + code);
        if (roomNumber != null) {
            System.out.println("Course room number: " + roomNumber);
        }
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are "  + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
        System.out.println();
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

    // remove student from course
    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);

        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    // calculate and return the number of available seats
    public int getFreeSeats() {

        int count = 0;
        for (String item : students){
            count++;
        }
        return maxStudents - count;
    }

} // end class
