package Chapter4_3;

import org.junit.jupiter.api.Test;

/**
* 包装类：8种基本数据类型对应着一个类，此类即为包装类
 * 基本数据类型、包装类及String之间的相互转化
* */
public class TestWrapper {
//    基本数据类型、包装类与String类之间的转化
    @Test
    public void test2(){
//        基本数据类型、包装类---》String类:调用String类的静态的重载的valueOf(XXX x)方法
        int i1 = 10;
        String str1 = i1 + "";
        String str2 = String.valueOf(i1);
        String str3 = String.valueOf(true);
//        String类--->基本数据类型、包装类:调用包装类的parseXXX（String str）方法
        int i3 = Integer.parseInt(str1);
        System.out.println(i3);
        boolean b1 = Boolean.parseBoolean(str3);
        System.out.println(b1);
    }


//    基本数据类型与包装类之间的转化
    @Test
    public void test1(){
        int i = 10;
        boolean b = true;
//        基本数据类型---》对应的包装类：调用包装类的构造器
        Integer i1 = new Integer(i);
        System.out.println(i1.toString());

        Float f = new Float(12.3F);
        System.out.println(f);

//        java.lang.NumberFormatException
//        i1 = new Integer("123abc");
//        System.out.println(i1);

//        对于Boolean类型来讲，当形参是"trun"时返回true，其余全部返回false
        Boolean b1 = new Boolean("true");
        System.out.println(b1);

        Boolean b2 = new Boolean("true1236abc");
        System.out.println(b2);

        Order o = new Order();
        System.out.println(o.b);//null

//        包装类--->基本数据类型
        int i2 = i1.intValue();
        System.out.println(i2);
        System.out.println(f.floatValue());
        System.out.println(b1.booleanValue());

//        JDK5.0以后加入一个新特性：自动装箱和拆箱
        int i4 = 12;
        Integer i3 = i4;//自动装箱
        Boolean bb = false;

        int i5 = i3;//自动拆箱

    }
}

class Order{
    Boolean b;
}
