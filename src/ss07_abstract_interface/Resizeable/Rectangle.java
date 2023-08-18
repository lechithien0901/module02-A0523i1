package ss07_abstract_interface.Resizeable;

public class Rectangle extends Shape implements Resizeable{
    private double high=5;
    private double width=5;
    public Rectangle(double high,double width){
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
        return "Rectangle{" +super.toString()+
                "high=" + high +
                ", width=" + width +" it is Perimeter = "+isPerimeter()+" it is Area = "+isArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println(" \n" +
                " The area of the front of the figure is "+isPerimeter()+" \n" +
                " The area of  the after of the figure is "+isPerimeter()*percent);
    }
}
