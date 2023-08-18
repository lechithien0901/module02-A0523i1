package ss07_abstract_interface.Resizeable;

public class Square extends Shape implements Resizeable {
    private double isLength=5;

    public Square(double isLength) {
        this.isLength = isLength;
    }

    public Square() {
    }

    public double getIsLength() {
        return isLength;
    }

    public void setIsLength(double isLength) {
        this.isLength = isLength;
    }
    public double isPerimeter(){
        return isLength*4;
    }
    public double isArea(){
        return isLength*isLength;
    }

    @Override
    public String toString() {
        return "Square{" +super.toString()+
                "isLength=" + isLength +" it is Perimeter "+isPerimeter()+" it is Area "+isArea()+

                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println(" The area of the front of the figure is = "+isArea()+
                "The area of  the after of the figure is = "+isArea()*percent);
    }
}
