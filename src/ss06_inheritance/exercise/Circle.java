package ss06_inheritance.exercise;

public class Circle {
    private static double radius=5;
    private static String color="white";
    public Circle(){}
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public  static  double getRadius() {
        return radius;
    }

    public static  void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static  String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Circle.color = color;
    }
    public static double isArea(){
        return 3.14*Math.pow(radius,2);
    }
    public static double isPerimeter(){
        return 3.14*2*radius;
    }

    @Override
    public String toString() {
        return "hình tròn có bán kính là : "+getRadius()+" và màu là : "+getColor()+"diện tích của nó là : "+isArea()+"chu vi  của nó là : "+isPerimeter();
    }
}