package Chapter5_2_Day11;
/**
 * 接口与具体的实现类之间也存在多态性
 * */
public class TestInterface {
    public static void main(String[] args) {
        Duck d = new Duck();
        TestInterface.test1(d);
        TestInterface.test2(d);
        TestInterface.test3(d);
    }

    public static void test1(Runner r){
        r.run();
    }

    public static void test2(Swimmer s){
        s.swim();
    }

    public static void test3(Flier f){
        f.fly();
    }
}

interface Runner{
    public abstract void run();
}

interface Swimmer{
    void swim();
}

interface Flier{
    void fly();
}

class Duck implements Runner,Swimmer,Flier{
    public void run(){
        System.out.println("丑小鸭可以变成白天鹅");
    }

    public void swim(){
        System.out.println("丑小鸭可以游泳");
    }

    public void fly(){
        System.out.println("天鹅会飞");
    }
}