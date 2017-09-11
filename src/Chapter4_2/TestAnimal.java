package Chapter4_2;

public class TestAnimal {
    public static void main(String[] args) {
        TestAnimal t = new TestAnimal();
        t.func(new Animal());
        t.func(new Dog());
        t.func(new Cat());
    }

    public void func(Animal a){//Animal a = new Dog();
        a.eat();
        a.jump();

        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.Bark();
        }
        if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }
    }
}

class Animal{
    String name;
    int age;

    public void eat(){
        System.out.println("eat");
    }

    public void jump(){
        System.out.println("jump");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat");
    }

    public void jump(){
        System.out.println("Dog jump");
    }

    public void Bark(){
        System.out.println("Dog bark");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat");
    }

    public void jump(){
        System.out.println("Cat jump");
    }

    public void catchMouse(){
        System.out.println("Cat catch mouse");
    }
}
