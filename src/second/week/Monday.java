package second.week;

public class Monday {
    public static void main(String[] args) {
      //打印九九乘法表
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print( i+"*"+j+"="+i*j+"\t");
            }  System.out.println();
        }

    }
}
 //制表符：在前面的字符后面补充1~4个空格，让这个整体的长度凑成4的整数倍


