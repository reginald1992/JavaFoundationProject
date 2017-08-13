/**
* this:
 * 1、可以用来修饰属性、方法、构造器
 * 2、this可以理解为当前对象或当前正在创建的对象。比如this.name,this.age
 * 3、可以在构造器中通过this（形参）这样的方式，显式的调用本类中其他重载的指定的构造器
*   要求：1、必须写在类的首行
 *        2、若一个类中有N个构造器，那么最多只有N-1个构造器中使用了this（形参）；
 *
* */
public class TestThisPerson {
    public static void main(String[] args) {
        ThisPerson tp=new ThisPerson();
        tp.setAge(20);
        tp.info();
        tp.setName("Jack");
        tp.info();
        System.out.println();

        ThisPerson tp2=new ThisPerson("David");
        ThisPerson tp3=new ThisPerson("Tim",25);
    }
}

class ThisPerson{
    private String name;
    private int age;

    public ThisPerson(){    //构造器

    }
    public ThisPerson(String name){   //构造器
        System.out.println("这是ThisPerson类中形参为name的构造器");
        this.name=name;
    }
    public ThisPerson(String name,int age){   //构造器
        this(name);//this()：可以用来显示的调用当前类的重载的制定的构造器,必须写在类的首行
//        name=n;
        System.out.println("这是ThisPerson类中形参为name，age的构造器");
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
//        this.name:表示当前对象的属性
//        name是一个形参

    }
    public void setAge(int a){
        this.age=a;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void info(){
        System.out.println("name:"+this.name+"age:"+age);//调用方法其实也是包含了this，只不过是默认的
        this.show();
        show();//其实这里也有一个this，只不过省略了
    }
    public void show(){
        System.out.println("这是一个人"+",名为"+this.name);
    }

}
