package com.array;

public class SortColor75 {

    public void sortColors(int[] nums) {    //三路快排思路

        int zero = -1; //[0...zero]中都是0
        int two = nums.length; //[two...n-1]中都是2

        for (int i = 0; i < two; ) {

            if (nums[i] == 1)
                i++;
            else if (nums[i] == 2) {
                two--;
                swap(nums, two, i);

            } else {
                zero++;
                swap(nums, zero, i);
                i++;
            }


        }

    }


    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    public void sortColorsII(int[] nums) {      //计数排序

        int[] count = {0, 0, 0};
        for (int i = 0; i < nums.length; i++) {

            count[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count[0]; i++)
            nums[index++] = 0;
        for (int i = 0; i < count[1]; i++)
            nums[index++] = 1;
        for (int i = 0; i < count[2]; i++)
            nums[index++] = 2;


    }
}
