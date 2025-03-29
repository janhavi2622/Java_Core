//find a number is even or not
package conditional;
import java.util.*;
public class challenge1 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%2==0){
        System.out.println(a+" is even");
    }
    else{
        System.out.println(a+" is odd");
    }
    sc.close();
}
}
