package Chapter1_3;

import java.util.Scanner;

/**
 * Created by Shulin Liu on 2017/7/6 0006.
 */
public class TestCircle {
    public static void main(String[] args){
        Circle c1=new Circle();
        System.out.println("请输入圆的半径：");
        Scanner in=new Scanner(System.in);
        c1.radius=in.nextInt();
        c1.findArea();
    }
}
class Circle{
    double radius;
//    提供方法用于获取圆的面积
    public void findArea(){
        System.out.println("面积="+3.14*radius*radius);
    }
}