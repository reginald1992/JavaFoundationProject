package exer;

public class TestBoy {
    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.setName("赈早见琥珀主");
        boy.setAge(25);

        Girl girl=new Girl();
        girl.setName("千寻");

        boy.marry(girl);
        boy.shout();
        System.out.println();
        girl.marry(boy);
    }
}
