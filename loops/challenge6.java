//finding a armstrong or not
package loops;
import java.util.*;
public class challenge6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
        int r=n%10;
        sum=sum+r*r*r;
        System.out.println(sum);
    }
    
    if(sum==n){
        System.out.println("NUmber is armstrong");
    }else{
        System.out.println("not Armstrong number");
    }
    sc.close();
}
}
