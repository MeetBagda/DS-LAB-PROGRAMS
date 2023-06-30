// Prime or not?
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int n=sc.nextInt();

        boolean temp = true;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not prime");
                temp = false;
                break;
            }
        }

        if(temp){
            System.out.println("Prime");
        }
    }
}
