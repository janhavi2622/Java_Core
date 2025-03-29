//Make a menu driven program for arithmetic operations

package conditional;
import java.util.*;
public class challenge9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");

        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("enter options in words");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch (option) {
            case "ADD":System.out.println("Sum is "+(x+y));
                        break;
            case "SUB":System.out.println("Sub is "+(x-y));
                        break;
            case "MUL":System.out.println("Mul is "+(x*y));
                        break; 
            case "DIV":System.out.println("Div is "+(x/y));
                        break;                       
            default: System.out.println("invalid option");
                        break;
        }
        sc.close();

    }
}
