package Chapter4_3;

import java.util.Date;

/**
 * toString()方法：
 * java.lang.Object类的toString()方法的定义如下：
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *     1、当我们打印一个对象的引用时，实际上默认调用的就是这个对象的toString()方法
 *     2、当我们打印的对象所在的类没有重写Object中的toString()方法时，那么调用的就是Object中定义的toString()方法
 *          返回此对象所在的类以及对应的堆空间对象实体的首地址值
 *     3、当我们打印的对象所在的类重写Object中的toString()方法时，调用的就是我们重写的方法
 *      常常这样重写：将类对象的属性信息返回
 *      4、像String类、包装类、Date类等，已经实现了将Object类中toString方法的重写
 * */
public class TestToString {
    public static void main(String[] args) {
        Person p1 = new Person("AA", 10);
        System.out.println(p1.toString());
        System.out.println(p1);

        String str = "AA";
        String str1 = new String("BB");
        System.out.println(str.toString());
        System.out.println(str1.toString());

        Date d = new Date();
    }
}
