import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value : ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

    }
}
