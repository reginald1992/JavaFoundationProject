package Chapter5_2_Day10;
/**
 * abstract:抽象的，可以用来修饰类、方法
 * 1、abstract修饰类：抽象类
 * （1）不可被实例化
 * （2）抽象类有构造器（凡是类都有构造器）
 * （3）抽象方法所在的类必须是抽象类
 * （4）抽象类中可以没有抽象方法
 *
 * 2、abstract修饰方法：抽象方法
 * （1）格式：没有方法体，包括{ }。如public abstract void eat();
 * （2）抽象方法只保留方法的功能，而具体的执行交给继承抽象类的子类。由子类重写此抽象方法
 * （3）若子类继承抽象类，并重写了所有的抽象方法，则此类是一个“实体类”，即可以实例化
 * （4）若子类继承抽象类，没有重写所有的抽象方法，意味着此类中仍有抽象方法，则此类必须声明为抽象类
 *
 *
 * */
public class TestAbstract {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();
        Student s1 = new Student();
        s1.eat();
    }
}

abstract class Person{
    String name;
    public abstract void eat();

    public abstract void walk();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public void eat(){
        System.out.println("student eat");
    }

    public void walk(){
        System.out.println("student walk");
    }
}

class Worker extends Person{
    public void eat(){
        System.out.println("worker eat");
    }

    public void walk(){
        System.out.println("worker walk");
    }
}