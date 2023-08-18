package ss06_inheritance.exercise;

public class Point2D {
    private static float x=0.0f;
    private static float y=0.0f;

    public Point2D() {
    }
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public static float getX() {
        return x;
    }

    public static void setX(float x) {
        Point2D.x = x;
    }

    public static float getY() {
        return y;
    }

    public static void setY(float y) {
        Point2D.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;

    }
    public float[]getXY(){
        return new float[]{this.getX(),this.getY()};
    }

    public String toString(){
        return "Point 2D có x bằng : "+"{"+getX()
                +" và có y bằng : "+getY()+"}";
    }


}