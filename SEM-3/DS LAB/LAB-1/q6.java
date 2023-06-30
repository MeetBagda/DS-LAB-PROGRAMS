// power 
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base : ");
        int base = sc.nextInt();

        System.out.println("Enter Power : ");
        int pow = sc.nextInt();

        int ans =1 ;
        for(int i=0;i<pow;i++){
            ans = ans * base;
        }

        System.out.println(ans);
    }
}
