package Chapter4_2;

public class Woman extends Person{
    private boolean isBeauty;

    public boolean isBeauty() {
        return isBeauty;
    }

    public void setBeauty(boolean beauty) {
        isBeauty = beauty;
    }

    public Woman() {
    }

    public Woman(boolean isBeauty) {
        this.isBeauty = isBeauty;
    }

    public void walk(){
        System.out.println("女人走路");
    }

    public void eat(){
        System.out.println("女人吃饭");
    }

    public void shopping(){
        System.out.println("女人爱购物");
    }
}
