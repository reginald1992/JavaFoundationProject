package Chapter4_3;

public class TestPerson {
}
class Person{
    String name;
    int id;// 身份证号
    int age;

    public String show(){
       return "name:" + name + "age:" + age;
    }

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class Student extends Person{
    String major;
    int id;// 学号



    public Student(){
//        super.name = "AA";
        this.name = "AA";
        super.id = 1001;
        this.major = "CS";
        this.id = 1002;
    }

    public Student(String name, int id1, String major, int id2) {
        super(name, id1);
        this.major = major;
        this.id = id2;
    }

    public String show(){
        return super.show() + "major:" + major + "id:" +id;
    }
}

