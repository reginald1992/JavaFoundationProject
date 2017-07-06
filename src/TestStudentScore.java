import java.util.Scanner;

/**
 * Created by Shulin Liu on 2017/7/5 0005.
 */
public class TestStudentScore {
    public static void main(String[] args){
        //rrrr
        /*1、创建Scanner的对象，并从键盘获取学生的个数
        2、根据输入的学生个数，创建对应长度的int型数组
        3、依次从键盘获取n个学生的成绩，并赋予相应的数组元素，并获取最高分
        4、遍历学生的成绩数组，并根据学生成绩与最高分的差值，赋予相应的等级
        */
        Scanner in= new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int count=in.nextInt();
        int maxScore=0;
        System.out.println("请输入"+count+"个学生的成绩：");
        int[] scores=new int[count];
        for(int i=0;i<count;i++){
            int score= in.nextInt();
            scores[i]=score;
            if(scores[i]>maxScore){
                maxScore=scores[i];
            }
        }
        System.out.println("最高分为："+maxScore);
        for(int i=0;i<scores.length;i++){
            char level;
            if (scores[i]>=maxScore-10){
                level='A';
            }
            else if (scores[i]>=maxScore-20){
                level='B';
            }
           else if (scores[i]>=maxScore-30){
                level='C';
            }
            else{
                level='D';
            }
            System.out.println("student"+i+"'s score is "+scores[i]+" and grade is "+level);
            }
        }
    }

