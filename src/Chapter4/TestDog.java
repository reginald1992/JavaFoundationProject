package Chapter4;
/**
 * 子类对象实例化的全过程
 *
 */
public class TestDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("花花");
        d.setHostName("张三");
        d.setAge(8);
        System.out.println("name:"+d.getName()+" age:"+d.getAge()+" hostname:"+d.getHostName());
        System.out.println(d.toString());//这是Object的方法
    }
}
//生物
class Creator{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Creator() {
        System.out.println("this is Creator's construction");
    }
}
//动物
class Animal extends Creator{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("this is Animal's construction");
    }
}
//狗
class Dog extends Animal{
    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Dog() {
        System.out.println("this is Dog's construction");
    }
}