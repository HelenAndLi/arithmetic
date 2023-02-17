package pers.helen.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args){
        int[] arr = new int[]{5, 7, 6, 1, 9, 8, 4, 3, 2, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int startIndex, int endIndex){
        if(startIndex == endIndex){
            // 直到只有一个元素
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        //        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, startIndex, endIndex + 1)));
        //        System.out.println(mid);
        sort(arr, startIndex, mid);
        sort(arr, mid + 1, endIndex);
        merge(arr, startIndex, mid, mid + 1, endIndex);
    }

    public static void merge(int arr[], int lStart, int lEnd, int rStart, int rEnd){
        System.out.println("merge l:" + Arrays.toString(Arrays.copyOfRange(arr, lStart, lEnd + 1)));
        System.out.println("merge r:" + Arrays.toString(Arrays.copyOfRange(arr, rStart, rEnd + 1)));
        int ai = lStart;
        int i = lStart;
        int j = rStart;
        int[] temp = Arrays.copyOf(arr, arr.length);

        while(i <= lEnd && j <= rEnd){

            // 如果左数组元素大于右数组元素
            System.out.println("i=" + i + ", j=" + j + ", ai=" + ai);
            if(temp[i] > temp[j]){
                // 则让右数组这位提上来，同时右数组下标和结果数组下标移动一位
                arr[j] = temp[i];
                arr[ai++] = temp[j++];
                // 原来被覆盖的左数组元素放到原右数组的位置上来
            }else{
                arr[ai] = temp[j];
                arr[ai++] = temp[i++];
            }
            System.out.println("ing:" + Arrays.toString(arr));
        }
        while(i <= lEnd){
            arr[ai++] = temp[i++];
        }
        while(j <= rEnd){
            arr[ai++] = temp[j++];
        }
        System.out.println("get:" + Arrays.toString(arr));
        return;

    }
}
