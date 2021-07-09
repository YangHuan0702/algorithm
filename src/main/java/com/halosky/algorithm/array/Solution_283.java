package com.halosky.algorithm.array;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Solution_283 {

    public static void main(String[] args) {
//        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] nums = new int[]{0, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void moveZeroes(int[] nums) {
        if (null == nums || nums.length == 1) {
            return;
        }
        int i = 0, j = 1;
        while (i < j && i < nums.length) {
            if (nums[i] == 0 && j < nums.length) {
                if (nums[j] == 0) {
                    j++;
                } else {
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                }
            } else {
                i++;
                j = i + 1;
            }
        }
    }
}
