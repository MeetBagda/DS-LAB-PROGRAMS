import java.util.Scanner;

class Employee_Detail {
    int employeeID;
    String name;
    String designation;
    double salary;

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employeeID = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void getDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class q23 {
    public static void main(String[] args) {
        Employee_Detail employee = new Employee_Detail();
        employee.setDetails();
        System.out.println();
        System.out.println("Employee Details:");
        employee.getDetails();
    }
}
