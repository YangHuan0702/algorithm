package com.halosky.algorithm.array;

import java.util.Arrays;

/**
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * <p>
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * <p>
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素
 */
public class Solution_167 {

    public static void main(String[] args) {

        int[] nums = new int[]{15, 7, 11, 2};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }


    public static int[] twoSum(int[] numbers, int target) {

        int[] r = new int[2];

        int i = 0, j = numbers.length - 1;
        while (i < numbers.length && j < numbers.length) {
            if (j == i) {
                j = numbers.length - 1;
                i++;
            } else if (numbers[i] + numbers[j] == target) {
                r[0] = i + 1;
                r[1] = j + 1;
                return r;
            } else {
                j--;
            }
        }
        return r;
    }

}
