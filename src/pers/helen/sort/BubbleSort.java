package pers.helen.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] arr = new int[]{5, 7, 6, 1, 9, 8, 4, 3, 2 ,5};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                // 相邻两个数做比较，较小的放前面，也就是新的arr[j+1]的当前已比较数组段中最大的，它又会去和后面一个数做比较，这样遍历完一轮就可以得到整个数组中最大的了(在当前数组段的最后)
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
