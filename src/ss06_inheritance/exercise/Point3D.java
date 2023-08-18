package ss06_inheritance.exercise;
public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }
    public float[]getZYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                " x = "+getX()+" y = "+getY()+"}";
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        point3D.setXYZ(3,4,5);
        System.out.println(point3D);
        Point2D point2D=new Point2D();
        point2D.setXY(10,9);
        System.out.println(point2D);
    }
}