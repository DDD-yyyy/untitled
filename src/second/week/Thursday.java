package second.week;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Thursday {
    /*-----------------------------力扣两数之和----------------------------------------------
    //双层循环：
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //先确定第一个下标a，然后向后遍历和b相加，判断和，如果true，输出【a,b】，false,继续循环
            int[] arr = new int[2];
            for (int a = 0; a < nums.length; a++) {
                for (int b = a + 1; b < nums.length; b++) {
                    if (nums[a] + nums[b] == target) {
                        System.out.print("[" + a + "," + b + "]");
                        arr[0] = a;
                        arr[1] = b;
                        return arr;
                    } else
                        continue;
                }
            }
            return arr;
        }
    }
-------------------------------------------------------------------------*/



    /*-----------------------哈希表练习----------------------------------------
    public static void main(String[] args) {
        //统计数组中每个数字出现的次数
        Scanner scanner=new Scanner(System.in);
        //创建数组
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        Map<Integer,Integer> countmap=new HashMap<>();
        for(int num:arr){
           countmap.put(num,countmap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:countmap.entrySet()){
            System.out.println("数字"+entry.getKey()+"出现了"+entry.getValue()+"次");
        }
    }
    -----------------------------------好难啊记不住啊------------------------------------------------------------------*/


    /*----------------------用哈希表完成两数之和--------------------------------------------------------------
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=3;
        int[] brr=twoSum(arr,target);
        System.out.print("["+arr[0]+","+arr[1]+"]");
    }
    public static int[] twoSum(int[] arr,int target){
        //创建一个map存储数字和它对应的下标
        Map<Integer,Integer> map=new HashMap<>();
        //
        for(int i=0;i<arr.length;i++){
            int complements=target-arr[i];
            if(map.containsKey(complements)){
                return new int[]{map.get(complements),i};
            }
            map.put(arr[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    ----------------------------------------------------------hash万岁-----------------------------------*/
}
