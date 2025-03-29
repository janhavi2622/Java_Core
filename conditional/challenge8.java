//display name of date based on number
package conditional;
import java.util.*;
public class challenge8 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a day number");
    int day=sc.nextInt();

    switch (day) {
        case 1: System.out.println("mon");
                break;
        case 2: System.out.println("tue");
                break;
        case 3:System.out.println("wed");
                break;
        case 4:System.out.println("thurs");
                break;  
        case 5:System.out.println("fri");
                break;
        case 6:System.out.println("sat");
                break;
        case 7:System.out.println("sun");
                break;                                      
        default:System.out.println("Invalid day");
            break;
    }
    sc.close();
    }
}
