package Chapter5_2_Day10;
/**
 * 类的第四类成员：初始化块（or 代码块）
 *1、代码块如果有修饰的话，那么只能使用static。
 * 2、分类：
 * 静态代码块：
 *
 * 非静态代码块：
 *（1）可以对类的属性进行初始化操作
 * （2）里面可以有输出语句
 * （3）一个类中可以有多个非静态的代码块，多个代码块之间按照顺序结构执行
 * （4）每创建一个类的对象，非静态代码块都加载一次
 * （5）非静态代码块的执行要早于构造器
 *
 * 关于属性赋值的操作：（1）默认的初始化（2）显式的初始化（3）构造器（4）通过方法对对象的相应属性进行修改
 * */
public class TestOrder {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1);

        System.out.println();

        Order o2 = new Order();
        System.out.println(o2);

    }
}

class Order{
    private int orderId = 1001;
    public Order() {
        super();
        System.out.println("我是Order空参的构造器");
    }

    //初始化块
    private String orderName;

    {
        orderId = 1002;
        orderName = "AA";
        System.out.println("我是非静态代码块1");
    }

    {
        orderId = 1003;
        System.out.println("我是非静态代码块2");
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
