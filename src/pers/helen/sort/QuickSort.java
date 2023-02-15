package pers.helen.sort;

import java.util.Arrays;

/**
 * 快排
 */
public class QuickSort {

    public static void main(String[] args){
        int[] arr = new int[]{5, 7, 6, 1, 9, 8, 4, 3, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        // 可以看做一个向右移动的指针，就是从待排数组头部向后移动，寻找比基数大的数
        int toRight = start;
        // 一个向左移动的指针，就是从待排序列尾部向前移动，寻找比基数小的数
        int toLeft = end;
        int pivot = arr[start]; //这里基数我选的是当前待排数组片段的第一个
        // 直到两个指针相遇
        while(toRight <= toLeft){
            // 向右指针先移动，找到比基数大的数
            while(arr[toRight] < pivot){
                ++toRight;
            }
            // 向左指针后移动，找到比基数小的数
            while(arr[toLeft] > pivot){
                --toLeft;
            }
            // 如果两个指针交叉了，则需跳出循环
            if(toRight <= toLeft){
                int tmp = arr[toRight];
                arr[toRight] = arr[toLeft];
                arr[toLeft] = tmp;
                ++toRight;
                --toLeft;
            }
        }
        quickSort(arr, start, toLeft); // while结束条件left>right
        quickSort(arr, toRight, end);
    }
}
