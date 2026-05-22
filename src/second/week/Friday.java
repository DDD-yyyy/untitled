package second.week;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Friday {
    /*----------------------罗马数字转整数--哈希表-----------------------------------
    //解题思路：创建一个哈希表，将罗马数字和数值一一对应，
    // 如果输入的罗马数字只有两位，判断左边和右边的大小。左边大于右边：左加右，左边小于右边，右减左
    // //在其他普通情况下都是进行加法运算，用哈希表将数值取出来进行相加。
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        sc.close();
        int num=0;
        if(line.length()==2){
        char left=line.charAt(0);
        char right=line.charAt(1);
        if(map.get(left)>map.get(right)){
            num=map.get(left)+map.get(right);
        }
        else
            num=map.get(left)-map.get(right);
        }
        else{
        int len=line.length();
        for(int i=0;i<len;i++){
            num=num+map.get(line.charAt(i));
        }
    }
        System.out.print(num);
    }
----------------------------------------只能判断字符是两位的情况下的特殊情况，解决方法思考有问题--------------------------*/


    /*解决方法进化：应该用循环的方法，从右往左把字符串遍历一遍，比大小来决定加减，这样就考虑到了超过两位字符的情况
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int pre=0;int cur=0;
        for(int i=s.length()-1;i>=0;i--){
            cur=map.get(s.charAt(i));
            if(pre>cur)
            { num-=cur;}
            else
            { num+=cur;}
            pre=cur;
        }
        System.out.print(num);
    }

----------------------------------------------可以的可以的功夫不负有心人-------------*、

}
