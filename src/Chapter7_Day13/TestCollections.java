package Chapter7_Day13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 操作Collection以及Map的工具类
 *
 * 面试题：区分Collection及Collections
 * */
public class TestCollections {
    /**
     * 排序操作：（均为static方法）
     * reverse(List)：反转 List 中元素的顺序
     * shuffle(List)：对 List 集合元素进行随机排序
     * sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
     * sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
     * swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换     *
     * */
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(25);
        list.add(129);
        list.add(2358);
        list.add(25);
        list.add(124);
        list.add(129);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 0, 4);
        System.out.println(list);
    }
    /**
     * 查找、替换
     * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
     * Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
     * Object min(Collection)：根据元素的自然排序，返回给定集合中的最小元素
     * Object min(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最小元素
     * int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
     * void copy(List dest,List src)：将src中的内容复制到dest中
     * boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
     * */
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(25);
        list.add(129);
        list.add(2358);
        list.add(25);
        list.add(124);
        list.add(129);
        Object object = Collections.max(list);
        System.out.println(object);
        System.out.println(Collections.min(list));
        int count = Collections.frequency(list, 12900);
        System.out.println(count);
        //实现list的复制
        //List list1 = new ArrayList();//错误的实现方式
        List list1 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list1, list);
        System.out.println(list1);
        //通过如下的方法保证list的线程安全性
        List list2 = Collections.synchronizedList(list);
        System.out.println(list2);
    }
}
