package com.array;

public class RemoveDuplicatedElement80 {


    public int removeDuplicates(int[] nums) {

        int k = 1;//[0...k]中没有重复元素
        if (nums.length < 3)
            return nums.length;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[k - 1])     //比较时只需要和k的前一个元素进行比较，这里面包含了重复与不重复两种情况
                nums[++k] = nums[i];

        }

        return ++k;

    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println((new RemoveDuplicatedElement80()).removeDuplicates(arr));
    }

}
