package ss07_abstract_interface.Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
Shape[] shapes=new Shape[3];
shapes[0]=new Circle();
shapes[1]=new Rectangle();
shapes[2]=new Square();
        for (Shape shape:shapes
             ) {
            double percent=100*Math.random();
            if (shape instanceof Circle){
                ((Circle )shape).resize(percent);
            }
            else if(shape instanceof Rectangle){
                ((Rectangle)shape).resize(percent);
            }
            else if (shape instanceof Square){
                ((Square)shape).resize(percent);
            }
            else{
                System.out.println("khong hop le");
            }

        }
    }
}
