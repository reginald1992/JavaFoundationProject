package Chapter5_1_Day09;
/**
 * static,静态的，修饰属性、方法、代码块、内部类
 *
 * static修饰属性（类变量）：
 * 1、由类创建的所有对象都共用这一个属性
 * 2、当其中一个对象对此属性进行修改，会导致其他对象对此属性的一个调用；
 * 实例对象（非static修饰的属性）各自拥有一套副本。其中一个对象对实例对象进行修改，其他对象无任何修改
 * 3、类变量随着类的加载而加载，而且独一份。
 * 4、静态对象可以直接通过类.类变量的形式来调用。
 * 5、类变量的加载要早于对象。所以当有了对象以后，也可以通过“对象.类变量”来使用。但是“类.实例变量”是不行的
 * 6、静态变量、类变量是存在与静态域中的。
 *
 * static修饰方法（类方法）
 * 1、随着类的加载而加载，在内存中独一份
 * 2、可以直接通过"类.类方法"的方式来调用
 * 3、在静态的方法内，可以调用静态的属性或静态的方法，而不能调用非静态的属性或方法。反之，非静态的方法是可以调用静态的属性或方法
 *【静态的方法内是不可以有this、super这些关键字的！】
 * 注：静态的结构（static的属性、方法、代码块、内部类）的生命周期要早于非静态的结构，同时被回收也要晚于非静态的结构
 * */
public class TestSportsMan {
    public static void main(String[] args) {
        SportsMan s1 = new SportsMan("张三", 18);
        SportsMan s2 = new SportsMan("李四", 21);
        s1.name = "周五";
        s1.nation = "China";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(SportsMan.nation);
        s1.show1();
        s1.show();
        SportsMan.show();
    }
}

class SportsMan{
//    实例变量（随着对象的创建而被加载的）
    String name;
    int age;
//    类变量
    static String nation;
    public SportsMan(String name, int age){
        this.name = name;
        this.age = age;
        this.nation = "中国";
    }

    @Override
    public String toString() {
        return "SportsMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }

    public void show1(){
        age = 10;
        System.out.println("age:" + this.age);
        System.out.println("一名来自中国的运动员");
    }

     public static void show(){
        System.out.println("nation:" + nation);
//        System.out.println("age:" + this.age);
        System.out.println("一名来自中国的运动员2");
        info();
    }

    public static void info(){
        System.out.println("这是一个静态的方法");
    }
}