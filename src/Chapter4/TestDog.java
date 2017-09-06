package Chapter4;

public class TestDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("hauhua");
        d.setHostName("ZhangSan");
        System.out.println("name:"+d.getName()+" age:"+d.getAge()+" hostname:"+d.getHostName());

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
    }
}