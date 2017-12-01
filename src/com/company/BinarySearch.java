package com.company;

public class BinarySearch {


    private BinarySearch(){}

    public static int binarySearch(Comparable[] arr, int n, Comparable target){

        int l=0, r = n; //在[l....r)中寻找target
        while (l<r){
            int mid = l + (r-l)/2;
            if(arr[mid].compareTo(target) == 0)
                return mid;
            if(target.compareTo(arr[mid]) < 0)
                r = mid; //在[l....mid)中寻找target
            else
                l = mid +1;//在[mid+1.....r)中寻找target

        }

        return -1;

    }

    public static void main(String[] args) {

        int n = (int)Math.pow(10, 6);
        Integer data[] = Util.generateOrderedArray(n);

        long startTime = System.currentTimeMillis();
        for(int i = 0 ; i < n ; i ++)
            if(i != binarySearch(data, n, i))
                throw new IllegalStateException("find i failed!");
        long endTime = System.currentTimeMillis();

        System.out.println("Binary Search test complete.");
        System.out.println("Time cost: " + (endTime - startTime) + " ms");
    }

}
