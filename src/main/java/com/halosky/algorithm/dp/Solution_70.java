package com.halosky.algorithm.dp;

/**
 * 0
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 */
public class Solution_70 {


    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }


    public static int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        int a = 1, b = 0, r = 0;
        for (int i = 1; i <= n; i++) {
            r = a + b;
            b = a ;
            a = r;
        }
        return r;

    }


}
