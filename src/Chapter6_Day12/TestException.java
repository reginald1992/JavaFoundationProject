package Chapter6_Day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：在方法的声明处：显式的抛出该异常对象的类型
 * 格式：如public static void method2() throws IOException, FileNotFoundException{}
 * 当在此方法内部出现异常的时候，会抛出一个异常的对象，抛给此方法的调用者
 * 异常的对象可以逐层向上抛，直至main中。当然，在向上抛的过程中，可以再通过try-catch-finally进行处理
 *
 * java的异常处理：抓抛模型
 * 1、抓：异常的处理，有两种方式（①try-catch-finally；②throws + 异常的类型）
 * 2、抛：一旦执行过程中，出现异常，会抛出一个异常类的对象（自动抛出VS手动抛出（throw + 异常类的对象））
 *      》手动抛出的异常类，既可以是现成的异常类，也可以是自己创建的异常类
 */
public class TestException {
    public static void main(String[] args) throws IOException {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        method3();
    }
    public static void method3(){
        try {
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException, FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("hello.txt"));
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }
}
