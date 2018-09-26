package Chapter4_3;

/**
 * Junit单元测试类
 * 1、当前工程下-增加Libraries--Junit
 * 2、在主类中，创建一个空参的无返回值的方法，用于代码的测试。如public void test1()
 * 3、导入import org.junit.Test
 * 4、在test1()中编写测试的方法
 * 5、测试：双击方法名，右键run as -junit Test即可
 * */
public class TestJunit {
    public static void main(String[] args) {
        String str = "AA";
        System.out.println(str);
    }
    public void test1(){
        String str = "AA";
        System.out.println(str);
    }
    public void m1(){
        System.out.println("Hello World");
    }
}
