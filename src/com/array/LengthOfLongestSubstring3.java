package com.array;

/*
在滑动窗口中做记录
 */

public class LengthOfLongestSubstring3 {
    public int lengthOfLongestSubstring(String s) {

        int l = 0, r = -1;//[l...r]滑动窗口
        int res = 0;
        int[] freq = new int[256];   //利用一个辅助数组来记录是否重复


        // 整个循环从 l == 0; r == -1 这个空窗口开始
        // 到l == s.size(); r == s.size()-1 这个空窗口截止
        // 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
        while (l < s.length()) {
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)]++;
            } else {                   //不能执行if语句，那就说明还有重复元素，l右移，不断缩小区间长度，这句话得好好体会

                freq[s.charAt(l)]--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;

    }
}
