//Write a method for finding number is orime or not 

public class challenge2 {
    static boolean isPrime(int n){
    for (int i=2;i<=n/2;i++){
        if(n%i==0)
        return false;
    }
    return true;
    }
    public static void main(String args[]){
      System.out.println(isPrime(23));
    }
    
}
