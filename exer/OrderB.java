package exer;

import Chapter4.Order;

public class OrderB {
    public static void main(String[] args) {
        Order o=new Order();
        o.orderDesc="JNHM";
    }
}

class Order1 extends Order{
    public void method5(){
        orderNum=1002;
        method3();
        method4();//IDEA出现提示的才能获取到
    }
}
