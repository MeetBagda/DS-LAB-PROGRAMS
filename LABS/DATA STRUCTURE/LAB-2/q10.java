//  Write a program to calculate sum of numbers from m to n.
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting value : ");
        int a = sc.nextInt();

        System.out.println("Enter ending value : ");
        int b = sc.nextInt();

        int sum = a;

        for(int i=a;i<=b;i++){
            sum = sum + b;
        }

        System.out.println(sum);
    }
}
