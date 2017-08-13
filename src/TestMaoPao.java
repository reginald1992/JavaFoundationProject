import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Shulin Liu on 2017/7/6 0006.
 */
public class TestMaoPao {
    public static void main(String[] args){
        int [] arr=new int[]{10,96,-58,63,18,-47,69,56,29,-97};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
             if (arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
            }
        }
//        直接选择排序方法
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
//        优化直接选择排序方法
        for(int i=0;i<arr.length-1;i++){
            int t=i;//默认i是最小的
            for(int j=i;j<arr.length;j++){
                if(arr[t]>arr[j]){
                    //一旦在i之后发现存在比其小的元素，记住这个元素
                 t=j;
                }
            }
            if(t!=i){
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
            }
        }
        Arrays.sort(arr);//直接使用JDK的排序class


        System.out.println("排序以后的数组：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
