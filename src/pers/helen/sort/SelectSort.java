package pers.helen.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args){
        int[] arr = new int[]{5, 7, 6, 1, 9, 8, 4, 3, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < min){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
