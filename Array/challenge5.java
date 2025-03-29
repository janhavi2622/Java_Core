//Inserting an element
package array;
public class challenge5 {
  public static void main(String[] args) {
    int x=15;
    int index =2;
    int A[]=new int[10];
    A[0]=5;
    A[1]=9;
    A[2]=6;
    A[3]=10;
    A[4]=12;
    A[5]=7;
    int n =6;

    for(int i=n;i>index;i--){
       A[i]=A[i-1];
    }
    A[index]=x;
    n++;
    
    for(int i=0;i<n;i++){
        System.out.println(A[i]);
    }
  }  
}
