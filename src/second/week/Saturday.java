package second.week;

import java.util.Scanner;

public class Saturday {
    /*-----------java方法练习作业-------------------------------------------
    public static void main(String[] args) {
        //用键盘录入五个整数存入数组，枫树超过范围需要重新录入
        int[] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        int i=0;
        for (i = 0; i <= 4; ) {
          arr[i] = sc.nextInt();
            if(arr[i]<0||arr[i]>100)
            {
                System.out.print("请重新输入一次");
                continue;
            }
                i++;
        }
        //定义方法求最大值和最小值
        int Max=getMax(arr);
        int Min=getMin(arr);
        //计算总分
        int sum=0;
        for(i=0;i<=4;i++){
            sum+=arr[i];
        }
        sum=sum-Max-Min;
        int average=sum/3;
        System.out.print(average);
    }
    public static int getMax(int[] arr){
        int i=0;
        int max=arr[i];
        for(i=1;i<=4;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int getMin(int[] arr){
        int i=0;
        int min=arr[i];
        for(i=1;i<=4;i++){
            if(arr[i]<min)
                min=arr[i];
    }
        return min;
    }
---------------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        
    }
}