import java.util.Scanner;

public class GradeComp {
    // declare grade 1 to 3 vars
    public static double getAverage(double gr1, double gr2, double gr3) {
        double ave = (gr1 + gr2 + gr3)/3;
        return ave;
    }

    // pass or fail check
    public static String getRemarks(double ave) {
        if (ave >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    // letter grade equivalent check
    public static char Equivalent(double ave) {
        if (ave >= 90) {
            return 'A';
        } else if (ave >= 83) {
            return 'B';
        } else if (ave >= 75) {
            return 'C';
        } else if (ave >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // printi avg, remarks, letter grade
    public static void displayResult (double temporaryAve) {
        double a = temporaryAve;
        String remarks = getRemarks(a);
        char Equivalent = Equivalent(a);
        System.out.printf("\nAverage is %.2f\n", a);
        System.out.println("Remarks is " + remarks);
        System.out.println("Letter grade is: " + Equivalent);
    }

    // gather
    public static void studentInfo(int studentNumber, String studentName, String course, int yearLevel) {
        System.out.println("\nName: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Year Level: " + yearLevel);

    }

    // main method, all input scanning and method calling
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = input.nextLine();
        System.out.print("Enter your course: ");
        String course = input.nextLine();
        System.out.print("Enter your student number: ");
        int studentNumber = input.nextInt();
        System.out.print("Enter your year level: ");
        int yearLevel = input.nextInt();

        System.out.print("\nGrade 1: ");
        double grade1 = input.nextDouble();
        System.out.print("Grade 2: ");
        double grade2 = input.nextDouble();
        System.out.print("Grade 3: ");
        double grade3 = input.nextDouble();
        double a = getAverage(grade1, grade2, grade3);
        studentInfo(studentNumber, studentName, course, yearLevel);
        displayResult(a);
        input.close();
    }
    
}