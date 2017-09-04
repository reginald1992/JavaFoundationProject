package Chapter4;

public class Person {
    private String name;
    private int age;
    int id=1001;//身份证号

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

    public void eat(){
        System.out.println("吃饭");
    }

    public void walk(){
        System.out.println("走路");
    }
}
