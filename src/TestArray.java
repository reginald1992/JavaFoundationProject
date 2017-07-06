/**
 * Created by Shulin Liu on 2017/7/5 0005.
 */
public class TestArray {
    public static void main(String[] args){
        System.out.println("HelloWorld");
//        1.如何定义一个数组
//        数组一旦初始化，其长度不可变
//        1.1数组的声明
        String[] names;
        int[] scores;
        /*1.2初始化
        * 第一种：静态初始化：初始化数组的同时给数组赋值
        * 第二种：动态初始化：初始化数组与赋值分开进行
        * */
        names = new String[]{"张三","李四","赵五"};
        scores = new int[4];
//       调用相应的数组元素，通过数组元素的小角标的方式来调用
//        注意：下角标从0开始，到n-1结束，n表示数组的长度
        scores[0]=87;
        scores[1]=77;
        scores[2]=99;
        scores[3]=48;
        System.out.println(scores[0]);
        System.out.println(names[0]);
//        数组的长度可以用length
        System.out.println(names.length);
        System.out.println(scores.length);
//        遍历数组需要用循环
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        for(int j=1;j<10;j++){
            if (j%4==0){
                break;
//                continue;
//                break;是跳出整个循环，continue是跳出此次循环，不执行动作；注意使用时的区别
            }
            System.out.println(j);
        }
//        对于基本数据类型对象创建的数组：byte,short,int,long,float,double,char,boolean
//        1、对于byte,short,int,long而言,默认的值是0
        int[] scores1=new int[4];
        scores1[0]=58;
        scores1[1]=25;
        scores1[3]=27;
        for(int i=0;i<scores1.length;i++){
            System.out.println(scores1[i]);
        }
//        2、对于float,double而言,默认的值是0.0
        double[] scores2=new double[4];
        scores2[0]=58;
        scores2[1]=25;
        scores2[3]=27;
        for(int i=0;i<scores2.length;i++){
            System.out.println(scores2[i]);
        }

//        3、对于char而言,默认的值是空格
        char[] scores3=new char[4];
        scores3[0]='A';
        scores3[1]='d';
        scores3[3]='w';
        for(int i=0;i<scores3.length;i++){
            System.out.println(scores3[i]);
        }
//        4、对于boolean而言,默认的值是false
        boolean[] scores4=new boolean[4];
        scores4[0]=true;
        scores4[1]=false;
        scores4[3]=true;
        for(int i=0;i<scores4.length;i++){
            System.out.println(scores4[i]);
        }
//        5、对于引用类型的变量构成的数组而言，默认的初始化值为null
        String[] names1=new String[4];
        names1[0]="Jim";
        names1[1]="Lucy";
        names1[3]="Anny";
        for(int i=0;i<names1.length;i++){
            System.out.println(names1[i]);
        }

        class Pritimive{
            boolean[] t=new boolean[3];
    }
    Pritimive d=new Pritimive();
        d.t[0]=true;
        d.t[2]=true;
        for(int i=0;i<d.t.length;i++){
            System.out.println(d.t[i]);
        }



    }
}
