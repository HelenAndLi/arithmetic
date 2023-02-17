package pers.helen.sort;

import java.util.Arrays;

/**
 * 计数排序
 */
public class CountSort {

    public static void main(String[] args){
        int[] arr = new int[]{5, 7, 6, 1, 9, 8, 3, 2, 6, 9, 5, 5};
        System.out.println(Arrays.toString(sort(arr)));

        System.out.println(3/2);
    }

    private static int[] sort(int[] arr){
        int min = arr[0];
        int max = arr[0];
        // 1、找出数组中的最大最小值
        for(int element : arr){
            if(element < min){
                min = element;
            }
            if(element > max){
                max = element;
            }
        }
        // 2、遍历数组  1,3,4  4-1=3
        int[] temp = new int[max - min + 1];
        for(int element : arr){
            temp[element - min] = temp[element - min] + 1;
        }
        int i = 0;
        for(int j = 0; j < temp.length; j++){
            for(int k = 0; k < temp[j]; k++){
                arr[i++] = j + min;
                if(i == arr.length){
                    return arr;
                }
            }
        }
        return arr;
    }
}
