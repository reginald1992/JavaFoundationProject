package Chapter5_2_Day11;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 如何处理Exception异常？
 *Java提供的是异常处理抓抛模型
 *1、“抛”：当我们执行代码时，一旦出现异常，就会在异常代码处生成一个对应异常类型的对象，并将此对象抛出
 *       一旦抛出此异常类的对象，那么程序就终止执行。
 *       此异常类的对象抛给方法的调用者。
 * 2、“抓”：抓住上一步抛出来的异常类的对象。如何抓？即为异常处理的方式。
 *      Java提供了两种方式来处理一个异常类的对象。
 *      处理方式一：
 *      try{
 *          可能出现异常的代码
 *      }catch(Exception 1){
 *      处理的方法1
 *      }catch(Exception 2){
 *      处理的方法2
 *      }finally{
 *      一定要执行的代码
 *      }
 * */
public class TestException1 {
    @Test
    public void test1(){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i);
    }

    // 常见的运行时异常
    // 1、数组下标越界的异常：java.lang.ArrayIndexOutOfBoundsException
//    @Test
//    public void test2(){
//        int[] i = new int[10];
//        System.out.println(i[10]);
//    }
//    2、算术异常：ArithmeticException
//    @Test
//    public void test3(){
//        int i = 10;
//        System.out.println(i / 0);
//    }
//    3、类型转换异常:java.lang.ClassCastException
//    @Test
//    public void test4(){
//        java.lang.Object obj = new java.lang.Object();
//        String str = (String)obj;
//    }
//    4、空指针异常:java.lang.NullPointerException
//    @Test
//    public void test5(){
//        Person p = new Person();
//        p = null;
//        System.out.println(p.toString());
//
//        String str = new String("AA");
//        str = null;
//        System.out.println(str.length());
//    }

    //    编译时异常
    @Test
    public void test6()throws Exception{
        FileInputStream fis = new FileInputStream(new File("hello.txt"));
        int b;
        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
