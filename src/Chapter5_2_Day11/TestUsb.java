package Chapter5_2_Day11;

public class TestUsb {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.doWork(new Printer());

        Flash f = new Flash();
        c.doWork(f);

//        实现接口的匿名类的对象
        Usb phone = new Usb(){
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止连接");
            }
        };
        c.doWork(phone);
    }
}

interface Usb{
//    Usb的尺寸的大小，可以设置成常量

//    功能设置成抽象方法
    void start();
    void stop();
}

class Computer{
    public void doWork(Usb usb){
        usb.start();
        System.out.println("===此设备开始工作===");
        usb.stop();
    }
}

class Flash implements Usb{
    public void start(){
        System.out.println("USB start");
    }

    public void stop(){
        System.out.println("USB stop");
    }
}

class Printer implements Usb{
    public void start(){
        System.out.println("打印机开始工作");
    }

    public void stop(){
        System.out.println("打印机停止工作");
    }
}