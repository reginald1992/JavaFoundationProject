package Chapter1_3;

/**
 * Created by Shulin Liu on 2017/7/7 0007.
 */
public class TestArray3 {
    public static void main(String[] args){
        int[] arr=new int[]{-89,58,-48,29,48,39,64,91,-69,58};

        ArrayUtil au=new ArrayUtil();
        int max=au.getMax(arr);
        System.out.println("最大值为："+max);
        int avg=au.avg(arr);
        System.out.println("平均值为："+avg);
        au.printArray(arr);
        System.out.println("反转后的数组：");
        au.reverse(arr);
        au.printArray(arr);
        au.sort(arr,"decs");
        au.printArray(arr);


    }

}
