package com.halosky.algorithm.dp;

/**
 * 泰波那契序列 Tn 定义如下： 
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * <p>
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值
 */
public class Solution_1137 {

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        if (n <= 2) {
            return n == 0 ? 0 : 1;
        }
        int u = 1, i = 1, p = 0;
        int r = 2;
        for (int a = 3; a <= n; a++) {
            r = u+i+p;
            p = i;
            i = u;
            u = r;
        }
        return r;
    }

}
