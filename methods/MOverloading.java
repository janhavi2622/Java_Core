public class MOverloading {
static int max(int x,int y){
    return x>y?x:y;
  }    
 static float max(float x,float y){
    return x>y?x:y;
  }
  public static void main(String[] args) {
    System.out.println(max (1,2));
    System.out.println(max(2.4f,2.5f));
  }
}
