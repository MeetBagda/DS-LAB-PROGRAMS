//Read n numbers in an array then read two different numbers, replace 1st
// number with 2nd number in an array and print its index and final array.

import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of element : ");
        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Element - "+(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter num - 1");
        int num1=sc.nextInt();
        System.out.println("Enter num - 2");
        int num2=sc.nextInt();

        for(int i=0;i<n;i++){
            if(num1==arr[i]){
                arr[i] = num2;
                System.out.println("Positon - "+(i+1));
                break;
            }
        }

         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }

    }
}
