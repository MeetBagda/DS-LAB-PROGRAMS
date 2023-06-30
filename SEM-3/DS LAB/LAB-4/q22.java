import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number - 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number - 2");
        int num2 = sc.nextInt();

        swap(num1,num2);

        sc.close();
    }

    public static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Number - 1 : "+n1+"\nNumber - 2 : "+n2);
    }
}
