package Chapter5_2_Day10;
/**
 *接口（interface）是与类并行的一个概念
 * 1、接口可以看作一个特殊的抽象类。是常量与抽象方法的一个集合。不能包含变量、一般的方法。
 * 2、接口是没有构造器的。
 * 3、接口定义的就是一种功能，可以被类所实现（implements）
 * 比如abstract class BB implements AA
 * 4、实现接口的类，必须要重写其中所有的abstract方法，方可实例化。若没有重写所有的抽象方法，则此类仍为抽象类
 * 5、类可以实现多个接口的。---Java中类的继承是单继承的
 * 6、接口与接口之间也是继承的关系，而且可以实现多继承
 * 【5/6】描述的是Java继承的特点
 * */
public class TestInterface {
    public static void main(String[] args) {
        System.out.println(AA.FLAG);
        System.out.println(AA.I);
//        AA.I = 5;
    }
}

interface AA{
    //常量：所有的常量都是用public static final来修饰的
    int I = 20;
    boolean FLAG = true;

    //抽象方法：所有的抽象方法都用public abstract修饰
    public abstract void method1();
    public abstract void method2();
    void method3();
    void method4();
}

abstract class BB implements AA{

}

class DD{}
interface MM{
    void method5();
}

class CC extends DD implements AA,MM{
    public void method1(){}
    public void method2(){}
    public void method3(){}
    public void method4(){}
    public void method5(){}
}

interface JJ extends MM,AA{
    void method6();
}