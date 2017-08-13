/**类的第三个成员：构造器（constructor 构造方法）
 * constructor：建造者
 * 构造器的作用：①创建对象 ②给创建对象的属性赋值
 *1、设计类时，若不显式声明类的构造器的话，程序会默认提供一个空参的构造器
 *2、一旦显式的定义类的构造器，那么默认的构造器就不再提供
 *3、如何声明类的构造器。格式：权限修饰符 类名（形参）{ }
 *4、类的多个构造器之间构成重载
 *
 * 类对象的属性赋值的先后顺序：①属性的默认初始化；②属性的显式初始化赋值；③通过构造器给属性初始化；④通过对象.方法的方式对属性进行赋值操作
 *
 * */
public class TestPeople {
    public static void main(String[] args) {
        People p1=new People();
        String str=new String("测试JDK自带的构造器");
        System.out.println(str);

        People p2=new People("Jack");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        People p3=new People("David",25);
        System.out.println(p3.getAge());
        System.out.println(p3.getName());

    }
}
class People{
//    属性
    private String name;
    private int age;
//    构造器
    public People(String n){
        name=n;
    }

    public People() {
    }

    public People(int a){
        age=a;
    }

    public People(String n,int a){
        name=n;
        age=a;
    }

//    方法
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
