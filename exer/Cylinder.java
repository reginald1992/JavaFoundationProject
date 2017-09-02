package exer;

public class Cylinder extends Circle{
    private double length;//圆柱的高

    public Cylinder(){
        this.length=1;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
//        return Math.PI*getRadius()*getRadius()*length;
        return findArea()*length;
    }
}
