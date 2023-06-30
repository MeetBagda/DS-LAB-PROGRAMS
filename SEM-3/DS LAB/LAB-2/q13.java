// Write a program to find whether the array contains a duplicate number or not.
import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Element -"+(i+1));
            arr[i] = sc.nextInt();
        }

        int num;

        int flag=0;

        Arrays.sort(arr);

         for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                flag=1;
                break;
            }

        }
       
        if(flag==0){
            System.out.println("Array does not contain duplicate number");
        }
        else{
            System.out.println("It contains duplicate number");

        }
    }
}
