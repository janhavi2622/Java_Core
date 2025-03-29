//Find a given year is a leap year
package conditional;
import java.util.*;
public class challenge5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
