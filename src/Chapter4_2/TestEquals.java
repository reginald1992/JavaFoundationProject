package Chapter4_2;
/*
   1、基本数据类型：根据基本数据类型的值判断是否相等。相等为True，不等为Falss
   注意：两端数据类型可以不同，也可以返回True
   2、引用数据类型：比较引用类型变量的地址值是否相等

 */
public class TestEquals {
    public static void main(String[] args) {
        TestEquals t = new TestEquals();
        t.test1();
        /*
        * equals():
        * 1、只能处理引用类型变量；2、在Object类，发现equals()仍然比较的两个应用变量的地址值是否相等
        * java.lang.Object是所有Java类的父类
        * */
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.equals(p2));//false
        System.out.println(p1 == p2);// false
//      像String 包装类 File类 Date类这些重写Obj类的equals（）方法，比较的是两个对象的内容是否完全相同
        String str1 = new String("AA");
        String str2 = new String("AA");
        System.out.println(str1 == str2);// false
        System.out.println(str1.equals(str2));//true

    }

    public void test1(){
        int i = 12;
        int j = 12;
        System.out.println(i == j);
        char k = 12;
        System.out.println(k == i);
        float f =12;
        System.out.println(f == i);

        int a = 65;
        char b = 'A';
        System.out.println(a == b);

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2);//false

        Peson1 p1 = new Peson1();
        Peson1 p2 = new Peson1();
        Peson1 p3 = p1;
        System.out.println(p1 == p2);//false
        System.out.println(p1 == p3);//true
    }
}




class Peson1{}

