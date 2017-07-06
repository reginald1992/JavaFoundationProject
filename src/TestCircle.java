/**
 * Created by Shulin Liu on 2017/7/6 0006.
 */
public class TestCircle {
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.radius=3.5;
        c1.findArea();
    }
}
class Circle{
    double radius;
//    提供方法用于获取圆的面积
    public void findArea(){
        System.out.println(3.14*radius*radius);
    }
}