package Chapter4;

public class OrderA {
    public static void main(String[] args) {
        Order o=new Order();
//        o.orderName;//无法调用private
        o.orderDesc="ASD";
        o.orderID=12;
        o.orderNum=36;

    }
}
