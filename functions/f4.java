package functions;
import java.util.*;
public class f4 {
    public static void sum (int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;;
            }
        }
        System.out.println(sum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}
