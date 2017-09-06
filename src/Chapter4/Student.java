package Chapter4;
/**
* super：可以用来修饰属性、方法、构造器
 *
 * （1）当子类与父类中有同名的属性时，可以用“super.属性”来调用父类中的属性
* 若想调用子类的同名的属性，用“this.属性”
 *
 * （2）当子类重写父类的方法以后，在子类中若想再显式的调用父类的被重写的方法，就需要用“super.方法”
 *
 * （3）super修饰构造器：通过在子类中使用“super（形参列表）”来显式调用父类中的指定的构造器。
 *      >在构造器内部：“super（形参列表）”必须要声明在首行
 *      >在构造器内部：“this（形参列表）”或“super（形参列表）”只能出现一个！
 *      >当构造器中不显式的调用this（形参列表）或super（形参列表）其中任何一个，默认调用的是父类空参的构造器：super（）
 *      建议;设计一个类的时候，尽量要提供一个空参的构造器！
 *
* */
public class Student extends Person{
    private String schoolName;
//    private int age;
    int id=1002;//学号

    public Student(){
    super();//通过父类的构造器进行构造
    }

    public void show(){
        System.out.println(id);//1002
        System.out.println(super.id);//1001

    }

    public Student(String name,int age){
//        this.name=name;
//        this.age=age;
        this.setAge(age);
        this.setName(name);
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
    /**
    * 对父类同名的方法的重写、覆盖
    *
    * */
    public void eat(){
        System.out.println("应该多吃有营养的");
    }
    public void walk(){
        System.out.println("学生走路");
    }
    public void info(){
        System.out.println("我是一个学生");
    }
}
