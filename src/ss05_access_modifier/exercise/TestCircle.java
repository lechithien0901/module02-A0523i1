package ss05_access_modifier.exercise;

public class TestCircle {
    public static void main(String[] args) {



        System.out.println("màu của hình tròn là : "+   CirCle.getIsColor());
        System.out.println("bán kính của hình tròn là : "+  CirCle.getRadius()
        );
        CirCle.setRadius(5);
        System.out.println("diện tích của bán kính là"+CirCle .getArea() );

    }
}
