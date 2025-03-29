//Find if the email-id is on gmail 
//find the username and domain name from email
package string;
import java.util.Scanner;
public class challenge1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        System.out.println(email);
        int i=email.indexOf("@");
        String Uname=email.substring(0, i);
        String DomainName=email.substring(i+1);
        System.out.println("Username: "+Uname);
        System.out.println("DomainName: "+DomainName);
        sc.close();


    }
}
