package ss06_inheritance.exercise;

public class Cylinder extends Circle{
    private static double height=5;

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        super(radius, color);

    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Cylinder.height = height;
    }
    public static double isCapacity(){
        return 3.14*Math.pow(getRadius(),2)*height;

    }
    @Override
    public String toString(){
        return"hình trụ có chiều cao là : "+getHeight()+"có thể tích là  : "+isCapacity()+"có bán kính là "+getRadius()+"và có màu sắc là "+getColor();
    }
}