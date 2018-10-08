package Chapter7_Day13;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *
 * 1). 使Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 *
 * 提示：Employee类是否需要重写equals()方法？MyDate类呢？*/
public class TestEmployee {
    //自然排序：使Employee类实现Comparable接口，并按name排序
    @Test
    public void test1(){
        Employee e1 = new Employee("刘德华", 55, new MyDate(4,12,1965));
        Employee e2 = new Employee("郭富城", 45, new MyDate(3,9,1962));
        Employee e3 = new Employee("张学友", 35, new MyDate(2,10,1969));
        Employee e4 = new Employee("黎明", 25, new MyDate(1,11,1945));
        Employee e5 = new Employee("李敏镐", 23, new MyDate(25,12,1990));
        Employee e6 = new Employee("李敏镐", 25, new MyDate(25,12,1990));

        TreeSet set = new TreeSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //定制排序：创建TreeSet时传入Comparator对象，按生日日期排序
    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee1 && o2 instanceof Employee1){
                    Employee1 e1 = (Employee1)o1;
                    Employee1 e2 = (Employee1)o2;
                    MyDate birth1 = e1.getBirthday();
                    MyDate birth2 = e2.getBirthday();
                    if (birth1.getYear() != birth2.getYear()){
                        return birth1.getYear() - birth2.getYear();
                    }else {
                        if (birth1.getMonth() != birth2.getMonth()){
                            return birth1.getMonth() - birth2.getMonth();
                        }else{
                            return birth1.getDay() - birth2.getDay();
                        }
                    }
                }
                return 0;
            }
        };
        TreeSet set = new TreeSet(comparator);
        Employee1 e1 = new Employee1("刘德华", 55, new MyDate(4,12,1965));
        Employee1 e2 = new Employee1("郭富城", 45, new MyDate(3,9,1962));
        Employee1 e3 = new Employee1("张学友", 35, new MyDate(2,10,1969));
        Employee1 e4 = new Employee1("黎明", 25, new MyDate(1,11,1945));
        Employee1 e5 = new Employee1("李敏镐", 23, new MyDate(25,12,1990));
        Employee1 e6 = new Employee1("李敏镐", 25, new MyDate(25,12,1990));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
