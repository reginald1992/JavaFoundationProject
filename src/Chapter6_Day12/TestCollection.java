package Chapter6_Day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 1、存储对象可以考虑：①数组；②集合
 * 2、数组存储对象的特点：Student [] stu = new Student[20]; stu[0] = 1……
 *    弊端：①一旦创建，其长度不可变。②真实的数组存放的对象个数是不可知的。
 * 3、
 * */
public class TestCollection {
    @Test
    public void testCollection2(){
        Collection coll = new ArrayList();
        ((ArrayList) coll).add(123);
        ((ArrayList) coll).add("AA");
        ((ArrayList) coll).add(new Date());
        ((ArrayList) coll).add("BB");
        Person p =new Person("MM", 12);
        ((ArrayList) coll).add(new Person("MM", 12));
        //6.contains.(Object obj):判断集合中是否包含制定的object元素。如果包含返回true
        //判断的依据：根据元素所在类的equals方法
        //明确：如果存入集合中的元素是自定义类的对象。要求：自定义的类要重写equals方法
        boolean b1 = coll.contains("AA");
        System.out.println(b1);
        boolean b2 = coll.contains(p);
        System.out.println(b2);
    }
    @Test
    public void testCollection1(){
        Collection coll = new ArrayList();
        //1.size()：返回集合中元素的个数
        System.out.println(coll.size());
        //2.add(Object obj)：向集合中添加一个元素
        ((ArrayList) coll).add(123);
        ((ArrayList) coll).add("AA");
        ((ArrayList) coll).add(new Date());
        ((ArrayList) coll).add("BB");
        System.out.println(coll.size());
        //3.addAll（Collection coll）:讲形参coll中包含的所有元素添加到当前集合中
        Collection coll1 = Arrays.asList(1,2,3);
        ((ArrayList) coll).addAll(coll1);
        //查看集合所有元素
        System.out.println(coll);
        System.out.println(coll.size());
        //4.isEmpty():判断集合是否为空
        System.out.println(coll.isEmpty());
        //5.clear():清空集合元素
        coll.clear();
        System.out.println(coll.isEmpty());
    }
}
