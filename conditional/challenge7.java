//Find type of website and protocol used
package conditional;
import java.util.*;
public class challenge7 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a URL");
    String url=sc.nextLine();
    String protocol=url.substring(0,url.indexOf(";"));

    if(protocol.equals("http")){
        System.out.println("hypertext transfer protocol");
    }
    else if (protocol.equals("ftp")) {
        System.out.println("file transfer protocol");        
    }

    String ext=url.substring(url.lastIndexOf("."));
    if(ext.equals("com")){
        System.out.println("commerial");
    }else if(ext.equals("org")){
        System.out.println("organisation");
    }else if(ext.equals("net")){
        System.out.println("Network");
    }
    sc.close();
    }
    
}
