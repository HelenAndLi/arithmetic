package pers.helen.algorithm;

public class BinarySearchDemo1 {

    public static void main(String[] args){
//        System.out.println(find(new int[]{1, 3, 4, 5, 8, 11, 15, 60, 63, 70, 85, 90}, 63));
//                System.out.println(find(new int[]{-1, 0, 3, 5, 9, 12}, 9));
//                System.out.println(find(new int[]{2,5}, 5));
                System.out.println(find(new int[]{9}, 9));
    }

    private static int find(int[] nums, int target){
        int length = nums.length;
        if(length == 1){
            if(target == nums[0]){
                return 0;
            }
            return -1;
        }
        int midIndex = length / 2 - 1;
        int toR = 0;
        int toL = length - 1;
        while(toL >= toR){
            if(target < nums[midIndex]){
                toL = midIndex - 1;
                midIndex = (toL + toR) / 2;
            }else if(target > nums[midIndex]){
                toR = midIndex + 1;
                midIndex = (toL + toR) / 2;
            }else{
                return midIndex;
            }
        }
        return -1;
    }
}
