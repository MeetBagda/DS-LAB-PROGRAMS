public class pattern2 {
    public static void main(String[] args) {
        int n=5;
         // i--> row = n
        for(int i=1;i<=n;i++){

            //j -->  col = 2*n
            for(int j=1;j<=2*n;j++){
                if(i==j || j==1 || j==2*n || j==(2*n-i)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Lower part
         // i--> row = n
        for(int i=n;i>=1;i--){

            //j -->  col = 2*n
            for(int j=1;j<=2*n;j++){
                if(i==j || j==1 || j==2*n || j==(2*n-i)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
