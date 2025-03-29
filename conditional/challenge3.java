//Find grades for given marks
package conditional;
import java.util.*;

public class challenge3 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      int m3=sc.nextInt();
      int total=m1+m2+m3;
      float avg=total/3;
      if(avg>=70){
        System.out.println("Grade:A");
      }else if (60>=avg&&avg<70) {
        System.out.println("Grade:B");
      }else if (50>=avg&&avg<60) {
        System.out.println("Grade:C");
      }else if (40>=avg&&avg<50) {
        System.out.println("Grade:D");
      }else{
        System.out.println("Grade:F");
      }
      sc.close();

    }
}
