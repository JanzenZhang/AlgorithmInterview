package com.array;

public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
        int k = 0; //[0...k)中没有制定元素
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val)
                swap(nums, k++, i);


        }

        return k;
    }


    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 1};

        System.out.println((new RemoveElement27()).removeElement(arr, 1));
    }
}
