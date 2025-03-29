//Find radix of a number given in a string
package conditional;
import java.util.*;
public class challenge4 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String num;
    num=sc.nextLine();
    if(num.matches("[01]+")){
        System.out.println("Binary Radix");
    }
    else if(num.matches("[0-7]+")){
        System.out.println("Octal Radix");
    }
    else if (num.matches("[0-9]+")) {
       System.out.println("Decimal Radix"); 
    }
    else{
        System.out.println("Not a number");
    }
    sc.close();
    }
}
