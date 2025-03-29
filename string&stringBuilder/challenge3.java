//Remove special characters and extra spaces from string
//Find the number of words in a strings

package string;

public class challenge3 {
    public static void main(String args[]){
    String str="a!b@c#1$s2%t";
    System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
