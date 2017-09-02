package Chapter4;

public class Student extends Person{
//    private String name;
//    private int age;

    public Student(){

    }

    public Student(String name,int age){
//        this.name=name;
//        this.age=age;
        this.setAge(age);
        this.setName(name);
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
    /**
    * 对父类同名的方法的重写、覆盖
    *
    * */
    public void eat(){
        System.out.println("应该多吃有营养的");
    }
    public void walk(){
        System.out.println("学生走路");
    }
    public void info(){
        System.out.println("我是一个学生");
    }
}
