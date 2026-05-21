package second.week;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Random;

public class Wednesday {
    //获取10个1-200之间的随机数存入数组，要求不能重复
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(200) + 1;
            boolean flags = contains(arr, num);

            if (!flags) {
                arr[i] = num;
                i++;
            }
        }
        
        // 打印数组
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static boolean contains(int[] arr, int num) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num) {
                return true;
            }
        }
        return false;
    }
}








