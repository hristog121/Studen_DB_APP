package studentdbapp;

import java.util.Scanner;

public class StudentDbApp {
    public static void main(String[] args) {

        //Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student [] students = new Student[numberOfStudents];


        // Create n number of new students
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
            System.out.println(students[i].toString());
        }
    }
}
