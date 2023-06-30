import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count=1;
        
        int[][] matrix1 = new int[3][2];
        System.out.println("Enter elements of matrix - 1 : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                 System.out.println("Element - "+count);
                matrix1[i][j] = sc.nextInt();
                count++;
            }
        }

        count=1;
        int[][] matrix2 = new int[2][3];
        System.out.println("Enter elements of matrix - 2 : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                 System.out.println("Element - "+count);
                matrix2[i][j] = sc.nextInt();
                count++;
            }
        }
        
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if(row1!=col2){
            throw new IllegalArgumentException("Matrix multiplication not possible ! \nPlease enter correct dimensinos!");
        }

        int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        count=1;
        System.out.println();
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Element - "+count+":"+result[i][j]);
                count++;
            }
        }
    }
}
