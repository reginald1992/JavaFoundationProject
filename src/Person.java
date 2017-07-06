import java.util.Scanner;

/**
 * Created by Shulin Liu on 2017/7/6 0006.
 */
public class Person {
    /*
    * 1、面向对象的编程关注于类的设计
    * 2、设计类实际上就是设计类的成员
    * 3、基本的类的成员：属性（成员变量）&方法
    *
    *
    * */
    public static void main(String[] args){
        Person p1=new Person();
        p1.info();
        p1.name="张三";
        p1.sex=true;
        p1.age=25;
        p1.info();

        p1.setName("李四");
        p1.info();

        Person p2=p1;
        p2.info();

        p2=new Person();
        p2.info();
//      实例化Scanner类的对象，通过此对象，nextInt()调用，完成相应的功能
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();


    }

//类：是抽象的

    //    1.属性：
    String name;
    int age;
    boolean sex;

    //    2、方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void info() {
//        eat();
//        sleep();
        System.out.println("names:" + name + "\t"+"age:" + age + "\t"+"sex" + sex);


    }
}
