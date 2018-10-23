package Chapter7_Day13;

import org.junit.Test;
import java.util.*;

/**
 *Collection接口：
 * |-----List接口：
 *    |-----ArrayList（主要实现类）
 *    |-----LinkedList（对于频发的插入、删除操作）
 *    |-----Vector（古老的实现类，线程安全的，但效率低于ArrayList）
 * |-----Set接口：存储无序的，不可重复的元素。Set中的方法都是在Collection中定义的
 *    |-----HashSet（主要实现类）
 *    |-----LinkedHashSet
 *    |-----TreeSet
 *
 * */

/**
 * TreeSet：
 * 1、向TreeSet中添加的元素必须是同一个类的
 * 2、可以按照添加进集合中的元素的制定的顺序遍历。像String、包装类等默认按照从小到大的顺序遍历
 * 3、当向TreeSet中添加自定义的对象时。有两种排序方法：①自然排序②定制排序
 * 4、自然排序：要求自定义类实现java.lang.Comparable接口并重写CompareTo（Object obj）的抽象方法
 * 在此方法中，指明按照自定义类的哪个属性进行排序
 * 5、向TreeSet中添加元素时，首先按照compareTo（）进行比较，一旦返回0，虽然仅是两个对象的此属性值
 * 相同，但是程序会认为这两个对象是相同的，进而后一个对象就不能添加进来
 * >compareTo()/hashCode()/equals()方法应该保持一致！
 * */
public class TestSet {
    @Test
    public void testTreeSet3(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer)o1;
                    Customer c2 = (Customer)o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0){
                        return c1.getName().compareTo(c2.getName());
                    }
                    return i;
                }
                return 0;
            }
        });
        set.add(new Customer("AA",11));
        set.add(new Customer("Ab",12));
        set.add(new Customer("Ac",25));
        set.add(new Customer("Ad",9));
        set.add(new Customer("Ae",15));

        for (Object o:set){
            System.out.println(o);
        }
    }
    /**
     * TreeSet的定制排序
     * 见下面的步骤123
     * compare（）、hashCode（）、equals（）三者保持一致!
     * */
    @Test
    public void testTreeSet2(){
        //1.创建一个实现Comparator接口的类对象
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //向TreeSet中添加Customer类的对象，在此compare()方法中，指明是按照Customer的哪个属性进行的
                if (o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer)o1;
                    Customer c2 = (Customer)o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0){
                        return c1.getName().compareTo(c2.getName());
                    }
                    return i;
                }
                return 0;
            }
        };
        //2.讲此对象作为形参传递给TreeSet的构造器中
        TreeSet set = new TreeSet(com);
        //3.向TreeSet中添加Customer接口的中compare方法中涉及的类的对象
        set.add(new Customer("AA",11));
        set.add(new Customer("Ab",12));
        set.add(new Customer("Ac",25));
        set.add(new Customer("Ad",9));
        set.add(new Customer("Ae",15));

        for (Object o:set){
            System.out.println(o);
        }
    }

    @Test
    public void testTreeSet(){
        Set set = new TreeSet();
//        set.add(123);
//        set.add(456);
//        set.add("AS");
//        set.add("sss");
//        set.add("JJ");
//        set.add("AA");
//        set.add(new String("FF"));
//        set.add(new String("HHH"));
        //当Person类没有实现Comparable接口时，当向TreeSet中添加Person类时候，报ClassCastException错
        set.add(new Person("AA", 22));
        set.add(new Person("BB", 21));
        set.add(new Person("CC", 23));
        set.add(new Person("DD", 24));
        set.add(new Person("FF", 25));
        set.add(new Person("EE", 25));
        System.out.println(set.size());
        for (Object str:set){
            System.out.println(str);
        }

    }
    /**
     * LinkedHashSet:使用链表维护了一个添加进集合的顺序。导致我们遍历LinkedHashSet集合元素时，是按照添加进去的顺序遍历的
     * LinkedHashSet插入性能略低于HashSet，但在访问迭代Set里的全部元素时有很好的性能
     * */
    @Test
    public void testLinkedHashSet(){
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add("AS");
        set.add("sss");
        set.add(null);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /**
     * Set：存储的元素是无序的，不可重复的
     * 1、无序性：无序性！=随机性。真正的无序性，指的是元素在底层存储的位置是无序的
     * 2、不可重复性：当向Set中添加进相同的元素的时候，后面的这个不能添加进去
     *
     * 说明：要求添加进Set中的元素，所在的类一定要重写equals（）和hashCode（）方法，进而保证Set中元素的不可重复性！
     * Set中的元素是如何存储的？
     * 使用了哈希算法。
     * 当向Set中添加对象时，首先调用此对象所在类的hashCode方法，计算此对象的哈希值，
     * 此哈希值决定了此对象在Set中存储的位置。若此位置之前没有对象存储，若此位置已有对象存储，
     * 再通过equals（）方法比较这两个对象是否相同。若相同，后一个对象就不能再添加进Set。
     * 万一返回false呢，都存储（不建议如此）
     * >要求：hashCode（）方法要与equals（）方法一致
     * */
    @Test
    public void testHashSet(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("AS");
        set.add("sss");
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.add("AS");
        System.out.println(set.size());
        System.out.println(set);
        Person p1 = new Person("AA",12);
        Person p2 = new Person("AA",12);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
        System.out.println(set);

    }
}
