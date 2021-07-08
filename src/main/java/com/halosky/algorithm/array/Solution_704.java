package com.halosky.algorithm.array;

public class Solution_704 {


    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 2;
        int index= search(nums,target);
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {
        int cent = 0,left = 0,right= nums.length -1;
        while (left <= right){
            cent = left + (right - left) /2 ;
            if(target == nums[cent]){
                return cent;
            }
            if(target < nums[cent]){
                right = cent -1;
            }else{
                left = cent +1 ;
            }
        }
        return -1;
    }



}
