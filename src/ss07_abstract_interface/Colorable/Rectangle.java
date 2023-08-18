package ss07_abstract_interface.Colorable;

public class Rectangle extends Shape {
    private double high=5;
    private double width=5;
    public Rectangle(String Color,boolean filled,double high,double width){
       super(Color,filled);
        this.high=high;
        this.width=width;
    }
    public Rectangle(){}

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double isPerimeter(){
        return (high+width)*2;
    }
    public double isArea(){
        return high*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "high=" + high +
                ", width=" + width +" it is Perimeter = "+isPerimeter()+" it is Area = "+isArea()+
                '}';
    }



}
