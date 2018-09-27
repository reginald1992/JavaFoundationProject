package Chapter6_Day12;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class TestIterator {
    //面试题
    @Test
    public void testFor2(){
        String[] str = new String[]{"AA", "BB", "CC"};
        for (int i = 0; i < str.length; i++){
            str[i] = i + "";
        }
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
    @Test
    public void testFor3(){
        String[] str = new String[]{"AA", "BB", "CC"};
        for (String s:str){
            s = "MM";//此处的s是新定义的局部变量，其值得修改不会改变str
            System.out.println(s);
        }
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }

//**************************************************************

    //使用增强for循环实现数组的遍历
    @Test
    public void testFor1(){
        String[] str = new String[]{"AA", "BB", "CC"};
        for (String s:str){
            System.out.println(s);
        }
    }

    //使用增强for循环来实现集合的遍历
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        ((ArrayList) coll).add(123);
        ((ArrayList) coll).add("AA");
        ((ArrayList) coll).add(new Date());
        ((ArrayList) coll).add("BB");
        for (Object i:coll){
            System.out.println(i);
        }
    }
    //正确的写法：使用迭代器Iterator实现集合的遍历
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        ((ArrayList) coll).add(123);
        ((ArrayList) coll).add("AA");
        ((ArrayList) coll).add(new Date());
        ((ArrayList) coll).add("BB");

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
