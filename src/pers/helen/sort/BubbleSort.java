package pers.helen.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] list = new int[]{5,1,8,4,3,2,9};

        for(int i = 0; i < list.length - 1; i++){
            for(int j = i + 1; j < list.length; j++){
                if(list[i]>list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
