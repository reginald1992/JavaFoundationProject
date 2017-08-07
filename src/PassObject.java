/**
 * Created by shuli on 2017/7/9.
 * 练习
 */
class Circle2{
    double radious;
    public double fineArea(){
        return Math.PI*radious*radious;
    }

    public void setRadious(double r){
        radious=r;
    }

    public double getRadious(){
        return radious;
    }

    public void show(){
        System.out.println("我是一个圆");
    }
}

public class PassObject {
    /*1、将对象作为参数传递给方法。
题目要求：
（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
		public void printAreas(Cirlce c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
在main方法中调用printAreas()方法，调用完毕后输出当前半径值。

知识点：
1、匿名类对象:创建的类的对象是匿名的，当我们只需要一次调用类的对象的时候，就可以考虑使用匿名类的对象。
2、特点：创建的匿名类对象只能调用一次

*/
    public void printAreas(Circle2 c,int time){
        System.out.println("Radious"+"\t\t"+"Area");
        for(int i=0;i<= time;i++){
            c.setRadious(i);
            System.out.println(c.getRadious()+"\t\t"+c.fineArea());
        }
    }

    public static void main(String[] args) {
        PassObject p=new PassObject();
        Circle2 c=new Circle2();
        p.printAreas(c,5);


        System.out.println("Now radious is"+"\t"+c.getRadious());
        System.out.println();

        p.printAreas(new Circle2(),6);
        System.out.println();

        new Circle2().show();

        new Circle2().setRadious(2.3);
    }
}
