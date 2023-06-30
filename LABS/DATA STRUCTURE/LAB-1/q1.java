// Area of circle

import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius : ");
        int r = sc.nextInt();

        double ans = Math.PI*r*r;

        System.out.println(ans);
    }
}