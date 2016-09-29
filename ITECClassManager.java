/*
    Lab 6 Problem 3 - Class Manager
    Jeremy Wolfe 09/29/2016

    Copied from Lab 6 Problem 2.

    Store ITECCourse objects in arraylist. Add method to ITECcourse class that returns the number
    of available class seats. Display all courses seat availability.

*/
package com.wolfe;

import java.util.ArrayList;

public class ITECClassManager {

    static ArrayList<ITECCourse> courseArray = new ArrayList<ITECCourse>();

    static ITECCourse maintenanceCourse;
    static ITECCourse dataComCourse;
    static ITECCourse smallCourse;
    static ITECCourse newCourse;

    public static void main(String args[]) {

        populateCourses();

        // call class method to get the number of seats available per course
        for (ITECCourse item : courseArray) {
            System.out.println(item.getName());
            System.out.println("Seats available: " + item.getFreeSeats());
        }

    } // end main method

    private static void populateCourses() {

        // create new object with basic information.
        // ITECCourse maintenanceCourse = new ITECCourse("Micorcomputer Systems Maintenance", 1310, 20);
        maintenanceCourse = new ITECCourse("Micorcomputer Systems Maintenance", 1310, 20);
        // add students to class object
        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Bill");
        maintenanceCourse.addStudents("Carl");
        // display the info
        maintenanceCourse.writeCourseInfo();
        // remove Carl from the object
        maintenanceCourse.removeStudent("Carl");
        courseArray.add(maintenanceCourse);

        // **************************************************************************
        dataComCourse = new ITECCourse("Data Communications", 1425, 30);
        dataComCourse.addStudents("Dave");
        dataComCourse.addStudents("Ed");
        dataComCourse.addStudents("Flora");
        dataComCourse.writeCourseInfo();
        courseArray.add(dataComCourse);

        // **************************************************************************
        smallCourse = new ITECCourse("Small Class", 1234, 3);
        smallCourse.addStudents("Jake");
        smallCourse.addStudents("Kirby");
        smallCourse.addStudents("Liam");
        smallCourse.writeCourseInfo();
        smallCourse.addStudents("Marigold");
        courseArray.add(smallCourse);

        // **************************************************************************
        // note that this object is created with an additional room number argument
        // that the other objects don't contain
        newCourse = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        newCourse.addStudents("Max");
        newCourse.addStudents("Nancy");
        newCourse.addStudents("Orsen");
        newCourse.writeCourseInfo();
        courseArray.add(newCourse);

    }


} // end class
