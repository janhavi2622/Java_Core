//method to calculate area of different shapes
public class challenge3 {
    //circle
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    //rectangle
    static double area(double length,double breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.println(area(7));
        System.out.println(area(10,20));
    }
}
