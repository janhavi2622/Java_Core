//Finding maximum element
package array;
public class challenge2 {
    public static void main(String[] args) {
        int A[]={2,5,1,4,6,7};
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max ){
                max=A[i];
            }
        }
        System.out.println(max);
    }
}
