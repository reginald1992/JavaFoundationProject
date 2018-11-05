package Chapter7_Day13;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Collection 接口：
 *
 * Map接口：
 *      |----HashMap：Map的主要实现类
 *      |----LinkedHashMap：使用链表维护添加的顺序，故遍历Map时，是按照添加的顺序遍历的
 *      |----TreeMap：按照添加进Map中的元素的Key的指定属性进行排序。要求Key是同一个类的对象！
 *                    针对Key：自然排序  VS  定制排序
 *      |----HashTable：古老的Map实现类、线程安全，不建议使用，不允许使用null值作为key和value
 *          |----Properties：常用来处理属性文件。键和值都是String类型的
 * */
public class TestMap {
    //使用properties来处理属性文件
    @Test
    public void test6() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("jdbc.properties")));
        String user = properties.getProperty("user");
        System.out.println(user);
        String password = properties.getProperty("password");
        System.out.println(password);
    }
    //定制排序
    @Test
    public void test5(){
        Comparator comparator = new Comparator() {
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
        };
        TreeMap map = new TreeMap(comparator);
        map.put(new Customer("AA", 1001), 87);
        map.put(new Customer("CC", 1001), 97);
        map.put(new Customer("BB", 1002), 77);
        map.put(new Customer("AD", 1003), 67);
        map.put(new Customer("BV", 1004), 87);
        Set set = map.keySet();
        for (Object object : set){
            System.out.println(object + "----->" + map.get(object));
        }
    }
    //自然排序
    @Test
    public void test4(){
        Map map = new TreeMap();
        map.put(new Person("SS", 26), 12);
        map.put(new Person("AA", 25), 29);
        map.put(new Person("SB", 26), 35);
        map.put(new Person("VB", 35), 15);
        map.put(new Person("BB", 18), 9);
        Set set = map.keySet();
        for (Object object : set){
            System.out.println(object + "----->" + map.get(object));
        }
    }
    @Test
    public void test3(){
        Map map = new LinkedHashMap();
        map.put("AA", 1323);
        map.put("BB", 12335);
        map.put(125335, "CC");
        map.put(null, null);
        map.put(new Person("DSS", 23), 23685);
        map.put(new Person("DSS", 23), 2368256);

        Set set1 = map.keySet();
        for (Object object : set1){
            System.out.println(object + "----->" + map.get(object));
        }
    }
    @Test
    public void test2(){
        /**
         * 如何遍历map
         * Set keySet()
         * Collection values()
         * Set entrySet()
         * */
        Map map = new HashMap();
        map.put("AA", 1323);
        map.put("BB", 12335);
        map.put(125335, "CC");
        map.put(null, null);
        map.put(new Person("DSS", 23), 23685);
        map.put(new Person("DSS", 23), 2368256);
        //1、遍历key集：
        Set set = map.keySet();
        for (Object obj : set){
            System.out.println(obj);
        }
        //2、遍历value集：
        Collection coll = map.values();
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //3、遍历key-value对
        //方式一
        Set set1 = map.keySet();
        for (Object object: set1){
            System.out.println(object + "------>" + map.get(object));
        }
        //方式二
        Set set2 = map.entrySet();
        for (Object object : set2){
            Map.Entry entry = (Map.Entry)object;
            System.out.println(entry.getKey() + "------>" + entry.getValue());
        }
    }
    /**
     * 添加、删除操作
     * Object put(Object key,Object value)：向Map中添加一个元素
     * Object remove(Object key):按照指定的key删除此entry
     * void putAll(Map t)
     * void clear():清空
     * 元素查询操作
     * Object get(Object key)：获取指定的value值，若无此key返回null
     * boolean containsKey(Object key): 判断是否包含指定的key
     * boolean containsValue(Object value)：判断是否包含指定的value
     * int size():返回集合的长度
     * boolean isEmpty()
     * boolean equals(Object obj)
     * 元视图操作的方法
     * Set keySet()
     * Collection values()
     * Set entrySet()
     *
     * HashMap:
     * 1、key是用Set来存放的，不可重复。value是用Collection存放的，可重复。
     * 一个key-value对是一个entry，所有的entry是用Set存放的，不可重复
     * 2、向HashMap中添加元素时，所调用的key所在类的equals方法，判断两个key是否相同。
     * 若相同，只能添加进后添加的那个元素。
     * */
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA", 1323);
        map.put("BB", 12335);
        map.put("BB", 12335);
        map.put(125335, "CC");
        map.put(125335, "CC");
        map.put(null, null);
        map.put(new Person("DSS", 23), 23685);
        map.put(new Person("DSS", 23), 2368256);
        System.out.println(map.size());
        System.out.println(map);

        map.remove("BB");
        System.out.println(map);

        Object obj = map.get("AA");
        System.out.println(obj);

        Object obj2 = map.get("CC");
        System.out.println(obj2);
    }
}
