package Chapter5_2_Day11;
/**
 * 类的第五个成员：内部类
 * 1、相当于在类的内部再定义类。外面的类就是外部类；里面的类就是内部类。
 * 2、内部类的分类：成员内部类（声明在类内部且方法外）  VS  局部内部类（声明在类的方法里）
 * 3、成员内部类：
 * （1）是外部类的一个成员：①可以有修饰符（4个）②static/final/abstract可以修饰叁③可以调用外部类的属性方法
 *
 * （2）具有类的特点：①abstract修饰②还可以在其内部定义属性、方法和构造器
 *
 * 4、局部内部类：
 *
 *
 * 5、关于内部类，掌握以下三点：
 * （1）如何创建成员内部类的对象（如：创建Bird类和Dog类的对象）
 * （2）如何区分调用外部类、内部类的变量（尤其是重名的变量）
 * （3）局部内部类的使用：见TestInnerClass1.java
 * */
public class TestInnerClass {
    public static void main(String[] args) {
//        创建静态内部类的对象：可以直接通过外部类调用静态内部类的构造器
        Person.Dog d = new Person.Dog();
//        Person.Bird b = new Person.Bird();
//        创建非静态的内部类的对象，必须先创建外部类的对象，通过外部类的对象调用内部类的构造器
        Person p = new Person();
        Person.Bird b = p.new Bird();
        b.info();
        b.setName("杜鹃");
    }
}

class Person{
    String name = "AAA";
    int age;

    //成员内部类（非静态的）
    class Bird{
        String name = "Bird";
        int id;

        public Bird(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            System.out.println(name);
            System.out.println(this.name);
        }

        public void info(){
            show();
        }
    }
//    成员内部类（静态内部类）
    static class Dog{

}

    public void show(){

    }

    public void method1(){
        class A{}
    }
}
