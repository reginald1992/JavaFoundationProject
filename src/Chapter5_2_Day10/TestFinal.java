package Chapter5_2_Day10;
/**
 * final：最终的，可以用来修饰类、属性、方法
 *
 * 1、final修饰类：这个类不能被继承。如：String类、StringBuffer类、System类
 * 2、final修饰方法：这个方法不能被重写。如：Object类中的getClass方法
 * 3、final修饰属性：此属性就是一个常量，一旦被初始化就不可以再被赋值。习惯上，常量用大写字符表示。
 * 此常量在哪里赋值？①此常量不能使用默认初始化;②可以显式赋值、代码块、构造器；
 * 变量用 static final修饰：全局常量
 *
 * 与finally finalize()区分开
 * */
public class TestFinal {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getClass());
    }
}

//class SubString extends String{}//报错
final class A{}

class C{
    public final void method(){
        System.out.println("method C");
    }
}

//class D extends C{
//    public void method(){
//        System.out.println("method D");
//    }
//}

class D{
    final int I = 12;
    final double PI;
    final String NAME;
//    final int J;
    public void methond(){
        System.out.println(I);
//        I = 10;
//        J = 10;
    }
//    在代码块中赋值
    {
        PI = 3.14;
    }
//    在构造器中赋值
    public D(){
        NAME = "D";
    }
}