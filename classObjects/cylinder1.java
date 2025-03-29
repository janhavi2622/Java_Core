package classesObjects;
class cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return 2*Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class cylinder1 {
    public static void main(String[] args) {
    cylinder c1=new cylinder();
    cylinder c2=new cylinder();

    c1.radius=7;
    c1.height=7;
    c2.radius=27;
    c2.height=27;

    System.out.println(c1.lidArea());
    System.out.println(c1.totalSurfaceArea());
    System.out.println(c1.volume());
    
    System.out.println(c2.lidArea());
    System.out.println(c2.totalSurfaceArea());
    System.out.println(c2.volume());
    }
    
    
}
