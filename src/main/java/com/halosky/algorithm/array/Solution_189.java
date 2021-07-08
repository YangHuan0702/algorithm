package com.halosky.algorithm.array;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Solution_189 {

    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,4,5,6,7};
//        rotate2(nums,3);
//        System.out.println(Arrays.toString(nums));
        System.out.println(14 % 3);
    }


    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }


    /**
     * 理解错意思了
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k-nums.length;
        }
        for (int i=0,j = nums.length - k;i < k;i++,j++){
            int ii = nums[i];
            int jj = nums[j];
            nums[i] = jj;
            nums[j] = ii;
        }
    }
}
