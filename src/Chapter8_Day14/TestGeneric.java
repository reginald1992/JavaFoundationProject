package Chapter8_Day14;

import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用
 * 1.在集合中使用泛型
 * 2.自定义泛型类、泛型接口、泛型方法
 * 3.泛型和继承的关系
 * 4.通配符
 * */
public class TestGeneric {
    /**
     * 泛型与继承的关旭
     * 若类A是类B的子类，那么List<A>就不是List<B>的子接口
     * */
    @Test
    public void test5(){
        Object obj = null;
        String str = "AA";
        obj = str;

        Object[] obj1 = null;
        String[] str1 = new String[]{"AA", "BB", "CC"};
        obj1 = str1;

        List<Object> list = null;
        List<String> list1 = new ArrayList<String>();
//        list =list1;
//        假设list=list1满足
//        list.add(123);
//        String str1 = list1.get(0); //出现问题，所以假设不满足

    }
    @Test
    public void test4(){
// 1、当实例化泛型类的对象时，指明泛型的类型，指明以后，
// 对应的类中所有使用泛型的位置，都变为实例化中指定的泛型类型
// 2、如果我们自定义了泛型类，但是在实例化时没有使用，那么默认类型是Object类的
        Order<Boolean> order = new Order<>();
        order.setT(true);
        System.out.println(order.getT());

        order.add();
        List<Boolean> list = order.list;
        System.out.println(list);

        SubOrder o = new SubOrder();
        List<Integer> list1 = o.list;
        System.out.println(list1);
//      当通过对象调泛型类方法时，指明泛型的类型
        Integer i = order.getE(34);
        Double d = order.getE(3.6);
        String s = order.getE("AA");

        Integer[] in = new Integer[]{1, 2, 3};
        List<Integer> list3 = new ArrayList<>();
        List<Integer>list4 = order.fromArrayToList(in, list3);
        System.out.println(list4);
    }
    //1.在集合中没有使用泛型的情况下
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(125);
        list.add(15);
        list.add(25);
        list.add(1);
        //1.没有使用泛型，任何Object及其子类的对象都可以添加进来
        list.add(new String("AA"));
        for (int i = 0; i < list.size(); i++){
            //2.强转为int型的时候，可能报ClassCastException异常
            int socre = (Integer)list.get(i);
            System.out.println(socre);
        }
    }
    //2.在集合中使用泛型
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(125);
        list.add(15);
        list.add(25);
        list.add(1);
        list.add(2223);
    }
    @Test
    public void test3(){
        Map<String, Integer> map = new HashMap<>();
        map.put("AA", 1256);
        map.put("BB", 253);
        map.put("CC", 253);
        map.put("DD", 299);
        map.put("EE", 123);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> o :set){
            System.out.println(o.getKey() + "---->" + o.getValue());
        }
    }
}
