package com.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class IntersectionOfTwoArrays350 {


    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> record = new HashMap<>();

        for (int num : nums1) {
            if (!record.containsKey(num))
                record.put(num, 1);
            else
                record.put(num, record.get(num) + 1);
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : nums2) {
            if (record.containsKey(num) && record.get(num) > 0) {
                resultList.add(num);
                record.put(num, record.get(num) - 1);

            }
        }


        int index = 0;
        int[] result = new int[resultList.size()];
        for (int num : resultList) {
            result[index++] = num;
        }

        return result;

    }

}
