package ss04_class_and_objects.exercise;

public class QuadraticEquation {
    private double isA;
    private double isB;
    private double isC;

    public double getIsA() {
        return isA;
    }

    public double getIsB() {
        return isB;
    }

    public double getIsC() {
        return isC;
    }

    public void setIsA(double isA) {
        this.isA = isA;
    }

    public void setIsB(double isB) {
        this.isB = isB;
    }

    public void setIsC(double isC) {
        this.isC = isC;
    }

    public QuadraticEquation() {
    }

    public QuadraticEquation(double isA, double isB, double isC) {
        this.isA = isA;
        this.isB = isB;
        this.isC = isC;
    }

    public double getDiscriminant(){
        return (Math.pow(isB,2)-(4*isA*isC));

    }
    public double getRoot(){
        return (-isB+Math.sqrt(Math.pow(isB,2)-(4*isA*isC)))/(2*isA);
    }

    public double getRoot2(){
        return (-isB-Math.sqrt(Math.pow(isB,2)-(4*isA*isC)))/(2*isA);
    }
    public double getRoot3(){
        return (-isB/(2*isA));
    }

}