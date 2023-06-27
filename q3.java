// vowel or not
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        String c = sc.next();

        boolean b;

        b=(c=="A" || c=="a" || c=="E" || c=="e" || c=="I" || c=="i" || c=="O" || c=="o" || c=="U" || c=="u" )?true:false;

        if(b){
            System.out.println("VOWEL");
        }else{
            System.out.println("Not vowel");
        }
        
        
    }
}
