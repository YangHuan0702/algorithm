package com.halosky.algorithm.array;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class Solution_977 {

    public int[] sortedSquares(int[] nums) {
        int[] b = new int[nums.length];
        int bi = nums.length -1;

        for(int i =0,j = nums.length-1;i <= j; ){
            int ii = nums[i] * nums[i];
            int jj = nums[j] * nums[j];

            if(ii >= jj){
                b[bi --] = ii;
                i++;
            }else{
                b[bi --] = jj;
                j --;
            }
        }
        return b;
    }
}
