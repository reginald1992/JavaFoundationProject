package Chapter6_Day12;
/**
 * 1.手动抛出一个异常的例子
 * 2.抛出的异常类型：若是RuntimeException，可以不显式处理；若是Exception，必须显式处理
 * */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.2);
        Circle c2 = new Circle(2.3);
        try {
            System.out.println(c1.compareTo(c2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(c1.compareTo(new String("AA")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
//    比较两个圆的半径大小
    public int compareTo(Object obj) throws Exception {
        if (this == obj){
            return 0;
        }else if (obj instanceof Circle){
            Circle c = (Circle)obj;
            if (c.radius > this.radius){
                return -1;
            }else if (c.radius == this.radius){
                return 0;
            }else {
                return 1;
            }
        }else {
//            手动的抛出一个异常
            throw new Exception("传入的类型有误");
        }
    }
}