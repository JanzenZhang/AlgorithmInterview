package com.array;

import java.util.ArrayList;

public class MoveZeros283 {

    public void moveZeroes(int[] nums) {

        ArrayList<Integer> nonZeroElements = new ArrayList<>();

        for(int i=0; i< nums.length; i++){

            if(0 != nums[i])
            nonZeroElements.add(nums[i]);
        }

        for(int i=0; i< nonZeroElements.size(); i++){
            nums[i] = nonZeroElements.get(i);

        }

        for(int i=nonZeroElements.size(); i< nums.length; i++)
            nums[i] = 0;

    }

    public static void main(String args[]){

        int[] arr = {0, 1, 0, 3, 12};

        (new MoveZeros283()).moveZeroes(arr);

        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
