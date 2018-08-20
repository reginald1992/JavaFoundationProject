package Chapter4_3.exer;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//  计算圆的面积
    public double findArea(){
        return 3.14*radius*radius;
    }
//  重写equals()方法和toString()方法
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        else if (obj instanceof Circle){
            Circle c1 = (Circle)obj;
            return c1.radius == this.radius;
        }else{
            return false;
        }
    }

    public String toString(){
//        return radius + "";
        return String.valueOf(radius);
    }
}
