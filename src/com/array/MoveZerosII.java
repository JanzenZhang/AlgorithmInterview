package com.array;

public class MoveZerosII {

    public void moveZeroes(int[] nums) {

        int k = 0; //[0...k)中存放非0元素
        for(int i= 0; i< nums.length; i++){
            if(nums[i]!=0){

                nums[k++] = nums[i];
            }
        }

        for(int i =k; i< nums.length; i++){
            nums[i]=0;
        }



    }


    public static void main(String args[]){

        int[] arr = {0, 1, 0, 3, 12};

        (new MoveZeros283()).moveZeroes(arr);

        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
