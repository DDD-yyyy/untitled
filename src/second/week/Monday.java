package second.week;



import java.util.Random;
import java.util.Scanner;

public class Monday {
    //----------------------------------------打印九九乘法表-------------------------------------------------
    /*public static void main(String[] args) {

        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print( i+"*"+j+"="+i*j+"\t");
            }  System.out.println();
        }
    }
    //制表符：在前面的字符后面补充1~4个空格，让这个整体的长度凑成4的整数倍
    ----------------------------------------------------------------------------------------------------------*/
    /*------------------------------------------查找数组中的数据------------------------------------------------
    public static void main(String[] args) {
        int arr[]={33,5,22,44,55,33};
        //键盘录入一个数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数据");
        int data = scanner.nextInt();
        for(int i=0;i<=arr.length-1;i++){
            if(data==arr[i]){
                System.out.print("找到了，索引是"+i);
                return;
            }
            if(i==5&&data!=arr[i]){
                System.out.print("不存在该数字");
            }

        }

    }------------------------------------------------------------------------------------------------------------*/
/*--------------------------------------find the biggest number in arr[]--------------------------------------------------
    public static void main(String[] args) {
        int arr[]={33,5,22,44,55,33};
        int max =arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max)
            {max=arr[i];}
    }
        System.out.print("最大值是"+max);
    }
}
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------打乱数组------------------------------------------------------------------
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    Random r=new Random();
    for(int i=0;i<=arr.length-1;i++){
        int randomIndex=r.nextInt(arr.length);
        int index=arr[i];
        arr[i]=arr[randomIndex];
        arr[randomIndex]=index;
    }
    for(int j=0;j<=arr.length-1;j++){
        System.out.print(arr[j]+" ");
    }
}

------------------------------------------------------------------------------------------*/

  //  ----------------------------------向数组插入不存在的数字-----------------------------
  public static void main(String[] args) {
      int[] arr = new int[10];  // ✅ 创建长度为 10 的数组，默认值全是 0
      Random r=new Random();
      int count=0;
      for(int i=0;i<=arr.length-1;){
          int num=r.nextInt(i);
          for(int j=0;j<=i;j++){
              if(num==arr[j]){
                  count++;
                  break;
              }
              if(count==0){
                  arr[i]=num;
                  i++;
              }
          }
      }


  }






}


