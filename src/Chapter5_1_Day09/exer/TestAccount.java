package Chapter5_1_Day09.exer;
/**
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 * */
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("asbf123", 1000);
        Account a2 = new Account("dsjlsdjfls", 2000);
        Account a3 = new Account("sjdkf", 3000);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}

class Account{
    private int id;
    private String password;
    private double balance;
    private static double rate = 0.05;
    private static double minBalance = 100;
    private static int init = 1000;

    public Account(String password, double balance){
        this.password = password;
        this.balance = balance;
        this.id = init++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}