package com.halosky.algorithm.array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class Solution_35 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums[nums.length -1 ] < target){
            return nums.length;
        }
        int left = 0,right  = nums.length -1;
        int r = 0;
        while (left <= right){
           int mid = left + (right - left) / 2;
           if(target == nums[mid]){
               return mid;
           }
           if(target < nums[mid]){
               r = mid;
               right = mid - 1;
           }else{
               left = mid + 1;
           }
        }

        return r ;
    }

}
