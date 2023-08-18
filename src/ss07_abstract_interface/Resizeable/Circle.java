package ss07_abstract_interface.Resizeable;

public class Circle extends Shape implements Resizeable{
    private float radius=5;

    public Circle(String color,boolean filled ,float radius) {

        this.radius = radius;
    }
    public Circle(){

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double isArea(){
        return 3.14*Math.pow(radius,2);
    }
    public double isPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +" diện tích của nó là :"+isArea()+" Chu vi cua chúng là : "+isPerimeter()+
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("diện tích ban đầu của hình là : "+isArea()+" "+
                " Diện tích sau của hình là : "+isArea()*percent );
    }
}
