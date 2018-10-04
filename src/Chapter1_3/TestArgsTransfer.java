package Chapter1_3; /**
 * Created by shuli on 2017/7/13.
 */
/**
* 方法的参数传递（重点、难点）
 *1、形参：方法声明的时候，小括号内的参数
 *   实参：调用方法时，实际传入的参数
 *2、规则：Java中的参数传递机制：值传递机制
 * 1）形参是基本数据类型的：将实参的值传递给形参的基本数据类型的变量
 * 2）形参是应用数据类型的：将实参的引用类型变量的值（对应的堆空间的对象实体的首地址值）传递给形参的引用类型变量
 *
* */
public class TestArgsTransfer {
    public static void main(String[] args) {
        TestArgsTransfer tt=new TestArgsTransfer();

        int i=10;
        int j=1;
        System.out.println("i:"+i+"\t"+"j:"+j);

//        int temp=i;
//        i=j;
//        j=temp;
        tt.swap(i,j);//将i 的值传递给m
        System.out.println("i:"+i+"\t"+"j:"+j);//这里打印的i和j仍然是之前的，并没有因为互换函数的原因而发生变化
    }
    //定义一个方法，交换两个变量的值
    public void swap(int m,int n){
        int temp=m;
        m=n;
        n=temp;
        System.out.println("m:"+m+"\t"+"n:"+n);
    }
}
