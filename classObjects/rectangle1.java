package classesObjects;
class rectangle{
    public double length;
    public double breadth;

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
    public boolean isSquare(){
        if(length==breadth)
        return true;
        else
        return false;
    }
}

public class rectangle1 {
    public static void main(String[] args) {
    rectangle r1=new rectangle();
    r1.length=10;
    r1.breadth=10;
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    System.out.println(r1.isSquare());
    }
}
