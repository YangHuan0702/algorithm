package com.halosky.algorithm.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Solution_217 {

    public static void main(String[] args) {
        Set set = new HashSet<>();

        int[] nums = new int[]{1,2,1,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate2(int[] nums) {
        Set set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }

    public static boolean containsDuplicate(int[] nums) {
        for(int i=0,j=nums.length-1;i < nums.length;){
            if(i == j){
                j = nums.length-1;
                i++;
                continue;
            }
            if(nums[i] == nums[j]){
                return true;
            }else{
                j--;
            }
        }
        return false;
    }
}
