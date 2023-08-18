package ss04_class_and_objects.exercise;


public class Fan {
    private static final int SLOW=1;
    private static final int MEDIUM=2;
    private static final int FAST=3;
    private int speed=SLOW;
    private boolean ON=false;
    private double radius=5;
    private String color="Blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }




    public int getSpeed() {
        return speed;
    }

    public boolean isON() {
        return ON;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan() {
    }

    public Fan(int speed, boolean ON, double radius, String color) {
        this.speed = speed;
        this.ON = ON;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (isON()){
            return getSpeed()+" , "+getColor()+" , "+getRadius()+" , "+" fan is on .";
        }
        else {
            return getColor()+" , "+getRadius()+" fan is off ";
        }

    }


}