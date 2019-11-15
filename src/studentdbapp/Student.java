package studentdbapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String lastYear;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
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
    public void enroll(){
        // Get inside loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }while (1 != 0);

        System.out.println("Enrolled in: " + courses);
    }

    // View balance and pay tuition
    public void viewBalance(){
        System.out.println("Your balance is: " + tuitionBalance + " €");
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Please enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment +" €");
        viewBalance();
    }

    // Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nSudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + tuitionBalance + " €";
    }
}
