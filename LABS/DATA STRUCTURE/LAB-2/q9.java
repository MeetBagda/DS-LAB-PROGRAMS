//  Write a program to read and display n numbers using an array.

import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of element");
        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element - "+(i+1));
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
           
        }
    }
}