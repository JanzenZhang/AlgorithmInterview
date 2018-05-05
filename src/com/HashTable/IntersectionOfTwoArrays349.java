package com.HashTable;

import java.util.TreeSet;

public class IntersectionOfTwoArrays349 {


    public int[] intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> record = new TreeSet<>();

        for (int i = 0; i < nums1.length; i++) {
            record.add(nums1[i]);
        }

        TreeSet<Integer> resultSet = new TreeSet<>();
        for (int num2 : nums2) {
            if (record.contains(num2)) {
                resultSet.add(num2);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;

    }

}
