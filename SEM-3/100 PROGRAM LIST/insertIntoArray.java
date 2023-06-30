import java.util.Scanner;

public class insertIntoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            System.out.println("Element - " + (i + 1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Position :- ");
        int position = sc.nextInt();

        System.out.println("Enter Value :- ");
        int value = sc.nextInt();

        for(int i = position-1; i < n;i++){

            arr[i+1]=arr[i];
        }
        
        arr[position-1]=value;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element - " + (i + 1)+": "+arr[i]);
        }

    }
}
