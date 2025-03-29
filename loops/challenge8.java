//check number is palindrome or not
package loops;
import java.util.*;
public class challenge8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =n;
        int rev=0,r;
        while (n>0) {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==m){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number not palindrome");
        }
        sc.close();
    }
}
