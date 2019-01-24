package Chapter8_Day14;

public class TestCustomerDAO {
    public static void main(String[] args) {
        CustomerDAO c = new CustomerDAO();
        c.add(new Customer());
        c.delete(0);
        c.get(0);
        c.delete(5);
    }
}
