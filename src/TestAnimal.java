/**
* 一、面向对象的特征一：封装与隐藏
 * 1、当创建了类的对象以后，如果直接通过“对象.属性”的方式对相应的对象属性赋值的话，可能会出现不符合实际情况的意外，
 * 我们考虑不让对象来直接作用属性，而是通过“对象.方法”的形式，来控制对象对属性的访问。实际情况中，对属性的要求就通过
 * 方法来体现。
*
 * 解决的方法：①（封装的思想）将类的属性私有化；②提供公共的方法（setter & getter）来实现调用
*
 * 二、权限修饰符：public private 缺省（即default） protected
 *      可以用来修饰属性、方法
 *      注意：权限从小到大：private、缺省、protected、public
 *      对于class来说，只有public和缺省可以修饰
 *      default类只可以被同一个包内部的类进行调用
 *      public可以在任何地方调用
 *
* */
public class TestAnimal {
    public static void main(String[] args) {
        Animal2 a2=new Animal2();
//        a2.name="huahua";//属性私有化
//        a2.legs=4;//属性私有化之后，就不可以在类外部调用
        a2.eat();
        a2.info();
        a2.sleep();
        a2.setLegs(3);
    }
}
class Animal2 {
//    private 修饰的属性，只能在本类中被调用，出了此类就不能再被调用
    private String name;//动物的名字
    private int legs;//腿的个数

    public void eat() {
        System.out.println("动物进食");
    }
    public void sleep(){
        System.out.println("动物睡觉");
    }
    public void info(){
        System.out.println("name:"+name+"\t"+"legs:"+legs);
    }
//    设置类的属性
    public void setLegs(int l){
        if(l>0 && l%2==0){
            legs=l;
        }else {
            System.out.println("输入的数据有误！");
        }
    }
//    获取类的属性
    public int getLegs(){
        return legs;
    }
}