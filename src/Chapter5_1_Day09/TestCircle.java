package Chapter5_1_Day09;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.1);
        Circle c2 = new Circle(2.2);
        System.out.println(Circle.getTotal());
        Circle.show();
        c1.setInfo("这是一个圆形");
        Circle.show();

    }
}

class Circle{
    private double radius;
    private static String info = "圆形";
    private static int total = 0;//因为total是static的，在内存中独一份，所以可以用来记录创建对象的次数

    public Circle(double radius){
        this.radius = radius;
        total++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static String getInfo() {
        return info;
    }

    public static void setInfo(String info) {
        Circle.info = info;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static void show(){
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}