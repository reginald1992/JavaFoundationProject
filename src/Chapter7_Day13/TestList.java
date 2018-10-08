package Chapter7_Day13;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
    @Test
    public void testList(){
//        ArrayList list = new ArrayList();
        LinkedList list = new LinkedList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("AA");
        list.add("BB");
        //get(int index)
        //set(int index, Object obj)
        list.set(1,"NHJN");
        //add(int index, Object obj)
        list.add(3, "MMNNNNKK");
        //remove(int index)
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println();
        //遍历集合元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //增强for循环
        for (Object o:list){
            System.out.println(o);
        }
        System.out.println();
        //一般的for循环
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
