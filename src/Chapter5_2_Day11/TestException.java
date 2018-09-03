package Chapter5_2_Day11;
/**
 * 异常的体系结构
 * java.lang.Throwable
 * ----error：错误，程序中不进行处理
 * ----exception:异常，要求在编写程序的时候就要考虑到对这些异常的处理
 * ----编译时异常：在编译期间会出现的异常（执行javac.exe命令时，出现异常）
 * ----运行时异常：在运行期间会出现的异常（执行java.exe命令时，出现异常）
 * 当执行一个程序时，如果出现异常，那么异常之后的代码就不再执行
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

public class TestException {
    @Test
    public void test1() {
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
    public void test6() throws Exception {
        FileInputStream fis = new FileInputStream(new File("hello.txt"));
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }
}
