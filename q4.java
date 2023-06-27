// factorial
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        int ans =1;
        for(int i=n;i>0;i++){
            ans = ans * i;
        }

        System.out.println(ans);
    }
}
