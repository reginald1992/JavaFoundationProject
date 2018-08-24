package Chapter5_2_Day11;

public class TestProduct {
    public static void main(String[] args) {
        TestProduct t = new TestProduct();
//        方式一：创建一个实现Product接口的类的对象，并将此对象传入方法中
        NoteBook n = new NoteBook();
        t.show(n);
//        方式二：创建一个实现Product接口的类的对象
        Product p = new Product() {
            @Override
            public void getName() {
                System.out.println("samsung");
            }

            @Override
            public void getPrice() {
                System.out.println("1000");
            }
        };
        p.getPrice();
        p.getName();

//        方式三：创建了一个实现Product接口的匿名类的匿名对象
        t.show(new Product() {
            @Override
            public void getName() {
                System.out.println("notebook2");
            }

            @Override
            public void getPrice() {
                System.out.println("6000");
            }
        });
        System.out.println();
        Product p1 = t.getProduct();
        p1.getName();
        p1.getPrice();
    }

//    局部内部类的使用
    public Product getProduct(){
//        方式一：实现Product接口的局部内部类
//        class Camera implements Product{
//            @Override
//            public void getName() {
//                System.out.println("数码相机");
//            }
//
//            @Override
//            public void getPrice() {
//                System.out.println("4000");
//            }
//        }
//        return new Camera();
//        方式二：实现Product接口的匿名局部内部类
        return new Product() {
            @Override
            public void getName() {
                System.out.println("电子书");
            }

            @Override
            public void getPrice() {
                System.out.println("500");
            }
        };
    }

    public void show(Product p){
        p.getName();
        p.getPrice();
    }
}

interface Product{
    void getName();
    void getPrice();
}

class NoteBook implements Product{
    @Override
    public void getName() {
        System.out.println("notebook");
    }

    @Override
    public void getPrice() {
        System.out.println("5000");
    }
}
