//  Write a program to calculate average of first n numbers
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n= sc.nextInt();

        int avg;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum + i;

            
        }
        avg = sum/n;

        System.out.println(avg);
    }
}
