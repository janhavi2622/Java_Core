//overloaded method to reverse a int or array
public class challenge4 {
    static int reverse(int n){
        int rev=0;
        while (n>0) {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
          }
          return(rev);
    }
    static int[] reverse(int A[]){
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        System.out.println("Reversed number: " + reverse(123));

        // Test reverse array
        int[] arr = {1, 2, 3, 4};
        int[] reversedArr = reverse(arr);
        
        // Printing reversed array
        System.out.print("Reversed array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
}
    }}