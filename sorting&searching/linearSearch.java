public class linearSearch{
 public static void main(String[] args) {
    int num[]={1,3,5,7,9,13};
    int target =9;

    int result= linear(num,target);
    if(result != -1)
    System.out.println("Element is found at Index: "+ result);
    else
    System.out.println("Element is not found");


 }
  public static int linear (int[] num,int target){

   for(int i=0;i<num.length;i++){
      if(num[i]==target)
      return i; 
   }
   return -1;
  }

}
 
