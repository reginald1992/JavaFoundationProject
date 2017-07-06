/**
 * Created by Shulin Liu on 2017/7/6 0006.
 */
/*要求：(1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，输出字符串“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
*/
//测试类
public class TestPerson {
    /*
    * 1、面向对象的编程关注于类的设计
    * 2、设计类实际上就是设计类的成员
    * 3、基本的类的成员：属性（成员变量）&方法
    * */
    public static void main(String[] args) {
        Person p = new Person();
        p.study();
        p.showAge();
        p.addAge(2);
        p.showAge();
    }
}
class Person{
//类：是抽象的
    //    1.属性：
    String name;
    int age;
    boolean sex;
    //    2、方法
    public void study() {
        System.out.println("study");
    }
    public void showAge() {
        System.out.println(age);//打印调用showAge方法的age
    }
    public int addAge(int i){
        age+=2;
        return age;
    }//给调用次方法的age属性增加2
}
