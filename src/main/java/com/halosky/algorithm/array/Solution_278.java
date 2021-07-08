package com.halosky.algorithm.array;

public class Solution_278 {

    public static void main(String[] args) {

    }


    public int firstBadVersion(int n) {
        int left = 1,right = n;
        while (left < right){
            int cent = left + (right - left) / 2;
            if(isBadVersion(cent)){
                right = cent;
            }else{
                left = cent+1   ;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version){
        return true;
    }
}
