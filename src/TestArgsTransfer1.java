/**
 * Created by shuli on 2017/7/14.
 * 实现值交换的正确方法
 */
public class TestArgsTransfer1 {
    public static void main(String[] args) {
        TestArgsTransfer1 tt=new TestArgsTransfer1();
        DataSwap ds=new DataSwap();
        System.out.println("ds.i="+ds.i+"\t"+"ds.j="+ds.j);

        tt.swap(ds);
        System.out.println("ds.i="+ds.i+"\t"+"ds.j="+ds.j);
    }
    public void swap(DataSwap d){
        int temp=d.i;
        d.i=d.j;
        d.j=temp;

    }
}

class DataSwap{
    int i=10;
    int j=5;
}
