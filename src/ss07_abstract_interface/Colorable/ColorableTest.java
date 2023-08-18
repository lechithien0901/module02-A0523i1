package ss07_abstract_interface.Colorable;

public class ColorableTest  {
    public static void main(String[] args) {
        Shape [] shapes=new Shape[3];

    shapes[0]=new Rectangle("blue",false,3,5);
    shapes[1]=new Circle();
shapes[2]=new Square();

        for (Shape s:shapes
             ) {
            if (s instanceof Rectangle){
                System.out.println(((Rectangle)s).isFilled());
                System.out.println("diện tích của hình chữ nhật là = "+((Rectangle)s).isArea());
            }
            else if (s instanceof Circle){
                System.out.println("diện tích của hình tròn là = "+((Circle)s).isArea());
            }
            else if (s instanceof Square){
                System.out.println("diện tích của hình vuông là = "+((Square)s).isArea()+" và hình tròn có : ");
                ((Square)s).howToColor();


            }
            else {
                System.out.println("hình không hợp lệ");
            }

        }
    }
}
