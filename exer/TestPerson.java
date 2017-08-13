package exer;
/**
* 创建程序,在其中定义两个类：Person和TestPerson类。定义如下：
 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 在TestPerson类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 *
* */
public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(140);
        System.out.println(p.getAge());
    }

}

class Person{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if(a>0&&a<130){
            age=a;
        }else {
//            System.out.println("输入的数据有误！");
            throw new RuntimeException("输入的数据有误！");
        }
    }

}