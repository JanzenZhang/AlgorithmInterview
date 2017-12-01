package com.array;

public class RemoveDuplicatedElement26 {

    public int removeDuplicates(int[] nums) {

        int k = 0; //[0..k]中没有重复元素

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k])
                nums[++k] = nums[i];  //将非重复元素直接添加在nums[k+1]
        }


        return ++k;

    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println((new RemoveDuplicatedElement26()).removeDuplicates(arr));
    }


}
