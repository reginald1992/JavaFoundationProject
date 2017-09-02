package exer;

public class Circle {
    private double radius;

    public Circle(){
        this.radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    计算园的面积
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
