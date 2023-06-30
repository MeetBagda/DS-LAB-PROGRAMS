public class pattern {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){

            //inner loop -->  stars
            for(int j=0;j<i;j++){
                System.out.print("*");
            }

            // second loop --> spaces
            int space = 2*(n-i);

            for(int k=0;k<space;k++){
                System.out.print(" ");
            }

            //third loop -->  stars
            for(int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
