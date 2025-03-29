public class binarySearch {
    public static void main(String[] args) {
        int num[]={1,3,5,7,9,13,15};
        int target=9;

        int result=binary(num,target);

        if (result != -1)
        System.out.println("Element is found at index: "+ result);
        else
        System.out.println("element not found");
    }

    public static int binary(int[] num, int target){
          int left=0;
          int right=num.length-1;
          
          while(left<=right){
            int mid=(left+right)/2;

            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]<target){
                left=mid+1;
            }
            else
            right=mid-1;
          }
            return -1;

    }
    
}
