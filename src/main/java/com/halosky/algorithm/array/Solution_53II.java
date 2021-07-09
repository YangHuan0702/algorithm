package com.halosky.algorithm.array;

/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字
 */
public class Solution_53II {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9};
//        int[] nums = new int[]{1};
        System.out.println(missingNumber3(nums));
    }


    public static int missingNumber3(int[] nums){

        int r = 0;
        int b = nums.length - 1;
        while (r <= b){
            int mid = r + (b - r) / 2;
            if(nums[mid] > mid){
                b = mid -1;
            }else if(nums[mid] == mid){
                r ++;
            }
        }

        return r;
    }


    public static int missingNumber2(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] > m){
                r = m-1;
            }else if(nums[m] == m){
                l = m+1;
            }
        }
        return l;

    }


    public static int missingNumber(int[] nums) {
        int r = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (r != nums[i]) {
                return r;
            }
            r = nums[i] + 1;

        }
        return r;
    }

}
