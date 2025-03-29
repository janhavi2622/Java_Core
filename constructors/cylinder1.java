package constructors;
class cylinder{
private double radius;
private double height;

public double getRadius(){
    return radius;
}
public double getHeight(){
    return height;
}

public void setRadius(double r){
    radius=r;
}
public void setHeight(double h){
    height=h;
}

public cylinder(){
    radius=1;
    height=1;
}
}

public class cylinder1 {
    public static void main(String[] args) {
        cylinder c1=new cylinder();
        System.out.println(c1);
    }
}
