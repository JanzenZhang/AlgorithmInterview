package com.array;

public class MoveZeroIII {

    public void moveZeroes(int[] nums) {

        int k = 0; //[0...k)中为非0元素

        //保证[0...i]中的非0元素都排在[0...k)中
        //[k...i]中为0
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                if (i != k)
                    swap(nums, k++, i);
                else
                    k++;
            }

        }

    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String args[]) {

        int[] arr = {0, 1, 0, 3, 12};

        (new MoveZeros283()).moveZeroes(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
