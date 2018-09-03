package Chapter6_Day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：在方法的声明处：显式的抛出该异常对象的类型
 * 格式：
 * */
public class TestException {
    public static void main(String[] args) throws IOException {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException, FileNotFoundException{
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("hello.txt"));
        int b;
        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
