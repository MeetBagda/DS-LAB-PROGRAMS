import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mA = new int[2][2];
        int[][] mB = new int[2][2];
        
        int count=1;
        
        System.out.println("Enter the value for matrix - 1 : ");
        
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < mA.length; j++) {
                System.out.println("Element - "+count);
                mA[i][j] = sc.nextInt();
                count++;
            }
        }
        
        count=1;
        System.out.println("Enter the value for matrix - 2 : ");
        
        for (int i = 0; i < mB.length; i++) {
            for (int j = 0; j < mB.length; j++) {
                System.out.println("Element - "+count);
                mB[i][j] = sc.nextInt();
                count++;
            }
        }
        
        int[][] mC = new int[2][2];
        
        for (int i = 0; i < mC.length; i++) {
            for (int j = 0; j < mC.length; j++) {
                mC[i][j] = mA[i][j] + mB[i][j];
            }
        }
        
        count=1;
        System.out.println("New Matrix : ");
        for (int i = 0; i < mC.length; i++) {
            for (int j = 0; j < mC.length; j++) {
                System.out.println("Element "+count+":"+mC[i][j]);
                count++;
            }
        }
        
    }
}
