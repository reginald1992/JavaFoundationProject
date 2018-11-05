package Chapter8_Day14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的使用
 *
 * */
public class TestGeneric {
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
}
