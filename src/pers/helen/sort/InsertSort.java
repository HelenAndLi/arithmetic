package pers.helen.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args){
        int[] arr = new int[]{5, 7, 6, 1, 9, 8, 4, 3, 2, 5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int[] newArr = new int[arr.length];
        // 新序列已填入元素最大下标
        int currentIndex = 0;
        newArr[0] = arr[0];
        for(int j = 1; j < arr.length; j++){
            int index = 0;
            // 忽略新序列中比自己小的
            while(newArr[index] <= arr[j] && index <= currentIndex){
                index++;
            }
            // 如果自己插入位置之后已经有数据，就把这些数据统统后移
            if(index <= currentIndex){
                for(int i = currentIndex; i >= index; i--){
                    newArr[i + 1] = newArr[i];
                }
            }
            newArr[index] = arr[j];
            currentIndex++;
        }
        return newArr;
    }
}
