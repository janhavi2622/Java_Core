//find sum of n natural numbers
package loops;
import java.util.*;
public class challenge2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
           sum= sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
