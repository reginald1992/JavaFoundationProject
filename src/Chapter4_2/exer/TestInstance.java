package Chapter4_2.exer;
/**
* 建立TestInstance 类，在类中定义方法method1(Person e);
在method1中:
(1)根据e的类型调用相应类的getInfo()方法。
(2)根据e的类型执行：
如果e为Person类的对象，输出：“a person”;
如果e为Student类的对象，输出
“a student”
“a person ”
如果e为Graduate类的对象，输出：
“a graduated student”
“a student”
“a person” */
public class TestInstance {
    public static void main(String[] args) {
        TestInstance t = new TestInstance();
        t.method(new Student());
        System.out.println();
        t.method(new Graduate());
    }
    public void method(Person p){
        System.out.println(p.getInfo());

        if(p instanceof Person){
            System.out.println("a person");
        }

        if (p instanceof Student){
            System.out.println("a student");
        }

        if (p instanceof Graduate){
            System.out.println("a graduate");
        }
    }
}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}

