import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collecting student information
        System.out.println("Enter Student Information:");
        System.out.print("Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Section: ");
        String section = sc.nextLine();

        System.out.println("\n--- STUDENT INFORMATION ---");
        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + firstName + " " + lastName);
        System.out.println("Course         : " + course);
        System.out.println("Section        : " + section);

        System.out.println("\nEnter Scores (out of 100):");
        System.out.print("Midterm Exam Score: ");
        int midterm = sc.nextInt();

        System.out.print("Final Exam Score  : ");
        int finalExam = sc.nextInt();

        System.out.print("Project Score     : ");
        int project = sc.nextInt();

        System.out.print("Attendance (%)    : ");
        int attendance = sc.nextInt();

        int totalScore = midterm + finalExam + project + attendance;
        double average = totalScore / 4.0;

        System.out.println("\n--- STUDENT SCORES ---");
        System.out.println("Midterm Exam Score : " + midterm);
        System.out.println("Final Exam Score   : " + finalExam);
        System.out.println("Project Score      : " + project);
        System.out.println("Attendance Score   : " + attendance);
        System.out.printf("\nAverage Score      : %.2f\n", average);

        String remarks = average >= 75 ? "PASSED" : "FAILED";
        System.out.println("Remarks            : " + remarks);

        sc.close();
    }
}