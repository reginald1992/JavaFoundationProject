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
 * int indexOf(Object obj)
 * int lastIndexOf(Object obj)
 * Object remove(int index)：删除制定索引位置的元素
 * Object set(int index, Object ele)
 * List subList(int fromIndex, int toIndex)
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
        Object obj = list.get(1);
        System.out.println(obj);
    }
}
