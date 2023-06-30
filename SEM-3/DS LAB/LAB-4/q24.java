import java.util.Scanner;

class Student_Detail {
    int enrollmentNo;
    String name;
    int semester;
    double cpi;

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Enrollment No: ");
        enrollmentNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Semester: ");
        semester = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter CPI: ");
        cpi = sc.nextDouble();
    }

    public void getDetails() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
    }
}

public class q24 {
    public static void main(String[] args) {
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student_Detail();
            students[i].setDetails();
        }

        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].getDetails();
            System.out.println();
        }
    }
}
