package loops;
import java.util.*;
public class challenge4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n>0) {
          int r=n%10;
          n=n/10;
          System.out.println(r);  
        }
        sc.close();

    }
}
