package com.halosky.algorithm.dp;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 */
public class Solution_509 {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }


    public static int fib2(int n) {
        if(n < 2){
            return n;
        }
        int i = 1,j=0,r = 1;
        for (int t = 2; t<= n;t++){
          r = i + j;
          j = i;
          i = r;
        }
        return r;
    }


    /**
     * 递归
     * @param n
     * @return
     */
    public static int fib(int n) {
        if(n < 2){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
