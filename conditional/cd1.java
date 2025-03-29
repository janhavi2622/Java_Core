//find the greatest number of three given numbers
package conditional;
public class cd1 {
    public static void main(String args[]){
    int a=5,b=6,c=10;
    if(a>b&&a>c){
        System.out.println(a+" is greater number");
    }else{
        if(b>c){
            System.out.println(b+" is greater");
        }else{
            System.out.println(c+" is greater");
        }
    }

}
}
