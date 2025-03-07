//Copying an array
package array;
public class challenge7 {
    public static void main (String Args[]){
    int A[]={8,6,10,9,2,15,7,13,14,11};
    int B[]= new int[10];
    for(int i=0;i<A.length;i++){
        B[i]=A[i];
    }
    for(int j=0;j<=B.length;j++){
        System.out.print(B[j]);
    }
}
}
