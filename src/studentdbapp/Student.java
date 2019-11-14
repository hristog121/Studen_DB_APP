package studentdbapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String lastYear;
    private int gradeYear;
    private String studentID;
    private String copurses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor: ask user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Softmore\n3 - Junior\n4 - Senior Enter Student Grade Level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);



    }
    // Generate ID
    private void  setStudentID(){
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }
    // Enroll in courses

    // View balance and pay tuition

    // Show status

}
