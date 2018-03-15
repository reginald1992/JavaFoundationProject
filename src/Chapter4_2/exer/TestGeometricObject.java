package Chapter4_2.exer;
/**
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 */
public class TestGeometricObject {
    public static void main(String[] args) {
        TestGeometricObject t = new TestGeometricObject();
        Circle c1 = new Circle(2.6,"Green",1.1);
        Circle c2 = new Circle(2.6, "Red", 1.6);
        MyRectangle m = new MyRectangle(1.2,2.3,"Blue", 2.4);

        t.displayGeometricObject(c2);
        boolean b1 = t.equalsArea(c1,c2);
        System.out.println(b1);
        boolean b2 = t.equalsArea(c1,m);
        System.out.println(b2);

    }

//    判断两个对象的面积是否相等
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println("面积为:"+g.findArea());
    }
}
