// Write a program to find position of the smallest number from given n numbers.

import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements : ");
        int n= sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Element -"+(i+1));
            arr[i] = sc.nextInt();
        }

        int low=arr[0];
        int pos=1;

        for(int i=0;i<n-1;i++){
            if(low>arr[i+1]){
                low=arr[i+1];
                pos = i+1+1;
            }
        }

        System.out.println(low+" at position "+pos);
    }
}
