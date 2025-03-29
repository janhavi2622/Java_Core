package string;

public class sMethods {
    public static void main(String args[]){
    String str="Netbeans";
    System.out.println(str.length());
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.trim());
    System.out.println(str.substring(1,2 ));
    System.out.println(str.substring(3));
    System.out.println(str.replace("a", "m"));
    System.out.println(str.startsWith("N"));
    System.out.println(str.endsWith("s"));
    System.out.println(str.endsWith("d"));
    System.out.println(str.charAt(4));
    System.out.println(str.indexOf("b"));
    System.out.println(str.lastIndexOf("beans"));
    System.out.println(str.equals("netbeans"));
    System.out.println(str.compareTo("Netbeans"));
    

    }
}
