package Chapter4_3.review;

public class TestEquals {
    public static void main(String[] args) {
        Person p1 = new Person("AA", 12);
        Person p2 = new Person("AA", 12);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}

class Person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    自定义一个实现Object类的equals()方法
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if (obj instanceof Person){
            Person p = (Person)obj;
            return this.name == p.name && this.age == p.age;
        }else{
            return false;
        }
    }
}
