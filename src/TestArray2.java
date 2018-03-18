/**
 * Created by Shulin Liu on 2017/7/5 0005.
 */
public class TestArray2 {
    public static void main(String[] args){
        int[] scores1=new int[10];
        int[][] scores2;
        String[][] names;
//        1、二维数组的初始化
        scores2= new int[][]{{1,2,3},{3,4,5},{5,6,7}};//静态初始化

        names = new String[3][2];//动态初始化的方式一
        names=new String[4][];
        names[0]=new String[5];
        names[1]=new String[2];
        names[2]=new String[3];
    }
}
