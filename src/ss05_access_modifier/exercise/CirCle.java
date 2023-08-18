package ss05_access_modifier.exercise;

public class CirCle {
    private static double radius=1.0;
    private static String isColor="red";
    public CirCle(){}

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        CirCle.radius = radius;
    }

    public static String getIsColor() {
        return isColor;
    }

    public static void setIsColor(String isColor) {
        CirCle.isColor = isColor;
    }
    public static double getArea(){
        return 3.14*Math.pow(radius,2);
    }
}