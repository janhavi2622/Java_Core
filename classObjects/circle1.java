package classesObjects;

class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double perimeter(){
        return circumference();
    }
}
public class circle1 {
    public static void main(String[] args) {
        circle c1=new circle();
        circle c2=new circle();

        c1.radius=7;
        c2.radius=14;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        System.out.println(c1.perimeter());

        System.out.println(c2.area());
        System.out.println(c2.circumference());
        System.out.println(c2.perimeter());
    }
}
