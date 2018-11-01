package Chapter7_Day13;

import org.junit.Test;

import java.util.*;

/**
 * Collection 接口：
 *
 * Map接口：
 *      |----HashMap：
 *      |----LinkedHashMap：
 *      |----TreeMap
 *      |----HashTable
 *          |----Properties：
 * */
public class TestMap {
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
        Set set1 = map.keySet();
        for (Object object: set1){
            System.out.println(object + "------>" + map.get(object));
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
