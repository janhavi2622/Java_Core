package functions;
import java.util.*;
public class f6 {
    public static double getCircumference(double r){
        return 2*3.14*r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(getCircumference(r));
        sc.close();
  }
}
