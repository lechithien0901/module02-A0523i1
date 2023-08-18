package ss07_abstract_interface.Colorable;

public class Square extends Shape implements Colorable {
    private double isHigh=5;

    public Square(String color, boolean filled, double isHigh) {
        super(color, filled);
        this.isHigh = isHigh;
    }

    public Square(double isHigh) {
        this.isHigh = isHigh;
    }
    public Square(){}

    public double getIsHigh() {
        return isHigh;
    }

    public void setIsHigh(double isHigh) {
        this.isHigh = isHigh;
    }
    public double isPerimeter(){
       return isHigh*4;
    }
    public double isArea(){
        return isHigh*isHigh;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                "isHigh=" + isHigh +" Perimeter = "+isPerimeter()+"isArea"+isArea()+
                super.toString()+
                '}';
    }

}
