package exer;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();

        double area=c.findVolume();
        System.out.println(area);

        c.setRadius(2);
        c.setLength(3);
        double area2=c.findVolume();
        System.out.println(area2);

        c.findArea();
    }
}
