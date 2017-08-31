package Chapter4;
/**
 *面向对象的特征二：继承
 *1、为什么要设计继承？
 *
 *2、通过“class A extends B”实现类的继承
 *子类（SubClass）：A      父类（或基类SuperClass）：B
 *
 *3、子类继承父类之后，父类中声明的属性和方法，子类可以获取到
 *  明确：当父类中有私有的属性或方法时，子类同样可以获取得到，只是由于封装性的设计，使得子类不可以直接调用罢了
 *  子类通过继承，获取父类的属性或方法，还可以定义自己的特有的成分
 *
 *  extends:子类是对父类功能的“扩展”，而不是说子类是父类的子集。
 *
 *4、Java中的类的继承只支持单继承！一个类只能继承一个父类。反之，一个父类可以有多个子类
 *5、子父类是相对的概念，还有多重继承
 *
* */
public class TestExtends {
    public static void main(String[] args) {
        Student s=new Student();
        s.eat();
        Worker w=new Worker();
        w.eat();
        Person p=new Person();
        p.walk();
    }
}
