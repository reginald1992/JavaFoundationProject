public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle t=new TriAngle();
        t.setBase(3.9);
        t.setHeight(5.8);
        System.out.println("面积为"+t.findArea());
    }
}

class TriAngle{//三角形
    private double base;
    private double height;
//  构造器
    public TriAngle(){
        this.base=1.0;
        this.height=2.0;
    }
    public TriAngle(double base,double height){
        this.base=base;
        this.height=height;
    }

    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double findArea(){
        return this.base*this.height/2;
    }
}
