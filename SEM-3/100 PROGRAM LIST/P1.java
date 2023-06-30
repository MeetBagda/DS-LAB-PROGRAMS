// WAP to find a sum of even number into 1D array.

import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Element -"+(i+1));
            arr[i] = sc.nextInt();
        }

        int sum=0;
        
         for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }

        System.out.println(sum);


    }
}