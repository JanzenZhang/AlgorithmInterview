package com.array;

public class MinSubArrayLen209 {

    public int minSubArrayLen(int s, int[] nums) {

        int l = 0, r = -1; //[l...r]为滑动窗口
        int sum = 0;
        int res = nums.length + 1;

        while (l < nums.length) {  //窗口的左边界在数组内，则循环继续

            if (r + 1 < nums.length && sum < s) {
                r++;
                sum += nums[r];
            } else {

                sum -= nums[l];
                l++;
            }

            if (sum >= s)
                res = Math.min(res, r - l + 1);

        }

        if (res == nums.length + 1)
            return 0;
        return res;

    }
}
