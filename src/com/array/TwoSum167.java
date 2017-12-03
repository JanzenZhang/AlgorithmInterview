package com.array;

public class TwoSum167 {

    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                int[] res = {l + 1, r + 1};
                return res;
            } else if (numbers[l] + numbers[r] < target)
                l++;
            else
                r--;
        }

        throw new IllegalStateException("Input has no solution");

    }

    public int[] twoSumII(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int index = binarySearch(numbers, i + 1, numbers.length - 1, target - numbers[i]); //二分查找必须限定范围，不能再整个数组中查到，否则在[1,4,4,6]这种有两个连续相同的数的情况下会存在问题

            if (index != -1 && index > i) {
                int[] res = {i + 1, index + 1};
                return res;
            }
//
//            else
//                i++;        //为啥会有这种写法，在循环体里不要改变循环变量


        }

        throw new IllegalStateException("Input has no solution");

    }

    private int binarySearch(int[] nums, int l, int r, int target) {


        while (l <= r) {

            int mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            if (target > nums[mid])
                l = mid + 1;
            else
                r = mid - 1;

        }

        return -1;

    }

    private static void printArr(int[] nums) {
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {5, 25, 75};
        int target = 100;
        printArr((new TwoSum167()).twoSumII(nums, target));
    }


}


