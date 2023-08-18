package ss07_abstract_interface.Colorable;

public class Circle extends Shape {
    private double radius=5;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color,boolean filled,double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public Circle() {
    }
    public double isPerimeter(){
        return radius*2*3.14;
    }
    public double isArea(){
        return Math.pow(radius,2)*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +"isPerimeter = "+isPerimeter()+" isArea = "+isArea()+super.toString()+
                '}';
    }
}
