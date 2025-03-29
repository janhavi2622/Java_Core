//find person is young or not young
package conditional;
import java.util.*;
public class challenge2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        if(age<=18){
            System.out.println("Person is young");
        }
        else{
            System.out.println("person is not young");
        }
        sc.close();
    }
}
