package Chapter6_Day12;

import org.junit.Test;
import java.util.*;


/**
 * 1、存储对象可以考虑：①数组；②集合
 * 2、数组存储对象的特点：Student [] stu = new Student[20]; stu[0] = 1……
 *    弊端：①一旦创建，其长度不可变。②真实的数组存放的对象个数是不可知的。
 * 3、集合
 *      Collection接口
 *          ----------List接口：有序的，可以重复的元素
 *              ---------------ArrayList（主要的实现类）、LinkedList、Vector
 *          ----------Set接口：无序的，不可以重复的元素
 *              ---------------HashSet、LinkedHashSet、TreeSet
 *      Map接口：存储“键-值”对的数据
 *              ---------------HashMap、LinkedHashMap、TreeMap、HashTable（子类Properties）
 * */
public class TestCollection {
    @Test
    public void testCollection3(){
        Collection coll = new ArrayList();
        ((ArrayList) coll).add(123);
        ((ArrayList) coll).add("AA");
        ((ArrayList) coll).add(new Date());
        ((ArrayList) coll).add("BB");
        Collection coll1 = new ArrayList();
        ((ArrayList) coll1).add(123);
        ((ArrayList) coll1).add("AA");
        //10.removeAll(Collection coll):从当前集合中删除包含在coll中的元素
        coll.removeAll(coll1);
        System.out.println(coll);
        //11.equals（Object obj）：判断集合中的所有元素是否完全相同
        Collection coll2 = new ArrayList();
        ((ArrayList) coll2).add(123);
        ((ArrayList) coll2).add("AA");
        System.out.println(coll1.equals(coll2));
        //12.hashCode():
        System.out.println(coll.hashCode());
        //13.toArray():将集合转化为数组
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++){
            System.out.println(obj[i]);
        }
        //14.iterator():迭代器，返回一个Iterator接口实现类的对象，进而实现集合的遍历
        //方式一：不用
        Iterator iterator = coll.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        //方式二：不用
//        for (int i = 0; i < coll.size(); i++){
//            System.out.println(iterator.next());
//        }
        //方式三：使用
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
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
        //7.containsAll（Collection coll）：判断当前集合中是否包含了coll中所有的元素
        Collection coll1 = new ArrayList();
        ((ArrayList) coll1).add(123);
        ((ArrayList) coll1).add("AA");
        boolean b3 = coll.containsAll(coll1);
        System.out.println(b3);
        ((ArrayList) coll).add(456);
        //8.retainAll(Collection coll):求当前集合与coll的共有的元素，返回给当前集合
        coll.retainAll(coll1);
        System.out.println(coll);
        //9.remove（Object obj）:删除集合中的object元素。若删除成功，返回true。
        boolean b4 = coll.remove("BB");
        System.out.println(b4);
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
