package classesObjects;

class Rectangle {
    private double length;
    private double breadth;

    // Getter and Setter for Length
    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    // Getter and Setter for Breadth
    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b) {  // Fixed return type to void
        breadth = b;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + breadth);
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    // Method to check if it's a square
    public boolean isSquare() {
        return length == breadth;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10.7);
        r1.setBreadth(10.8);
        
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}
