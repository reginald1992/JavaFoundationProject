package Chapter1_3;

/**
 * Created by Shulin Liu on 2017/7/6 0006.
 */

/*
* 面向对象思想的落地法则一：
* 1.设计类，并设计类的成员（成员变量和方法）
* 2、通过类，来创建类的对象（也称作类的实例化）
*3、通过“对象.属性”或者“对象.方法”来调用，完成相应的功能
*
* 二、创建的多个对象，彼此各自拥有一套类的属性，当对其中一个类的属性做修改时，不会影响到其他对象的属性值
*
* 三、类的属性（成员变量）
* 成员变量VS局部变量
*相同点：1、遵循变量的声明的格式：修饰符 数据类型 变量名=初始化值
*        2、都有作用域
*不同点：1、声明的位置有所不同：成员变量;声明在类内，方法外；
*                               局部变量：声明在方法内，方法的形参部分，代码块内
*        2、成员变量的修饰符有4个;public/private/protected/缺省
*           局部变量没有修饰符，与所在的方法的修饰符相同
*        3、初始化值;一定会有初始化值
*           成员变量：如果在声明的时候不显示的赋值，会有默认的值，不同数据类型不同的初始化赋值
*           int/byte/short/long=0
*           double/float=0.0
*           char=空格
*           Boolean=false
*           局部变量：一定显示的赋值，没有默认的初始化值
*        4、在内存中存放的位置不同
*           成员变量存在堆空间，局部变量在栈空间
* 四、类的方法：提供某种功能的实现
*        1、实例：public void eat();
*                 public String getName();
*                 public void setName(String n){};
*           格式：权限修饰符 返回值类型（void:无返回值/具体的返回值）方法名（形参）
*
*        2、关于返回值类型：viod:表明此方法不需要返回值
*                           有返回值的方法：在方法的最后一定有return+返回值对应的变量
*           即：void和return不可能同时出现
*        3、方法内可以调用本类的其他方法和属性，但是不能再定义其他的方法
*
*
*
* */
public class Zoo {
    public static void main(String[] args){
//        基本数据类型的声明：数据类型 变量名=初始化值
        int i=10;
//        类的实例化:如下的a1就是一个实实在在的对象
        Animal a1=new Animal();
//        int[] arr=new int[10];
        a1.name="花花";
        a1.age=5;
        System.out.println("name:"+a1.name+"\t"+"age"+a1.age);
//        通过对象调用方法
        a1.eat();
        a1.sleep();
//        再创建一个类的对象
        Animal a2=new Animal();
        System.out.println("name:"+a2.name+"\t"+"age"+a2.age);
        a2.name="草草";
        System.out.println("name:"+a2.name+"\t"+"age"+a2.age);

    }
}

class Animal{
//    1、属性
    String name;
    int age;

//    2、方法
    public void eat(){
        System.out.println("动物进食");
    }
    public void sleep(){
        System.out.println("动物休眠");
    }
    public int getAge(){
        return age;
//        其后不能声明语句
    }
//    当通过对象调用此方法时，会将方法的返回值提供给方法的调用者
    public String desc(){
        if(age>2){
            return "正当年少";
        }
        else {
            return "襁褓之中";
        }
    }


}