//Display GP series
package loops;
import java.util.*;
public class challenge11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();

        int term=a;

        for(int i=a;i<n;i++){
            System.out.print(term+ ",");
            term=term*r; 
        }
        sc.close();
    }
}
