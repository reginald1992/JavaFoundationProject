package Chapter1_3;

/**
 * Created by Shulin Liu on 2017/7/7 0007.
 */

public class ArrayUtil {
//* 求数组的最大值
    public int getMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
//* 求数组的最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
//* 遍历数组元素
    public void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("]"+"\n");
    }
//* 求数组的平均数
    public int avg(int[] arr){
        int sum=getSum(arr);
        return sum/arr.length;
    }
//* 求数组的总和
    public int getSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
//* 数组的反转
    public int[] reverse(int[] arr){
        for(int x=0,y=arr.length-1;x<y;x++,y--){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        return arr;
    }
//* 实现数组的复制
    public int[] copy(int[] arr){
        int[] arr1=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
//* 对数组进行排序
    public void sort(int[] arr,String decs){
        if(decs== "asc"){
        for(int i=0;i<arr.length-1;i++){
            int t=i;//默认i是最小的
            for(int j=i;j<arr.length;j++)
                if (arr[t] > arr[j]) {
                    //一旦在i之后发现存在比其小的元素，记住这个元素
                    t = j;
                }
            if(t!=i){
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
            }
        }
    }
    else if(decs=="decs"){
            for(int i=0;i<arr.length-1;i++){
                int t=i;//默认i是最大的
                for(int j=i;j<arr.length;j++)
                    if (arr[t] <arr[j]) {
                        //一旦在i之后发现存在比其大的元素，记住这个元素
                        t = j;
                    }
                if(t!=i){
                    int temp=arr[t];
                    arr[t]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        else {
        System.out.println("请输入正确的排序要求：decs为从大到小，asc为从小到大");
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[i]=temp;
    }
}
