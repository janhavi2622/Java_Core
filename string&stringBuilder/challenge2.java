//Find if a number is binary or not
//Find a number is hexadecimal or not
//find is the date in date format(dd/mm/yyyy)

package string;

public class challenge2 {
    public static void main(String args[]){
        int b=101001010;
        String Str = String.valueOf(b);
        System.out.println(Str.matches("[01]*"));
         
        String Str1="B324AE";
        System.out.println(Str1.matches("[0-9A-F]+"));

        String d="01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
