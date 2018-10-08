package Chapter6_Day12;
/**
 * 如何自定义一个异常类
 * 1、自定义的异常类继承现有的异常类
 * 2、提供一个序列号，提供几个重载的构造器
 * */
public class MyException extends Exception{

    static final long serialVersionUID = -7034897190745766939L;

    public MyException(){}

    public MyException(String message){
        super(message);
    }

}
