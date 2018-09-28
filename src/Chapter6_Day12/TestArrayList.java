package Chapter6_Day12;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList:List的主要实现类
 * List 集合里添加了一些根据索引来操作集合元素的方法
 * void add(int index, Object ele):在指定的索引位置添加元素ele
 * boolean addAll(int index, Collection eles)：在制定若干个索引位置加元素
 * Object get(int index):获取指定索引的元素
 * int indexOf(Object obj)：返回obj在集合中首次出现的位置。没有的话，返回-1
 * int lastIndexOf(Object obj)：返回obj在集合中最后一次出现的位置。没有的话，返回-1
 * Object remove(int index)：删除制定索引位置的元素
 * Object set(int index, Object ele)
 * List subList(int fromIndex, int toIndex)：返回从fromIndex到toIndex结束的一个list,左闭右开的区间
 *
 * List常用的方法：增（add）删(remove)改(set)查（get）插（add）长度（size）
 * */
public class TestArrayList {
    @Test
    public void testList1(){
        List list = new ArrayList();
        list.add(1233);
        list.add(456);
        list.add("AA");
        list.add("BBB");
        list.add("GG");
        System.out.println(list);
        list.add(0,789);
        System.out.println(list);
        Object obj = list.get(0);
        System.out.println(obj);
        list.remove(0);
        System.out.println(list.get(0));
        list.set(0, 111);
        System.out.println(list.get(0));
    }

    @Test
    public void testList2(){
        List list = new ArrayList();
        list.add(1233);
        list.add(456);
        list.add("AA");
        list.add("BBB");
        list.add("GG");
        list.add(456);
        System.out.println(list.indexOf(456));
        System.out.println(list.lastIndexOf(456));
        System.out.println(list.indexOf(11));
        System.out.println(list.subList(1,3));
    }
}
