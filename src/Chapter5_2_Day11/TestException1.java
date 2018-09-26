package Chapter5_2_Day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 如何处理Exception异常？
 * Java提供的是异常处理抓抛模型
 * 一、“抛”：当我们执行代码时，一旦出现异常，就会在异常代码处生成一个对应异常类型的对象，并将此对象抛出（自动/手动）
 * 一旦抛出此异常类的对象，那么程序就终止执行。
 * 此异常类的对象抛给方法的调用者。
 * 二、“抓”：抓住上一步抛出来的异常类的对象。如何抓？即为异常处理的方式。
 * Java提供了两种方式来处理一个异常类的对象。
 * 处理方式一：
 * try{
 * 可能出现异常的代码
 * }catch(Exception 1){
 * 处理的方法1
 * }catch(Exception 2){
 * 处理的方法2
 * }finally{
 * 一定要执行的代码
 * }
 * <p>
 * 注：
 * 1、try内声明的变量，类似局部变量，出了try{}语句就不能被调用
 * 2、finally是可选的
 * 3、catch语句内部是对异常对象的处理
 * - getMessage(); printStackTrace();
 * 4、可以有多个catch语句，try中抛出的异常类对象从上往下去匹配catch中的异常类的类型，
 * 一旦满足就执行catch中的代码。执行完就退出当前的catch语句。执行完就跳出其后的多条catch语句
 * 5、如果异常处理了，那么其后的代码正常执行
 * 6、若catch中多个异常是“并列”关系，孰上孰下都可以
 *    若catch中多个异常是“包含”关系，须将子类放在父类的上面，进行处理，否则报错！
 * 7、finally中存放的是一定会被执行的代码，不管try、catch中是否仍有异常，以及是否有return语句。
 * 8、try/catch是可以相互嵌套的
 * 三、对于运行时异常来说，可以不显式的进行处理
 * 对于编译时候的异常来说，必须要显式的进行处理
 */
public class TestException1 {
    public void test1() {
        Scanner s = new Scanner(System.in);
        try {
            int i = s.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("出现类型不匹配的异常");
        }
    }

    // 常见的运行时异常
    // 1、数组下标越界的异常：java.lang.ArrayIndexOutOfBoundsException
    public void test2() {
        try {
            int[] i = new int[10];
            System.out.println(i[10]);
        } catch (Exception e) {
            System.out.println("出现异常");
        }
    }

    //    2、算术异常：ArithmeticException

    public void test3() {
        try {
            int i = 10;
            System.out.println(i / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    //    3、类型转换异常:java.lang.ClassCastException

    public void test4() {
        try {
            java.lang.Object obj = new java.lang.Object();
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("出现类型转换异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
    //    常见运行时异常
    //    4、空指针异常:java.lang.NullPointerException

    public void test5() {
        try {
            Person p = new Person();
            p = null;
            System.out.println(p.toString());

            String str = new String("AA");
            str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    编译时异常

    public void test6() throws Exception {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("hello.txt"));
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println((char) b);
            }
        }catch (FileNotFoundException e1){
            System.out.println(e1.getMessage());
        }catch (IOException e1){
            System.out.println(e1.getMessage());
        }finally {
            fis.close();
        }
    }
}
