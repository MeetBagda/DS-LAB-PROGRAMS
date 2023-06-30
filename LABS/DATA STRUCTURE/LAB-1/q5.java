// factorial (recursion)
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();

        int b = factorial(n);

        System.out.println("Factorial of "+n+":"+n);
    }

    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        else{
            return factorial(n) * factorial(n-1);
        }
    }
}
